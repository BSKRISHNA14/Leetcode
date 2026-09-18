select name as Employee
from employee e
where salary >(
    select salary
    from employee
    where id=e.managerId
);