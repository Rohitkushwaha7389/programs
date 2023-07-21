'''l=[2,"a",6,9,"x"]
ans=[]
for i in l:
    if str(i).isdigit()==True:
        ans.append(i*i)
    else:
        ans.append(0)
print(ans)'''
 #one line if
#  x=2
#  result="even" if x % 2== 0 else "odd"
#  print(result)

# n=[2,'a',8,3,'x']
# temp=[]
# for x in n:
#     x= n*n if str(n).isdigit()==True else 0
#     temp.append(x)
# print(temp)
#list complihension use
'''l=[2,"a",8,3,"x"]
temp= [n for n in l if str(n).isdigit()==True]
print(temp)'''



# create a list of even number between two given number
'''l=[]
num=int(input())
num2=int(input())
for i in range(num,num2):
    if(i%2==0):
        l.append(i)
print(l)'''
num1=int(input())
num2=int(input())
temp=[i for i in range(num1,num2+1) if i % 2==0]
print(temp)