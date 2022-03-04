debugger

function isValidSubsequence1(array= new Array, sequence=new Array){
    seqIndex = 0;
    for(let i = 0; i < array.length; i++){
        if(array[i] === sequence[seqIndex] && seqIndex < sequence.length){
            seqIndex ++
        };
    };
    return seqIndex === sequence.length;
}
// console.log(isValidSubsequence1([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10]));

function isValidSubsequence2(array= new Array, sequence=new Array){
    let arrIdx = 0;
    let seqIdx = 0;
    while (arrIdx < array.length && seqIdx < sequence.length) seqIdx ++;
    
    return seqIdx === sequence.length;
};
console.log(isValidSubsequence2([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10]));