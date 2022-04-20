public boolean mixStart(String str) {
  if (!str.contains("ix")) return false;
  if (str.length() >= 3) {
    if (str.substring(1, 3).equals("ix")) return true;
  }
  return false;
}
