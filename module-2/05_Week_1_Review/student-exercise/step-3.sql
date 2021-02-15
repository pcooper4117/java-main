-- CAMPGROUND TABLE
-----------------------------------------------

-- select name and daily fee of all campgrounds
select name, daily_fee
from campground;
-- select name and daily fee of all campgrounds ordered by campground name
select name, daily_fee
from campground
order by name
;
-- select name, open from month, open to month, and daily fee of the campgrounds where daily fee is less than $100
select name, open_from_mm, open_to_mm, daily_fee
from campground
where daily_fee < '100'
;
-- select name and daily fee of the campgrounds where the campground is open all year long
select name, daily_fee 
from campground
where open_to_mm = '12'
;

-- PARK TABLE
-----------------------------------------------

-- select name and description of all parks order by established date in descending order
select name, description
from park 
order by establish_date desc
;
-- select name and description of all parks in Ohio
select name, description
from park
;
-- select name and description of all parks NOT in Ohio
select name, description
from park
where location != 'Ohio'
;
-- select the total number of visitors for all parks
select visitors
from park
;
-- select the average number of visitors for all parks
select avg(visitors)
from park
;

-- SITE TABLE
-----------------------------------------------

-- select all columns from site where utilities is true and order by max RV length with the largest coming first
select *
from site
where utilities = true
order by max_rv_length asc
;
-- select total number of sites that have utilities hook up
select *
from site
where utilities = true
;

-- RESERVATION TABLE
-----------------------------------------------

-- select reservation id, site id, name, from date, to date of the reservations where the checkin date is between the first and last day of the current month (hard coded month is ok)
select reservation_id, site_id, name, from_date, to_date
 from reservation
 where from_date > '01/01/2021' and from_date < '01/31/2021'
 ;
-- select all columns from reservation where name includes 'Reservation'
select reservation_id, site_id,name,from_date, to_date, create_date
from reservation 
where name like '%Reservation%'

;
-- select the total number of reservations in the reservation table
select count (reservation_id)
from reservation
;
-- select reservation id, site id, name of the reservations where site id is in the list 9, 20, 24, 45, 46
select reservation_id, site_id, name 
from reservation
where site_id in (9,20,24,45,46)
;
-- select the date and number of reservations for each date orderd by from_date in ascending order
select count(from_date) as total_reservation
from reservation
group by from_date
order by from_date asc;
;