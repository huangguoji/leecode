/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int startIndex=0,endIndex=height.length-1;
        int volume = 0;
        int tmp_volume = 0;
        while(startIndex<endIndex){
            if(height[startIndex]<height[endIndex]){
                tmp_volume = height[startIndex]* (endIndex-startIndex);
                startIndex++;
            }
            else{
                tmp_volume = height[endIndex]* (endIndex-startIndex);
                endIndex--;
            }
            if(tmp_volume>volume) volume = tmp_volume;
        }
        return volume;
    }
}
// @lc code=end

