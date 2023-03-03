def smallestString(arr=[])
    smallest = 0
    arr.each_index{ |i| smallest = i if arr[i].length < arr[smallest].length}
    return smallest
end
puts smallestString(['ciao', 'come', 'stai', '?'])