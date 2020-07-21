DROP SCHEMA IF EXISTS docker_menuitem;
create schema docker_menuitem;
use docker_menuitem

create table menuitem(me_id long,me_name varchar(120), me_price float,me_active boolean, me_date_of_launch date,me_category varchar(120), me_free_delivery boolean,PRIMARY KEY(me_id));


insert into menuitem(me_id,me_name,me_price,me_active,me_date_of_launch,me_category,me_free_delivery)
values
(100,"Sandwich",10000,true,"2017-12-17","maincourse",true),
(101,"Burger",10000,true,"2017-12-17","maincourse",true),
(102,"Pizza",10000,true,"2017-12-17","maincourse",true),
(103,"Fries",10000,true,"2017-12-17","starter",true),
(104,"Brownies",10000,true,"2017-12-17","starter",true);