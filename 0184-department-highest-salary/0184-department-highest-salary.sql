Select d.name as Department, e.name as Employee, e.salary as Salary
From Employee as e
Join Department as d
On e.departmentId=d.id
Where (e.departmentId,e.salary) IN (
    Select departmentId, max(salary)
    From employee
    Group BY departmentId 
);
