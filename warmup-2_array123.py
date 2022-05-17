def array123(nums):
  if len(nums) < 3:
    return False
  for i in range(0, len(nums) - 2):
    if nums[i: i + 3] == [1, 2, 3]:
      return True
  return False
