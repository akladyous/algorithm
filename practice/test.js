function countLetters(string= new String, letter = new String){
    counts = {};
    for(i=0; i<string.length; i++){
        counts[letter] ? counts[letter]++ : counts[letter] = 1
    };
    return counts[letter]
}

// console.log(countLetters("aaa", "a"));

function reverseString1(str){
    let string = ''
    for(var i = str.length - 1; i >=0; i--){
        string += str[i]
    };
    return string;
};
function reverseString2(str){
    i = str.length - 1;
    string = ""
    while(i >= 0){
        string += str[i]
        i -= 1
    }
    return string
}
// console.log(reverseString2('paolo'))
function findFirstDuplicate(nums){
    for(i = 0; i < nums.length -1; i++){
        if(nums.includes(nums[i], i+ 1)) return nums[i]
    }
    return -1;
}
function findFirstDuplicate2(nums){
    return nums.find((v, i, a) => a.indexOf(v) != i ) ?? -1
}

// console.log(findFirstDuplicate2([1,2,3,4,5,6,6]))

function selectionSort(nums){
    for(let left = 0; left < nums.length; left ++){
        let minValueAtIndex = left
        for(let right = left +1; right < nums.length; right ++){
            if(nums[minValueAtIndex] > nums[right]) minValueAtIndex = right;
        };
        [nums[left], nums[minValueAtIndex]] = [nums[minValueAtIndex], nums[left]]
    };
    return nums
}

// console.log(selectionSort([5,4,8,0,2,1,3,7,6]))

function twoNumberSum(array, targetSum){
    for(let x = 0; x < array.length; x++){
        for(let y = x+1; y < array.length; y++){
            if((array[x] + array[y]) === targetSum)
                return [array[x], array[y]]
        }
    }
    return []
};

// console.log(twoNumberSum([3,5,-4,8,11,1,-1,6], 10))

function isValidSubsequence(array, sequence){
    arrIdx, seqIdx = 0, 0;
    while(arrIdx < array.length && seqIdx < sequence.length){

    }
}
// console.log(isValidSubsequence([5,1,22,25,6,-1,8,10], [1,6,-1,10]));

function test(array, sequence){
    seqIdx = 0;
    for(let x = 0; x < array.length; x++){
        if(array[x] === sequence[seqIdx] && seqIdx < sequence.length){
            seqIdx ++
        }
    }
    return seqIdx === sequence.length
}
// console.log(test([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10]));

function sortedSquaredArray(array){
    result = [];
    for(let n of array){
        result.push(n**2)
    };
    return result.sort((a,b)=> a-b);
}
// console.log(sortedSquaredArray([1,2,3,5,6,8,9]))

function shortestString(array){
    smallestIndex = 0;
    for(i = 1; i < array.length; i++){
        if(array[i].length < array[smallestIndex].length){
            smallestIndex = i
        }
    }
    return array[smallestIndex]
}

// console.log(shortestString(["aaa", "a", "bb", "ccc"]));
// console.log(shortestString(["flower", "juniper", "lily", "dandelion"]));


// indexOf
function countLetters(string=new String, letter){
    counter = 0
    index = string.indexOf(letter)
    while(index !== -1){
        counter ++
        index = string.indexOf(letter, index + 1)

    }
    console.log(counter)
}
// countLetters("aaa", "a");

//find
debugger
// const nums = [...Array(5).keys()]
// const nums = [3,3,5,12, 14,1,6, 4, 8]

// remove duplicates from array
// const duplicates = nums.filter((obj, index, array)=> {
//     return index == array.indexOf(obj)
// })
// console.log(duplicates)

// const filterMap = nums.filter((obj) => obj % 2 === 0).map( data => nums.indexOf(data))
// console.log(filterMap)

// find first duplicate
// const findFirstDuplicate1 = (nums= new Array)=>{
//     for(let i = 0; i < nums.length -2; i++){
//         if(nums.includes(nums[i], i+1)){
//             return nums[i]
//         }
//     }
//     return -1
// }
// const findFirstDuplicate2 = (nums= new Array) => {
//     return nums.find((value, index, array) => array.indexOf(value) != index) || -1
// }

// console.log(findFirstDuplicate1(nums))

//leetcode 136 single number

// [23, 3, 5, 2, 1, 0, 56, 2, 11, 4]
//  ↑   ↑
//  l   r
//  m
// iteration number:  0 (10)        [23, 3, 5, 2, 1, 0, 56, 2, 11, 4]
// left: 0 minIndex 1 right: 1 (10) [3, 23, 5, 2, 1, 0, 56, 2, 11, 4]
// left: 0 minIndex 2 right: 2 (10) [5, 23, 3, 2, 1, 0, 56, 2, 11, 4]
// left: 0 minIndex 3 right: 3 (10) [2, 23, 3, 5, 1, 0, 56, 2, 11, 4]
// left: 0 minIndex 4 right: 4 (10) [1, 23, 3, 5, 2, 0, 56, 2, 11, 4]
// left: 0 minIndex 5 right: 5 (10) [0, 23, 3, 5, 2, 1, 56, 2, 11, 4]
// left: 0 minIndex 5 right: 6 (10) [1, 23, 3, 5, 2, 0, 56, 2, 11, 4]
// left: 0 minIndex 5 right: 7 (10) [0, 23, 3, 5, 2, 1, 56, 2, 11, 4]
// left: 0 minIndex 5 right: 8 (10) [1, 23, 3, 5, 2, 0, 56, 2, 11, 4]
// left: 0 minIndex 5 right: 9 (10) [0, 23, 3, 5, 2, 1, 56, 2, 11, 4]


const insertionSort = (nums=new Array) => {
    for(let left= 0; left < nums.length; left ++){
        console.log("iteration number: ", left , nums)
        let minIndex = left;
        for(let right = left + 1; right < nums.length; right ++){
            if(nums[right] < nums[minIndex]){
                minIndex = right;
            };
            [nums[left], nums[minIndex]] = [nums[minIndex], nums[left]]
            console.log( `left: ${left} minIndex ${minIndex} right: ${right}`, nums )
        };
    };
    return nums;
};

console.log(insertionSort([23, 3, 5, 2, 1, 0, 56, 2, 11, 4]))