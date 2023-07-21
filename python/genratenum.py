import random as rnd 
userinput =10
if userinput > 3:
    num1=rnd.randint(1, userinput//2)
    num2=rnd.randint(1,(userinput//2)-1)
    num3=userinput-num1-num2
else:
    num1=num2=num3=1
print(num1,num2,num3)
