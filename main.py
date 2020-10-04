import math

def square_root(x):
  tol = 0.00001
  est = 0.1

  while True:
    est= (est + float(x) / est) / 2.0
    differ = abs(float(x) - est ** 2.0)
    if differ <= tol:
      break


  diff = abs(math.sqrt(float(x))- est)
  print("a = ",x, " | square_root(a) = ", est, " | math.sqrt(a) = ", math.sqrt(float(x)), " | diff = ", diff)

x = 1
while(x<=25):
  square_root(x)
  x+=1

