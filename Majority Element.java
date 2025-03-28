 public List<Integer> findMajority(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int n = nums.length, m = n / 3;

        for (int i = 0; i < n; i++) {
            if ((i == 0 || nums[i] != nums[i - 1]) && (i + m < n && nums[i] == nums[i + m])) {
                res.add(nums[i]);
            }
        }
        
        return res;
    }
