// Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
//
//
// countHi("xxhixx") → 1
// countHi("xhixhix") → 2
// countHi("hi") → 1

public int countHi(String str) {
  if (str.length() <= 1) return 0;
  int count = 0;
  if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
  return count + countHi(str.substring(1));
}
