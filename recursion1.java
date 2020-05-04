// Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
//
//
// countHi("xxhixx") → 1
// countHi("xhixhix") → 2
// countHi("hi") → 1

public int countHi(String str) {
    if (str.length() <= 1) return 0;
    int index = str.indexOf("hi");
    if (index < 0) {
      return 0;
    } else {
      return 1 + countHi(str.substring(index + 2));
    }
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


// The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
//
//
// fibonacci(0) → 0
// fibonacci(1) → 1
// fibonacci(2) → 1

public int fibonacci(int n) {
  if(n == 0) return 0;
  if(n == 1) return 1;
  return fibonacci(n-1) + fibonacci(n-2);
}

// Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
//
//
// powerN(3, 1) → 3
// powerN(3, 2) → 9
// powerN(3, 3) → 27

public int powerN(int base, int n) {
  if(base == 1) return 1;
  if(n == 1) return base;
  return base * powerN(base, n-1);
}
