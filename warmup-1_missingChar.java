public String missingChar(String str, int n) {
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < str.length(); i++) {
    if (i != n) sb.append(str.charAt(i));
  }
  return sb.toString();
}
