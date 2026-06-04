class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(indexMap.containsKey(x) && indexMap.get(x) != i){
                return new int[]{indexMap.get(x), i};
            }
            else{
                indexMap.put(nums[i],i);
            }
        }
         return new int[]{};
    }
}
