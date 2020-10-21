alphabet = 'abcdefghijklmnopqrstuvwxyz'    
test_miss = ["cat","xyz"] 
def dup_letters(s):
    missWords = ""
    global alphabet
    i = 0
    while i < len(alphabet):
        if alphabet[i] not in s:
            missWords += alphabet[i]
        i += 1
    sortedlists = sorted(missWords)
    sortedAlphabets = ''.join(sortedlists)
    return sortedAlphabets

for i in test_miss:
    print('{} are skipping alphabets lists {}'.format(i, dup_letters(i)))