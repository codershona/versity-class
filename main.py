'''Nesting the list'''
numbers_of_list = [1,2,3,4,[5,6],7]

'''*this is a operator elements'''
thislist = ['pineapple','jackfruit','cherry']*3

'''Listing the slices'''
this_slice = thislist[4:6]

'''this is a += operator method'''
thislist += ['grapes', 'banana']

'''Listing the filter'''
boolean = [True, False, False, True]
list(filter(None,boolean))
x = [4, 5, 7, 6, 12, 14]
x = x.append(27)
print(x)