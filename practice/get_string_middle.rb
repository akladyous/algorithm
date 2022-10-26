def get_middle string
  quotient, reminder = string.length.divmod(2)
  middle = reminder == 0 ? quotient-1..quotient : quotient

  # string[middle]
  string.length % 2 == 0 ? string.slice( string.length.div(2)-1..string.length.div(2) ) : string.slice(string.length.div(2))
end



