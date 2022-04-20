public int max1020(int a, int b) {
  if (inRange(a) && inRange(b)) {
    return Math.max(a, b);
  } 
  if (inRange(a)) return a;
  if (inRange(b)) return b;
  return 0;
}

public boolean inRange(int a) {
  return a >= 10 && a <= 20;
}
