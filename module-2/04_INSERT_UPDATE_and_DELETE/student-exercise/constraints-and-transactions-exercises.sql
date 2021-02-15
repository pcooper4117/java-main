-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
Begin transaction;

insert into actor
(first_name , last_name)
values ('Hampton', 'Avenue'), ('Lisa', 'Byway');
select * from actor where last_name in ('Avenue', 'Byway');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
insert into film
(title, description, release_year, length, language_Id)
values ('Euclidean PI' , 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 198, 1);
select * from film;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
insert into film_actor(actor_id, film_id)
values ((select actor_id from actor where first_name = 'Hampton' and last_name = 'Avenue'),( select film_id from film where title = 'Euclidean PI' ));
insert into film_actor(actor_id, film_id)
values ((select actor_id from actor where first_name = 'Lisa' and last_name = 'Byway') ,(select film_id from film where title = 'Euclidean PI'));
select * from film_actor;
 --4. Add Mathmagical to the category table.
insert into category
(name)
values('Mathmagical')
;select * from category 
;
 --5. Assign the Mathmagical category to the following films, "Euclidean PI",
 --"EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
insert into film_category(film_id, category_id)
values (( select film_id from film where title = 'Euclidean PI'), (select category_id from category where name = 'Mathmagical'));
insert into film_category(film_id, category_id)
values (( select film_id from film where title = 'EGG IGBY'), (select category_id from category where name = 'Mathmagical'));
insert into film_category(film_id, category_id)
values (( select film_id from film where title = 'KARATE MOON'), (select category_id from category where name = 'Mathmagical'));
insert into film_category(film_id, category_id)
values (( select film_id from film where title = 'RANDOM GO'), (select category_id from category where name = 'Mathmagical'));

;


 --6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
--update film set rating = 'G'
--where film_id in (
where film_id in

;

-- 7. Add a copy of "Euclidean PI" to all the stores.

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
delete from film
 where title = 'Euclidean PI';


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
rollback;