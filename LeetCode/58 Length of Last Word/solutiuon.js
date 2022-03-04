var lengthOfLastWord = function (s) {
    counter = 0;
    idx = s.length - 1;
    while (s.at(idx) === " ") {
        idx -= 1;
    }
    while (idx >= 0 && s.at(idx) != " ") {
        counter += 1;
        idx -= 1;
    }
    return counter;
};


console.log(lengthOfLastWord("   fly me   to   the moon  "));