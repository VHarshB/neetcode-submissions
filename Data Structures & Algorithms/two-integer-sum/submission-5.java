class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int nums = num;
        // int target = target;

        for(int i = 0; i < nums.length; i++){
           for(int j = i; j < nums.length; j++ ){
            if (num[i]+num[j] == target){
                return new int[] {i,j};
            }
           } 
        }
        return new int[0];
    }
}
