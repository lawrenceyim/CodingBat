public boolean lastDigit(int a, int b) {
  String as = String.valueOf(a);
  String bs = String.valueOf(b);
  return as.charAt(as.length() - 1) == bs.charAt(bs.length() - 1);
}
