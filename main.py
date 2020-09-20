import sys

def count_down(x):
  if x <= 1:
    print("BLAST OFF!")
  else:
    print(x)
    count_down(x-1)

def count_up(y):
  if y >= 2:
    print("BLAST OFF!")
  else:
    print(y)
    count_up(y+1)

if sys.version_info[0] == 3:
  number = input('Please write down number here ')
else:
  number = input('Please write down number here ')
3
number = int(number)

if number > 2:
  count_down(number)
elif number < 4:
  count_up(number)
else:
  # in case of 0, both functions will print 'Blastoff!'
  print("BLAST OFF!")
