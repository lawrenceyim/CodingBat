public String notString(String str) {
  if (str.length() < 3) return "not " + str;
  if (str.substring(0, 3).equals("not")) return str;
  return "not " + str;
}
