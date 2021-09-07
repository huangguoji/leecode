/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (40.77%)
 * Likes:    1767
 * Dislikes: 0
 * Total Accepted:    608K
 * Total Submissions: 1.5M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int end = -1;
        if(strs.length==1) return strs[0];
        int minlength = strs[0].length();
        for(String item:strs){
            minlength = Math.min(minlength, item.length());
        }
        for(int i=0;i<minlength;i++){
            for (int k=0;k<strs.length-1;k++) {
                if(strs[k].charAt(i)!=strs[k+1].charAt(i)){
                     return strs[0].substring(0,end+1);
                }
                else{
                    if(k+2==strs.length)
                        end=i;
                }
            }
        }
        return strs[0].substring(0,end+1);
    }
}
// @lc code=end

