# first solution
def front_times(str, n):
  res = ""
  if len(str) >= 3:
    for i in range(0, n):
      res += str[0:3]
  else:
    for i in range(0, n):
      res += str
  return res

# second solution
def front_times(str, n):
  res = ""
  for i in range(0, n):
    res += str[0:3]
  return res
