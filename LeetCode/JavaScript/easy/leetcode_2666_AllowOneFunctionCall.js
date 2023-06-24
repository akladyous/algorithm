/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function (fn) {
  var hasBeenInvoked = false;
  var result;
  return function (...args) {
    if (!hasBeenInvoked) {
      hasBeenInvoked = true;
      return fn.apply(null, args);
    }
    return undefined;
  };
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
