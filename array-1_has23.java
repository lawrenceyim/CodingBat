public boolean has23(int[] nums) {
  for (int num: nums) {
    if (num == 2 || num == 3) return true;
  }
  return false;
}
