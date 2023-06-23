/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function (arr, size) {
  let chunkArray = [];
  debugger;
  for (let i = 0; i < arr.length; i += size) {
    let chunk = [];
    for (let j = i; j < i + size && j < arr.length; j++) {
      chunk.push(arr[j]);
    }
    chunkArray.push(chunk);
  }
  return chunkArray;
};

// -------
/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function (arr, size) {
  const numOfBins = Math.floor((arr.length + size - 1) / size);
  const chunkedArr = [];

  let index = 0;
  for (let i = 0; i < numOfBins; i++) {
    const chunk = [];

    for (let j = 0; j < size && index < arr.length; j++) {
      chunk.push(arr[index++]);
    }

    chunkedArr.push(chunk);
  }

  return chunkedArr;
};

console.log(chunk([1, 2, 3, 4, 5], 1));
console.log(chunk([1, 9, 6, 3, 2], 3));
