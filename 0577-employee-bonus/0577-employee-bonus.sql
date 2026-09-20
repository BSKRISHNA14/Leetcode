select e.name , b.bonus 
from employee as e
left join bonus as b
on e.empId=b.empId
where bonus is NULL OR bonus<1000;