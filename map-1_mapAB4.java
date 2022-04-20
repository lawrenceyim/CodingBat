public Map<String, String> mapAB4(Map<String, String> map) {
  if (!map.containsKey("a") && !map.containsKey("b")) return map;
  else if (!map.containsKey("a") || !map.containsKey("b")) {
    return map;
  } else {
    int al = map.get("a").length();
    int bl = map.get("b").length();
    if (al == bl) {
      map.put("a", "");
      map.put("b", "");
    } else {
      if (al > bl) {
        map.put("c", map.get("a"));  
      } else {
        map.put("c", map.get("b"));
      }
    }
  } 
  return map;
}