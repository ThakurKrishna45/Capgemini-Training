-- select * from authors;
-- select * from genres;
-- select * from users;
-- select * from books;
-- select * from loans;

-- INSERT INTO loans (loan_id, user_id, book_id, borrowed_date, return_date) VALUES
-- (11, 1, 1, '2026-01-01', '2026-01-10'),
-- (12, 1, 3, '2026-01-15', NULL);

-- select user_name, count(book_id) from users u left join loans l on u.user_id= l.user_id group by user_name, l.user_id;
-- select title , genre_name from books b left join genres g on b.genre_id=g.genre_id where genre_name='Fiction';
-- select u.* from users u left join loans l on u.user_id=l.user_id left join books b on  b.book_id=l.book_id where title='2 States';

-- select user_name, count(book_id) from users u left join loans l on u.user_id= l.user_id group by user_name, l.user_id  
-- having count (*) in (select max(counts) from (select count(book_id) counts from users u left join loans l on u.user_id= l.user_id
-- group by l.user_id ));

-- select title, count(b.book_id) from books b right join loans l on l.book_id=b.book_id group by title, b.book_id  
-- having count (*) in (select max(counts) from (select count(b.book_id) counts from books b right join loans l on 
-- l.book_id=b.book_id group by title, b.book_id));

-- select author_name from authors a where a.author_id not in(select b.author_id from books b right join loans l on l.book_id=b.book_id ); 