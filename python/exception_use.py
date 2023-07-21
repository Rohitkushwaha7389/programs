num1=int(input())
num2=int(input())
try:
    ans=num1/num2
except ZeroDivisionError:
    print('You can not divide by zero')
except NameError:
    print("variable not define")
else:
    print("Answer is",ans)

finally:
        print("Thank you ")
