INSERT INTO public.book
(id,name,author,isbn)
VALUES
(1,'Вечный Адам','Жюль Верн','978-2-266-11156-0'),
(2,'Зелёный луч','Жюль Верн','978-2-266-11156-1'),
(3,'Двадцать тысяч льё под водой. Кругосветное путешествие под волнами океана','Жюль Верн','978-2-266-11156-2'),
(4,'Агентство Томпсон и К°','Жюль Верн','978-2-266-11156-3')
ON conflict (id) DO nothing
;
commit;

INSERT INTO public.client
(id,birthday,last_name,first_name,patronymic)
VALUES
(10,'21.05.1954','Иванов','Иван','Иванович'),
(11,'05.12.1985','Петров','Илья','Петрович'),
(12,'03.08.1999','Иванова','Анастасия','Андреевна'),
(13,'16.01.2003','Сидоров','Макар','Николаевич')
ON conflict (id) DO nothing
;
commit;

INSERT INTO public.bookcrossing
(id,start_date,book_id,client_id)
VALUES
(1,CURRENT_TIMESTAMP-INTERVAL '30 DAY', 1 ,10),
(2,CURRENT_TIMESTAMP-INTERVAL '20 DAY', 2 ,12),
(3,CURRENT_TIMESTAMP-INTERVAL '10 DAY', 3 ,10),
(4,CURRENT_TIMESTAMP-INTERVAL '5 DAY',  4 ,13),
(5,CURRENT_TIMESTAMP-INTERVAL '31 DAY', 1 ,11),
(6,CURRENT_TIMESTAMP-INTERVAL '22 DAY', 1 ,12),
(7,CURRENT_TIMESTAMP-INTERVAL '13 DAY', 3 ,13),
(8,CURRENT_TIMESTAMP-INTERVAL '1 DAY',  3 ,11)
ON conflict (id) DO nothing
;
commit;