# 1068. 产品销售分析 I
select product_name, year, price
from Sales
         left join Product
                   on Sales.product_id = Product.product_id