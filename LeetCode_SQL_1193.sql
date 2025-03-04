# 1193. 每月交易 I
select date_format(trans_date, '%Y-%m')       as month,
       country,
       count(*)                               as trans_count,
       count(if(state = 'approved', 1, null)) as approved_count,
       sum(amount)                            as trans_total_amount,
       sum(if(state = 'approved', amount, 0)) as approved_total_amount
from Transactions
group by month, country