drop table if exists books;
create table books (
	id			 serial primary key,
	title 	     text,
	author 		 text,
	published 	 int check(published >= 1000)
);

insert into books (title, author, published) values
	('War and Peace', 'Leo Tolstoy', 1869),
	('Crime and Punishment', 'Fyodor Dostoevsky', 1866),
	('Solaris', 'Stanislaw Lem', 1961),
	('The war of the Worlds', 'H. G. Wells', 1898),
	('The End of Eternity', 'Isaac Asimov', 1955),
	('Vandals of the Void', 'Jack Vance', 1953),
	('Romeo and Juliet', 'William Shakespeare', 1597),
	('Faust', 'J. W. Goethe', 1808),
	('Frankenstein', 'Mary Shelley', 1818),
	('The Stars My Destination', 'Alfred Bester', 1957);

drop table if exists reviews;
create table reviews (
	id 		serial primary key,
	book_id int references books(id),
	rating	int check(rating >= 0 and rating <= 5),
	text	text
);


insert into reviews (book_id, rating, text) values
	(10, 5, null),
	(3, 3, 'A little bit boring');
	
	
