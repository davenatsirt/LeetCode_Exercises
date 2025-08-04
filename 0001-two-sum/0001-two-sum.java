class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Go through each of the element
        for (int i = 0; i < nums.length; i++){
            //element next to the current element
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        //if there is no solution
        return new int[]{};
    }
}