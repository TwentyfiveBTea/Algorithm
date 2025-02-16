# 175. 组合两个表
select FirstName, LastName, City, State
from Person left join Address on Person.personId = Address.personId;