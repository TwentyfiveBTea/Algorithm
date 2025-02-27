# 1075. 项目员工 I
select p.project_id, round(sum(experience_years) / count(experience_years), 2) as average_years
from Project as p
         left join Employee as e
                   on p.employee_id = e.employee_id
group by p.project_id