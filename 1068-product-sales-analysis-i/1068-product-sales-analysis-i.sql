# Write your MySQL query statement below
select prod.product_name,s.year,s.price
from sales as s
join product as prod
on s.product_id = prod.product_id