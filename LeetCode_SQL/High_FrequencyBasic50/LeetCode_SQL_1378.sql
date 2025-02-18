# 1378. 使用唯一标识码替换员工ID
select unique_id, name
from Employees
         left join EmployeeUNI
                   on Employees.id = EmployeeUNI.id