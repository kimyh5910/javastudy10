select * from book;
select bookname, publisher from book;

select bookname, publisher
    from book
where price >= 10000;   

select phone, address, name
    from customer
    where name = '�迬��';
    
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
where publisher in('�½�����','���ѹ̵��');

select * from customer;

select *
from customer
where phone is null;

-- ��������=desc  ������ �������� ������ ������ ���ǻ�� ��������
select *
from book
order by price desc, publisher asc;

select * from book;

select publisher, sum(price)
from book
group by publisher;

select * from orders;

select sum(saleprice)�Ѹ���, 
        avg(saleprice) "�Ǹ� ���", 
        max(saleprice)"�ִ��Ǹž�",
        min(saleprice)"�ּ��Ǹž�"
from orders;

select COUNT(custid)"�� ��"
from customer;

select count(bookid) "2���� �̻��� ���� ��"
from book
where price >= 20000;


-- ���ǻ� ���� ���ϱ�
select * from book;

select count( distinct publisher )
from book;




select custid,count(*) ��������, sum(saleprice)�Ѿ�
from orders
group by custid;

select * from customer;

select count(*)
from customer;

select count(custid)
from customer;

select count(phone) -- �ڼ��� ��ȣ�� null�̿��� 4
from customer;


-- �ǸŰ��� 8õ�� �̻��ΰ�
select *
from orders
where saleprice >= 8000;


select custid,count(*)
from orders
where saleprice >= 8000
group by custid
having count(*) >= 2
order by custid;






