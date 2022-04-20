public int[] maxEnd3(int[] nums) {
  int larger = Math.max(nums[0], nums[nums.length -1]);
  for (int i = 0; i < nums.length; i++) {
    nums[i] = larger;
  }
  return nums;
}
