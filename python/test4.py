ans=int(input())
if(ans=='A'):
    num1=int(input())
    num2=int(input())
    num3=input()
     
    print(num1+num2)
elif(ans=='S'):
    num1=int(input())
    num2=int(input())
    print(num1-num2)
elif(ans=='D'):
    num1=int(input())
    num2=int(input())
    print(num1/num2)
elif(ans=='M'):
    num1=int(input())
    num2=int(input())
    print(num1*num2)
else:
    print("default operation")
