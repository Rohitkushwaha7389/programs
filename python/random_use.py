import random as rnd
# print(rnd.random())
# # print(random.random())
# print(rnd.randint(1,100))
# print(rnd.randint(100,1000))
# print(rnd.randrange(0,1000,10))
# s='python'
# l=[10,20,"programming","c",True]
# t=(1,29,2,3,5,7,0)
# print(rnd.choice(s))
# print(rnd.choice(l))
# print(rnd.choice(t))
# n1=["mango","orange","Apple","Banana",""]
# print(rnd.choice(n1, k = 2, weights = [1,10,1,10,1]))
# print(rnd.sample(n1,len(n1)))
rnd.seed(1)
print(rnd.random())
rnd.seed(2)
print(rnd.random())
rnd.seed(1)
print(rnd.random())


