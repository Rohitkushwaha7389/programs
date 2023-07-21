days=("monday","tuesday", "wednesday","thursday","friday","saturday","sunday")
num=int(input())

if num>0 and num<8:
    print(days[num-1])
else:
    print("invalid")
    