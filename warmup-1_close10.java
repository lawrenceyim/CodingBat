public int close10(int a, int b) {
  return Math.abs(a - 10) == Math.abs(b - 10) ? 0 : Math.abs(a - 10) < Math.abs(b - 10) ? a : b;
}
