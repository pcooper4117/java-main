-- show the country name, city name, district

select country.name, city.name, district -- columns you want to see in result
from country, city                     -- tables with columns we want
where country.code = city.countrycode            -- we want the rows that match bewteen city and country by country code
;

-- whenever you need a data from more than one table - code a join
-- two formats for coding a join

--classic syntax  code all the tables on  the from and the join condition on the where
-- modern syntax type of join betweeen table names and the join condition  on an on clause

-- a join is matches rows between tables based on a join condition
-- join condition defines how rows between the tables should be matched
--





-- Subquery example ----------------------------------------------------------------------------

-- list the names of countries that speak english
--
-- the country language table has the country code that speak each language

-- 1 get a list of country code that speak english from the countrylanguage table
-- 2 get name of the country from the country table if the code in the country is in the list in 1

-- subquery is run first then list returned is plugged into the end

-- CLASSIC-------------------------------------------
select name 
from country
where code in (select countrycode
               from countrylanguage
               where language = 'English')
              
 ;
 -- MODERN--------------------------------------------
 select country.name, city.name, district     --coumns in reslult
 from country                                 -- code one of the tables
        inner join                            -- type join inner join showes matches 
        city                                  -- code the other table
     on country.code = city.countrycode        -- join condition we want the rows that match between city and country tables
     where country.code = 'USA'                -- filtering conditions the WHERE as usual
     ;
 
 