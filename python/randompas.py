import random as rnd 
import string as st  
alpha=list(st.ascii_letters)
num=list(st.digits)
sym=list(st.punctuation)
rnd.shuffle(alpha)
rnd.shuffle(num)
rnd.shuffle(sym)
password = alpha[0:4] + num[0:2] + sym[0:2]
password=('').join(password)
print(password)