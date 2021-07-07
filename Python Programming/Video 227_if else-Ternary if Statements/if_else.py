'''
if you're 18 years old or older
  Confirm You Can Vote
  Then Go Vote
if not 18
  Sorry But You Are Not Old Enough To Vote
  Please Come Back When You Are 18 Or Older
'''

age = int(input("What Is Your Age?"))
outcome = True if age >= 18 else False

print("Can You Vote? " + str(outcome) + "\n")

if age >= 18:
  print("Confirm You Can Vote")
  print("Then Go Vote")
else:
  print("Sorry But You Are Not Old Enough To Vote")
  print("Please Come Back When You Are 18 Or Older")
print("Have A Great Day")
























