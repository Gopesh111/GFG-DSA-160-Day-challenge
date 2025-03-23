class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > l) {  
                sl = l;
                l = num;
            } else if (num > sl && num < l) {
                sl = num;
            }
        }
        
        return (sl == Integer.MIN_VALUE) ? -1 : sl;
    }
}
