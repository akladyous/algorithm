function findFactorPairs(num) {
  const factorPairs = [];
  const sqrtNum = Math.floor(Math.sqrt(num)); // Calculate the square root of the number

  for (let i = 1; i <= sqrtNum; i++) {
    if (num % i === 0) {
      factorPairs.push([i, num / i]); // Add the factor pair [i, num / i]
    }
  }

  return factorPairs;
}

// Example usage:
const num = 16;
const pairs = findFactorPairs(num);
console.log(pairs); // Output: [[1, 16], [2, 8], [4, 4]]
