public int[] reverse3(int[] nums) {
  Deque<Integer> stack = new ArrayDeque<Integer>();
  for (int i = 0; i < nums.length; i++) {
    stack.push(nums[i]);
  }
  for (int i = 0; i < nums.length; i++) {
    nums[i] = stack.poll();
  }
  return nums;
}
