def new_line(): # this is testable 
  print()

def three_lines(): # defining 3 lines
  new_lines()
  new_lines()
  new_lines()

def nine_lines(): # defining 9 line
  three_lines()
  three_lines()
  three_lines()

print("first line has been explained.") 
print("its time for total nine blank lines....!")
print("second line also been described.")

def clear_screen(): #trying to print 25 line clear_screen
  nine_lines()
  nine_lines()
  three_lines()
  three_lines()
  new_line()
print("line one ")
print("here is twenty-five blank lines has been added...!")
# clear_screen()
print("this is last line")