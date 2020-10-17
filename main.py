d={'List':'Item1','Item2':'Item3','Item4':'Item5'} 
Z = list(d.items())
print('d.items() = ',Z)
print('Differences of d.items() value is ',type(Z[1]))
for j,w in d.items(): 
    print('The keys are ', j, ', the values are ',w)

#example of dictinary
#list of key,value pairs, which are tuples
#loop over the dictionary using key,value tuples
