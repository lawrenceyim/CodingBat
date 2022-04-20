public boolean loneTeen(int a, int b) {
  return inRange(a) ^ inRange(b);
}

public boolean inRange(int a) {
  return a >= 13 && a <= 19;
}