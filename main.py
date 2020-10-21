alphabet = "abcdefghijklmnopqrstuvwxyz"
test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"]
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"]

def histogram(s):
    d = dict()
    for c in s:
        if c not in d:
            d[c] = 1
        else:
            d[c] += 1
    return d

def has_duplicates(s):
    for j in histogram(s).values():
        if j > 2:
            return True
    return False

def test_dups_loop():
    for x in test_dups:
        print(x + ' -', has_duplicates(x))

def miss_letters(s):
    y = list('abcdefghijklmnopqrstuvwxyz')
    s = s.lower()
    for w in s.lower():
        if w in y:
            y.remove(w)
    return ''.join(y)

def test_miss_loop():
    for w in test_miss:
        print(w + ' =', miss_letters(w))

def main():
    test_dups_loop()
    test_miss_loop()

if __name__ == '__main__':
    main()