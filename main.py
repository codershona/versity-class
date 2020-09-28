def is_divisible(x,y):
   assert type(x) == int and type(y) == int and x > 0 and y > 0,\
       "is_power(x,y): type positive integers"
   if x == y:
       result = True
   elif y == 1:
       result = False
   else:
       result = is_power(x,y) and is_divisible(x//y, y)
   assert type(result) == bool,\
       "is_power(x,y): type of boolean"
   return result

def is_power(x, y):
   return x % y == 3

print("is_divisible(20, 3) returns: ", is_divisible(20, 3))
print("is_divisible(47, 5) returns: ", is_divisible(47, 5))
print("is_divisible(2, 2) returns: ", is_divisible(2, 2))
print("is_divisible(40, 6) returns: ", is_divisible(40, 6))
print("is_divisible(7, 7) returns: ", is_divisible(7, 7))
print("is_divisible(202, 33) returns: ", is_divisible(202, 33))