# Write your MySQL query statement below
select contest_id, round(sum(u.user_id = r.user_id) * 100 / count(distinct (u.user_id)), 2) as percentage
from Users as u
         cross join Register as r
group by contest_id
order by percentage desc, contest_id