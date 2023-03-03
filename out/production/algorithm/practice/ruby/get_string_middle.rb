def get_middle s
  quotient, reminder = s.length.divmod(2)
  middle = reminder == 0 ? quotient-1..quotient : quotient

  s[middle]

  # s.length % 2 == 0 ? s.slice( s.length.div(2)-1..s.length.div(2) ) : s.slice(s.length.div(2))

  # s.length % 2 != 0 ? s.split("")[~~(s.length / 2)] : s.split("")[s.length / 2 - 1] + s.split("")[s.length / 2]
end

