function fibonacci(num){
    let fib = [];
    for(i = 0; i < num; i++){
        if(i < 2){
            fib[i] = i;
        } else{
            fib[i] = fib[i - 2] + fib[i - 1]
        }
    };
    console.log(fib)
    return fib.slice(-2).reduce((a,b) => a+b, 0)
};

console.log(fibonacci(10))


