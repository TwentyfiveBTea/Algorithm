# 1148. 文章浏览 I
select distinct author_id as id
from Views
where author_id = viewer_id
order by id