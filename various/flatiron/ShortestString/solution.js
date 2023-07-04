debugger

function shortestString(array){
    let smallestIndex = 0;
    for(let i = 1; i < array.length; i ++){
        if(array[i].length < array[smallestIndex].length){
            smallestIndex = i;
        };
    };
    return array[smallestIndex]
}



console.log(shortestString(["aaa", "a", "bb", "ccc"]));
console.log(shortestString(["flower", "juniper", "lily", "dandelion"]));