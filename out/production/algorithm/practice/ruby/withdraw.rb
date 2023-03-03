def withdraw(amount)
  result = [0,0,0]
  # for 100
  remainder = amount % 100
  if (remainder == 10 || remainder == 30) && (amount >= 100)
    result[0] = (amount / 100)-1
  else
    result[0] = amount / 100
  end
  amount -= result[0] * 100

  #for 50
  if(amount % 20 == 0)
    result[1] =  0
  elsif(amount < 50)
    result[1] = 0
  else
    result[1] = 1
  end
  amount -= result[1] * 50

  #for 20
  result[2] = amount / 20
  result
end
p withdraw 230
