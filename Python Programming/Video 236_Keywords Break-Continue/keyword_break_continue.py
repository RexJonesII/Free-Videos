import keyword
print(keyword.kwlist)
numbers = (1, 2, 3, 4, 5, 6, 7)

for number in numbers:
  if number == 5:
    break
  print(number)
print("End of Loop")

for number in numbers:
  if number == 5:
    continue
  print(number)
print("End of Loop")

