select name as Employee
from employee e
where salary >(
    select salary
    from employee
    where id=e.managerId
);

#select name as employee from employee as e join employee as m on e.id=m.managerId where e.salary>m.salary