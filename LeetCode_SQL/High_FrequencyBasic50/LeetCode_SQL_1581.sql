# 1581. 进店却未进行过交易的顾客
select customer_id, count(customer_id) as count_no_trans
from Visits
         left join Transactions
                   on Visits.visit_id = Transactions.visit_id
where transaction_id is null
group by customer_id