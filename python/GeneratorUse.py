def Powgen(m=3):
    n=0
    while n<=m:
        yield 2**n
        n=n+1
for i in Powgen(10):
    print(i)