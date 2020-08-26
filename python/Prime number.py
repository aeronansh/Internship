number = int(input("Enter the number you want to check: "))
flag=False
d=2
if number == 1:
    print("It is not a prime number")
else:
    while d < number and number != 2:
                  if number % d == 0:
                      print("It is not a prime number")
                      flag = True
                      break
                  d=d+1
    if (flag == False):
                  print("It is a prime number")
