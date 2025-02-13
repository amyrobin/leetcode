class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create new array to add indices that add up to target
        int[] newArray = new int[2];
        //loop through the array starting at index 0
        for (int i = 0; i < nums.length - 1; i++) {
            //inner loop that compares i to each subsequent index
            for (int j = i + 1; j < nums.length; j++) {
                //if i + j = target, place i and j into newArray
                //if false, go back through inner loop until we reach the last index
                if (nums[i] + nums[j] == target) {
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }

        return newArray;
    }
}