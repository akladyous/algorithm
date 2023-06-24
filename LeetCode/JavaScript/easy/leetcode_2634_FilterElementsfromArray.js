/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
  let result = [];
  for (let i = 0; i < arr.length; i++) {
    let predicate = fn.call(this, arr[i], i);
    if (predicate) {
      result.push(arr[i]);
    }
  }
  return result;
};
