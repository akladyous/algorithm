/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */

Array.prototype.last = function () {
  if (this.length == 0) {
    return -1;
  } else {
    return this[this.length - 1];
  }
};

async function delayExample() {
  console.log('Before delay');
  const millis = 2000; // 2 seconds
  await new Promise((resolve) => setTimeout(resolve, millis));
  console.log('After delay');
  return millis;
}

delayExample().then((duration) => {
  console.log(`Delay of ${duration} milliseconds completed.`);
});
