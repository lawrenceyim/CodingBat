public int[] rotateLeft3(int[] nums) {
  int[] res = new int[nums.length];
  int index = 0;
  for (int i = 1; i < nums.length; i++) {
    res[index] = nums[i];
    index++;
  }
  res[index] = nums[0];
  return res;
}
