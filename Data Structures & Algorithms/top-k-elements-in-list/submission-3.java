class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer>[] freqArray = (ArrayList<Integer>[]) new ArrayList[nums.length + 1];
        for (int i = 0; i < freqArray.length; i++) {
            freqArray[i] = new ArrayList<Integer>();
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int i = entry.getValue();
            freqArray[i].add(entry.getKey());
        }
        int[] result = new int[k];
        int count = 0;
        for(int i = freqArray.length - 1; i>=0; i--){
            for(int num: freqArray[i]){
                result[count] = num;
                count++;
                if(count >= k){
                    return result;
                }
            }
        }
        return result;

        
    }
}