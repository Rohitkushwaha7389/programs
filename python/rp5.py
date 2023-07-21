a=[3,9,10,13,100,5]
b=[1,0,0,1,1,1]
def is_prime(n):
    for i in range(3,n):
        if n% i==0:
            return False

    return True

for i in range(len(a)):
    
        
