class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int nums = num;
        // int target = target;

        for(i = 0; i < nums.lenght; i++){
           for(j = i; j < nums.lenght; j++ ){
            if (num[i]+num[j] == target){
                return new int[] {i,j};
            }
           } 
        }
        return new int[0];
    }
}
