require 'debug'

def solution(number)
  # result = []
  # Array(1...number).each do |num|
  #   if (num % 3 == 0 || num % 5 == 0)
  #     result << num
  #   end
  # end
  # result.sum
  (1...number)
    .select { |int| int if (int % 3 == 0 || int % 5 == 0) }
    .inject(&:+)

end
puts solution 10
postfix = ' like this'
l1.push(' like', 'this') if l1.size <= 2 :
if names.length == 0
  names.push 'no one likes this'
elsif names.length == 1
  names.push ' likes this'
elsif names.length == 3
  names[0]

neames.reduce([]) do |acc, name|
  case l1.length
    when 0 then acc.push 'no one likes this'
    when 1 then acc.push name.conact 'likes this'
    when 2 then
    else
  end
end
['Jacob', 'Alex'].each do |name|

end

describe 'Basic tests' do
  it "Testing" do
    expect(likes([])).to  eq('no one likes this')
    expect(likes(['Peter'])).to eq('Peter likes this')
    expect(likes(['Jacob', 'Alex'])).to eq('Jacob and Alex like this')
    expect(likes(['Max', 'John', 'Mark'])).to eq('Max, John and Mark like this')
    expect(likes(['Alex', 'Jacob', 'Mark', 'Max'])).to eq('Alex, Jacob and 2 others like this')
  end
end
