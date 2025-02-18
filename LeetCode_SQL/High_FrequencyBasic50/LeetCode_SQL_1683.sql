# 1683. 无效的推文
select tweet_id
from Tweets
where char_length(content) > 15