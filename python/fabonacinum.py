def Fabogen(num):
    x,y=0,1
    for _ in range(num):
        yield x
        x,y=y,x+y
for i in Fabogen(5):
    print(i)


  