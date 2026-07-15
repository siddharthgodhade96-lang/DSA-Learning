class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int num:nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        ArrayList<Integer>result=new ArrayList<>();
        int limit=nums.length / 3;
        
        for(int key:map.keySet()) {
            if(map.get(key) > limit) {
                result.add(key);
            }
        }
        return result;
    }
}