class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length > nums1.length) return intersect(nums2, nums1);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (Integer v : nums1)
            map.put(v, map.getOrDefault(v, 0) + 1);
        
        int k = 0;
        for (Integer v : nums2)
        {
            if (map.getOrDefault(v, 0) > 0) {
                nums1[k++] = v;
                map.put(v, map.get(v)-1);
            }
        }
        
        int[] res = new int[k];
        for (int i=0; i<k; i++)
            res[i] = nums1[i];
        
        return res;
    }
}