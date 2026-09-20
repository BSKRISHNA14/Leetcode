CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  Declare offset_value INT;
  Set offset_value=N-1;
  RETURN (
    Select distinct salary 
    from employee
    order by salary desc
    LIMIT 1 OFFSET offset_value
  );
END