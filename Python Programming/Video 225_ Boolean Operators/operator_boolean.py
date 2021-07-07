# Identity Operators
address_1234 = ["red", "black", "white"]
address_1238 = ["red", "black", "white"]
print(address_1234 is address_1238)
print(id(address_1234))
print(id(address_1238))
print(address_1234 is not address_1238)

address_1234 = address_1238
print(address_1234 is address_1238)
print(id(address_1234))
print(id(address_1238))
print(address_1234 is not address_1238)

#Membership Operators
message = "I Like Python"
print("Python" in message)
print("python" not in message)








