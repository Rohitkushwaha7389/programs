class Student:
    def getdata(self,nm,ag,db):
        self.name=nm
        self.age=ag
        self.dob=db
    def printdata(self):
        print(self.name)
        print(self.age)
        print(self.dob)
 
s=Student()
s.getdata("Rohit",21,"20-17-2002")
s.printdata() 