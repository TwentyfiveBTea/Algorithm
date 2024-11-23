package LeetcodeQuestion;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2024/11/23 14:48
 * @Description: 241123
 */
public class Code241123 {

    /**
     * @Description: 704. 二分查找
     * @Method: 二分查找
     */
    class Solution1 {
        public int search(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (nums[mid] > target) {
                    r = mid - 1;
                } else if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    return mid;
                }
            }

            return -1;
        }
    }

    /**
     * @Description: 744. 寻找比目标字母大的最小字母
     * @Method: 二分查找
     */
    class Solution2 {
        public char nextGreatestLetter(char[] letters, char target) {
            int l = 0;
            int r = letters.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (letters[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            return l < letters.length ? letters[l] : letters[0];
        }
    }

    /**
     * @Description: 2529. 正整数和负整数的最大计数
     * @Method: 二分查找
     */
    class Solution3 {
        public int maximumCount(int[] nums) {
            // 找到第一个大于等于 0 的位置
            int index1 = findIndex(nums, 0);
            // 找到第一个大于 0 的位置
            int index2 = nums.length - findIndex(nums, 1);
            return Math.max(index1, index2);
        }


        public int findIndex(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (nums[mid] < target) {
                    l = mid + 1;
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    /**
                     * 当找到等于目标值的元素时，需要特殊处理
                     * 我们要找的是严格小于目标值的元素个数，所以这里要向左继续查找
                     * 直到找到最左边的等于目标值的元素，然后返回其左边元素的个数
                     */
                    while (mid > 0 && nums[mid - 1] == target) {
                        mid--;
                    }
                    return mid;
                }
            }

            return l;
        }
    }

    /**
     * @Description: 1385. 两个数组间的距离值
     * @Method: 暴力
     */
    class Solution4 {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            int count = 0;

            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    int ans = arr1[i] - arr2[j];

                    if (Math.abs(ans) <= d) {
                        break;
                    } else if (j == len2 - 1) {
                        count++;
                    }
                }
            }

            return count;
        }
    }

    /**
     * @Description: 1456. 定长子串中元音的最大数目
     * @Method: 滑动窗口
     */
    class Solution5 {
        public int maxVowels(String s, int k) {
            char[] str = s.toCharArray();
            int cnt = 0;
            int vowel = 0;

            for (int i = 0; i < str.length; i++) {
                if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                    vowel++;
                }

                if (i < k - 1) {
                    continue;
                }

                cnt = Math.max(cnt, vowel);

                char c = str[i - k + 1];
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel--;
                }
            }

            return cnt;
        }
    }
}
