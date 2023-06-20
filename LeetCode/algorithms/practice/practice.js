function sleep(millis) {
  return new Promise((resolve) => {
    debugger;
    setTimeout(resolve, millis);
  });
}

debugger;
let t = Date.now();
sleep(100).then(() => {
  console.log(Date.now() - t); // Output: 100
});
