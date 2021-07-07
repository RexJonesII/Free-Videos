
try:
  number = int(input('(100/Number) Enter A Number: '))
  value = 100/number
  print(value)
except ValueError:
  print('Invalid Number: Enter A Numerical Value')
except ZeroDivisionError as exc:
  print(exc)
  print('Invalid Number: Number Cannot Be 0')
print('Thanks For Your Input')




















