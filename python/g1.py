import random as rm
n=int(input("how many test do you want  "))
w=0
k=0
for i in range(0,n):
    a=rm.randint(1,100)
    print(a)
    b=rm.randint(1,100)
    print(b)
    c=a+b
    y=int(input("ente your answer"))
    if c==y:
         w=w+1
    else:
        k=k+1    
    
print("your answer is ",k,"of",n)
if n==w:
     print("you are win")    