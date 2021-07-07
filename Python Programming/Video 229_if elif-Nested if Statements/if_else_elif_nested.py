'''
(1) if the price is > $100 but <= $199.99
      then the customer gets a $10 Discount
(2) if the price is > $200 but <= $299.99
      then the customer gets a $25 Discount
(3) if the price is > $300 but <= $399.99
      then the customer gets a $50 Discount
(4) if the price is >= $400
      then the customer gets a $60 Discount
'''

price = float(input("Enter cost of items:"))

if price > 99.99:
  if price <= 199.99:
    discount = 10
  elif price <= 299.99:
    discount = 25
  elif price <= 399.99:
    discount = 50
  else:
    discount = 60
  print("Your Discount Is $%.2f" % discount)
  total = price - discount
  print("Your Total Price Is $%.2f" % total)
else:
  print("You Do Not Qualify For A Discount")










