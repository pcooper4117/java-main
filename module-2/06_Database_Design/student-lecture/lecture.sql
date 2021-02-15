---------------------------------------------------------------------------------------------------------------
--
-- DROP - remove a table and all it's data from the database
--
-- Consider referential constraints - cannot drop a parent if it has dependents
--
--      DROP TABLE table-name             - Will fail if table does not exist or if it has dependents
--
--      DROP TABLE IF EXISTS table-name   - Will run whether table exists or not; will fail if table has dependents
--
--      DROP TABLE IF EXISTS table-name  CASCADE   - Will run whether table exists or not and whether has dependents or not
--
--
--  CREATE - define a table to the database manager
--
--       CREATE TABLE table-name
--       (column-name     datßa-type    NOT NULL,
--        column-name     data-type,
--        column-name     data-type    DEFAULT   default-value,
--        column-name     data-type    UNIQUE,
--        CONSTRAINT constraint-name PRIMARY KEY (column(s)-in-table),
--        CONSTRAINT constraint-name FOREIGN KEY(for-key-column(s)) REFERENCES parent-table(pri-key-column(s)),
--        CONSTRAINT consraint-name  CHECK (where-predicate)
--       )
--
--       Note: CONTRAINT is part of the set of column definitions (i.e. inside the parens for column specification)
--
-- 
-- ALTER - changing the definition of a table
--
-- Commonly used to add/remove constraints on tables or change existing table attributes
--
--
-- Add a FOREIGN KEY - Establish Parent/Dependant relationship
--
-- FOREIGN KEY must have the same-number, same-order, compatible-data-type as entire PRIMARY KEY of parent
--             and must have a matching value in the PRIMARY KEY in the parent table
--
-- When adding FOREIGN KEY after data has been loaded into table, all FOREIGN KEY values must have a match in parent
--
--      ALTER TABLE dependent-table-name ADD FOREIGN KEY(for-key-column(s)) REFERENCES parent-table(pri-key-column(s)) 
--
-- Remove a constraint from a table
--
--      ALTER TABLE table-name DROP CONSTRAINT constraint_name
--
--
-- Add a column to an existing table
--
-- Cannot add a NOT NULL column to a table with existing data
--
--      ALTER TABLE table-name ADD COLUMN new_column_name data_type constraint
--
--
-- Rename an existing column in a table
--
--      ALTER TABLE table-name RENAME column-name TO new-column-name;
--
--
-- Rename a table
--
--      ALTER TABLE table-name RENAME TO new-table-name  - Will fail if table does not exist
--
--      ALTER TABLE IF EXISTS table-name RENAME TO new-table-name  - Successful if table exists or not
--
----------------------c-----------------------------------------------------------------------------------------
--create table
drop table if exists artist cascade;
drop table if exists paintings cascade;
drop table if exists customer cascade;
drop table if exists purchase cascade;

create table artist
(
artist_id      serial                not null
,artist_name  character varying (50)         not null
,constraint pk_artist_artist_id PRIMARY KEY(artist_id)
);


create table paintings 
(
painting_id serial
,artist_id int not null 
, painting_title character varying(100) 
,constraint pk_paintngs_painting_id primary key(painting_id)
,constraint fk_artist_artist_id foreign key(artist_id) references artist(artist_id)
);


create table customer
(
customer_id serial 
,customer_name character varying(40)
, customer_address character varying(100)
,customer_city character varying(100)
,customer_state character(2)
,customer_phone character varying(12)
,constraint customer_constraint primary key(customer_id)
);

create table purchase
(
purchase_id serial
,customer_id integer not null 
, painting_id integer not null
, purchase_date date not null
, purchase_price numeric(12,2)
,constraint pk_purchase_purchase_id primary key(purchase_id)

);

ALTER TABLE paintings                   -- NAME OF DEPENDANT
ADD FOREIGN KEY(artist_id)               -- COLUMN OF DEPENDANT 
 REFERENCES artist(artist_id)            -- NAME OF PARENT TABLE AND PRIMARY KEY IN THAT TABLE
;

ALTER TABLE purchase                  
ADD FOREIGN KEY(customer_id)               
 REFERENCES customer(customer_id) 
 ;
 ALTER TABLE purchase                  
ADD FOREIGN KEY(painting_id)               
 REFERENCES paintings (painting_id) 
 ;