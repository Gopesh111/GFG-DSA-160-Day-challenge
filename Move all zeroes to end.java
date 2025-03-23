class Solution {
    void pushZerosToEnd(int[] arr) {
        int i=0;
        for(int n:arr)
        {
            if(n!=0)
            {
                arr[i++]=n;
            }
        }
        while(i<arr.length)
        {
            arr[i++]=0;
        }
    }
    }
