select * from book;
select bookname, publisher from book;

select bookname, publisher
    from book
where price >= 10000;   

select phone, address, name
    from customer
    where name = '김연아';
    
select *
    from customer;
    
SELECT BOOKNAME, PRICE
FROM BOOK;

SELECT BOOKID,BOOKNAME,PUBLISHER,PRICE
FROM BOOK;

SELECT *
FROM BOOK;

SELECT *
FROM BOOK
WHERE PRICE < 20000;

SELECT *
FroM BOOK
where not(10000 <= price and price <= 20000);

select *
from book
where publisher in('굿스포츠','대한미디어');

select * from customer;

select *
from customer
where phone is null;

-- 내림차순=desc  가격은 내림차순 가격이 같으면 출판사로 오름차순
select *
from book
order by price desc, publisher asc;

select * from book;

select publisher, sum(price)
from book
group by publisher;

select * from orders;

select sum(saleprice)총매출, 
        avg(saleprice) "판매 평균", 
        max(saleprice)"최대판매액",
        min(saleprice)"최소판매액"
from orders;

select COUNT(custid)"고객 수"
from customer;

select count(bookid) "2만원 이상인 도서 수"
from book
where price >= 20000;


-- 출판사 개수 구하기
select * from book;

select count( distinct publisher )
from book;




select custid,count(*) 도서수량, sum(saleprice)총액
from orders
group by custid;

select * from customer;

select count(*)
from customer;

select count(custid)
from customer;

select count(phone) -- 박세리 번호가 null이여서 4
from customer;


-- 판매가가 8천원 이상인것
select *
from orders
where saleprice >= 8000;


select custid,count(*)
from orders
where saleprice >= 8000
group by custid
having count(*) >= 2
order by custid;






