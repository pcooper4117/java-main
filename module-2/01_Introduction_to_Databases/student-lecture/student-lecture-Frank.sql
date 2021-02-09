--------------------------------------------------------------------------------------------------------
-- Basic SELECT Lecture Code
--------------------------------------------------------------------------------------------------------
-- -- indicates a comment - anything following on the line is ignored
--
-- SQL SELECT statement - retrieve values form the database (Read)
--
-- A SELECT statement is often referred to as a query
--
-- Basic syntax: ( the order is important\required)
--
--      SELECT   - columns to include in the result (seperate mutiple column reqeusts with commas)
--      FROM     - table containing rows used in the query 
--      WHERE    - rows to include in the result
--      ORDER BY - sequence of rows in the result
--                 without an ORDER BY the sequence of the rows in the result is not predictable
--                 if the sequence of teh rows in teh result matter - code an ORDER BY
--
-- WHERE predicates:
--
--        =  <>  !=  >  >=  <  <= 
--        IN(list-of-values)      -- alterative to a series of = OR
--        NOT IN(list-of-values)  -- alterative to a series of != AND
--        BETWEEN value AND value
--        IS NULL
--        IS NOT NULL
--        LIKE    (use wildcards: % means 0 to any number of any characters
--                                _ means exactly any one character
--        ILIKE   (case insensivtive LIKE - Postgres extension)
--
-- predicates may be combined using AND and OR
--
-- use parentheses to make your multi-predicate condition clear

-- The DISTINCT clause on a SELECT removes duplicate values from the result
-- based on the all columns that follow
--
-- The DISTINCT ON(columns/expression) clause on a SELECT removes duplicate values from the result
-- based on the all columns/expression inside the parentheses that follow (Postgres extension)
------------------------------------------------------------------------------------------------------

-- Selecting the names for all countries
Select name 
  from  country 
;       

-- Selecting the name and population of all countries
Select name, population
  from       country
  ;
select population, name
from country
;
-- Selecting all columns from the city table
select *
from country
;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
select name, district
from city
where district = 'Ohio'
;

-- Selecting countries that gained independence in the year 1776
select name
from country
where indepyear = 1776
;

-- Selecting countries not in Asia
select name, continent
from country
where continent <> 'Asia'
;
-- Selecting countries that do not have an independence year
select name
from country
where indepyear is null
;
-- Selecting countries that do have an independence year
select name
from country
where indepyear is not null
;

-- Selecting countries that have a population greater than 5 million
select name, population
from country
where population > 5000000
;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
select name district, population
from city 
where district = 'Ohio'
and population > 400000
;
-- Selecting country names on the continent North America or South America
select name, continent
from country
where continent = 'North America'
or continent = 'South America'
;

-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
select name
             , population                as How_many_people
             , lifeexpectancy            as how_long_they_live
             , population /  surfacearea as pop_per_area
from country
;


-- slelect countries that gained independace in the 20th century
select name, indepyear
from country
where indepyear between 1900 and 1999

;


