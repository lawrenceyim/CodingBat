public String frontBack(String str) {
  if (str.length() <= 1) return str;
  StringBuilder sb = new StringBuilder();
  if (str.length() == 2) {
    sb.append(String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0)));
  } else {
    sb.append(str.charAt(str.length() -1));
    sb.append(str.substring(1, str.length() - 1));
    sb.append(str.charAt(0));
  }
  return sb.toString();
}
