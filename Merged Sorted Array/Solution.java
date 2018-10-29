class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int totalLength = m+n-1;
        // Length of nums1 and nums2
        int firstLength = m-1;
        int secondLength = n-1;

        while(secondLength >= 0){
            nums1[totalLength--] = firstLength >= 0 && nums1[firstLength] > nums2[secondLength]?nums1[firstLength--] : nums2[secondLength--];
        }

    }
}