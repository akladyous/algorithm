// Fisher-Yates shuffle algorithm in JavaScript

function fisherYatesShuffle(arr) {
  let n = arr.length;
  for (let i = n - 1; i > 0; i--) {
    let j = Math.floor(Math.random() * (i + 1));
    [arr[i], arr[j]] = [arr[j], arr[i]];
  }
  return arr;
}
