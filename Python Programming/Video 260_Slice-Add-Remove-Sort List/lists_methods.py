numbers = [5, 8, 2, 1, 7, 8]
letters = ['A', 'a', 'X', 'b', 'Jane', 'John', 'James']
letters_2 = ['Jackie', 'Joe']
booleans = [[0, 'False'], [1,'True'], [-1, 'Error']]
#            0,0    0,1    1,0  1,1     2,0     2,1

print(letters)
letters.sort(key=str.lower)
print(letters)