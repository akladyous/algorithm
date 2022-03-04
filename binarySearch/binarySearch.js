function binarySearch(array = new Array(), target) {
    leftIdx = 0;
    rightIdx = array.length - 1;
    while (leftIdx <= rightIdx) {
        middleIdx = leftIdx + Math.floor((rightIdx - leftIdx) / 2);
        PotentialMatch = array[middleIdx];

        if (target === PotentialMatch) return middleIdx;

        if (target < PotentialMatch) {
            rightIdx = middleIdx - 1;
        } else {
            leftIdx = middleIdx + 1;
        }
    }
    return -1;
}
