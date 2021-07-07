car = input("Enter Car Name: ")

match car:
  case "audi":
    print("Your car is an Audi")
  case "bmw":
    print("Your car is a BMW")
  case "cadillac":
    print("Your car is a Cadillac")
  case _:
    print(
      "Your Value Is Not an Audi, BMW, or Cadillac")