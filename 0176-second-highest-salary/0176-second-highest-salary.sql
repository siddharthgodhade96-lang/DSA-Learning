SELECT max(salary) AS SecondHighestSalary
from employee
where salary < (select max(salary) as highestSalary
from employee);