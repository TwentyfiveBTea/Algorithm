# 1211. 查询结果的质量和占比
select query_name, round(avg(rating / position), 2) as quality, round(avg(rating < 3) * 100, 2) as poor_query_percentage
from Queries
group by query_name