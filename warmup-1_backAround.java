public String backAround(String str) {
  String last = String.valueOf(str.charAt(str.length() - 1));
  StringBuilder sb = new StringBuilder();
  sb.append(last + str + last);
  return sb.toString();
}
