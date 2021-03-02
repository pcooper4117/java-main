-- Select all columns from users where the user's role is admin
select *
from users
where role = 'admin'
;
-- Select name and description from items that were created after Sept. 20, 2019 and the description isn't null
select name, description
from items 
where created between '2019-09-20' and '2019-10-15' and not null
;
-- Select first_name and last_name from users and order by when they were created, latest first
select first_name, last_name
from users
order by created desc
;
-- Select finished and a count all the items that are finished/not finished
select count (*)
from items
where finished is not null or finished is null
; 
-- Select a user's first_name and last_name and the item's name for every finished item
select first_name, last_name, name
from users
inner join 
items
on users.id = items.id
where finished = true;