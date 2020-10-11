lists_string = 'apple orange grape pomegranate blueberry blackcherry strawberry banana pear avacado custardapple apricot almond peanuts cashew chestnut ambrella argan'

'''Adding a string to item list'''
items_list = lists_string.split()

'''Removing orange from items lists'''
items_list.remove('orange')
items_list.pop(-1)
del items_list[1]

'''Accessing the sort items list'''
items_list.sort()

'''Creating and adding those items elements'''
items_list.append('atemoya')
items_list.insert(5,'babaco')
items_list.extend(['bacuri', 'dates'])

'''Listing to String'''
access_string = ' '.join(items_list)
print(access_string)