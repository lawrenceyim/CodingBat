public String endUp(String str) {
  if (str.length() <= 3) return str.toUpperCase();
  int index = str.length() - 3;
  return str.substring(0, index) + str.substring(index).toUpperCase();
}
