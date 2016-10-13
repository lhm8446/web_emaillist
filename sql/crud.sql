-- sql(crud) test

--insert 
insert into emaillist 
	   values(emaillist_seq.nextval, '고','둘리','doo8446@gmail.com');



commit;

select no, last_name, first_name, email from emaillist order by no ;