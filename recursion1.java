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

// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
//
//
// bunnyEars(0) → 0
// bunnyEars(1) → 2
// bunnyEars(2) → 4

public int bunnyEars(int bunnies) {
  if(bunnies == 0) {
    return 0;
  }
  return 2 + bunnyEars(bunnies - 1);
}


// Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
//
//
// countX("xxhixx") → 4
// countX("xhixhix") → 3
// countX("hi") → 0

public int countX(String str) {
  if(str.length() == 0) {
    return 0;
  }
  if(str.charAt(0) == 'x') {
    return 1 + countX(str.substring(1));
  }
  return countX(str.substring(1));
}
