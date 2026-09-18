select name as Employee
from employee e
where salary >(
    select salary
    from employee
    where id=e.managerId
);

#select name as employee from employee as e join employee as m on e.managerId = m.id where e.salary>m.salary