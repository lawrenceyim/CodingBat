public String front3(String str) {
    StringBuilder sb = new StringBuilder();
    if (str.length() <= 3) {
      for (int i = 0; i < 3; i++) {
        sb.append(str);
      }
    } else {
      for (int i = 0; i < 3; i++) {
        sb.append(str.substring(0, 3));
      }
    }
    return sb.toString();
}
