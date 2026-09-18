SELECT c.name AS Customers
FROM Customers AS c
LEFT JOIN Orders AS o
ON c.id = o.customerId
WHERE o.customerId IS NULL;

#select name as Customers from customers where id not in ( select customerId from orders);