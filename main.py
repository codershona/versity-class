list_shellter = {
  "Tuples_1": ["list",4,"item"],
  "Tuples_2": ["list",1,"item"],
  "Tuples_3": ["list",5,"item2"],
  "Tuples_4": ["unlist",3,"item"],
  "Tuples_5": ["sublist",10,"item"],
  "Tuples_6": ["sublist",8,"item"],
}


print(list_shellter)
print("")


def invert_dict(d):
  inverse = dict()
  for key in d:
    val = d[key]
    for item in val:
      if item not in inverse:
        inverse[item] = [key]
      else:
        inverse[item].append(key)
  return inverse 


inverted_tup = invert_dict(list_shellter)
print(inverted_tup)