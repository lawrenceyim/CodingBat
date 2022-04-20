public boolean hasTeen(int a, int b, int c) {
  return inRange(a) || inRange(b) || inRange(c);
}

public boolean inRange(int a) {
  return a >= 13 && a <= 19;
}
