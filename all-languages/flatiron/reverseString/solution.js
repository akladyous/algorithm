function reverseString1(str){
    var newString = "";
    for (var i = str.length -1; i >= 0; i--){
        newString += str[i];
    };
    return newString;
};
console.log(reverseString1("paolo"))

function reverseString2(str){
    var newString = "";
    var i = str.length -1;
    while (i >= 0){
        newString += str[i]
        i--
    };
    return newString
};
console.log(reverseString3("paolo"))

function reverseString3(str){
    for (var i = str.length - 1; i >= 0; i--){
        var s1 = str.slice(i);
        var s2 = str.slice(0, i)
        var str3 = s1 + s2
    }
    return str
};
console.log(reverseString3("paolo"))
