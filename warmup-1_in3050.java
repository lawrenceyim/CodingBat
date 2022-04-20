public boolean in3050(int a, int b) {
  return in30(a) && in30(b) || in40(a) && in40(b);
}

public boolean in30(int a) {
  return a >= 30 && a <= 40;
}

public boolean in40 (int a) {
  return a >= 40 && a <= 50;
}