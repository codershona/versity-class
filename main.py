import math

def my_sqrt(a):
    x = a/2
    while True:
        est_root = (x + a/x) / 2.0
        if est_root == x:
            return est_root
            break
        x = est_root

def square_root(types_of_a):
    list1a = "a"
    list1b = "my_sqrt(a)"
    list1c = "math.sqrt(a)"
    list1d = "diff"
    
    list2a = "-"
    list2b = "---------"
    list2c = "------------"
    list2d = "----"
    
    space1 = " "
    space2 = " " * 3
    space3 = ""
    
    print(list1a, space1, list1b, space2, list1c, space3, list1d)
    print(list2a, space1, list2b, space2, list2c, space3, list2d)
    
    for a in types_of_a:
        column1 = float(a)
        column2 = my_sqrt(a)
        column3 = math.sqrt(a)
        column4 = abs(my_sqrt(a) - math.sqrt(a))

        print(column1, "{:<13f}".format(column2), "{:<13f}".format(column3), column4)
square_root(range(1,12))
square_root((1,5))
square_root((1,3))
square_root(range(1,9))