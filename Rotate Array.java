class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int a[], int d) {
    int n = a.length;
    d %= n;
    reverse(a, 0, d - 1);
    reverse(a, d, n - 1);
    reverse(a, 0, n - 1);
}

static void reverse(int a[], int l, int r) {
    while (l < r) {
        int t = a[l];
        a[l++] = a[r];
        a[r--] = t;
    }
}

}
