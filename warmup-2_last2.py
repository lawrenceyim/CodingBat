def last2(str):
  if len(str) < 4: 
    return 0
  count = 0
  target =  str[len(str) - 2: len(str)]
  for i in range(0, len(str) - 2):
    if str[i: i + 2] == target:
      count += 1
  return count
