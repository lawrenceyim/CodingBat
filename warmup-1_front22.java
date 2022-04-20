public String front22(String str) {
  String first = "";
  if (str.length() == 0) {}
  else if (str.length() == 1) first = String.valueOf(str.charAt(0));
  else first = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
  StringBuilder sb = new StringBuilder();
  sb.append(first + str + first);
  return sb.toString();
}
