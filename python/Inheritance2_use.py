class person:
    def _init_(self,name,age,city):
        self.name=name
        self.age=age
        self.city=city
    def displayperson(Self):
        print("name:",self.name)
        print("age:",self.age)
        print("city:",self.city)
p1=person("Rohit",21,"chhatarpur")
p1.displayperson()
class Student(person):
    def _init_(self,name,age,city,course,fees):
     self.course=course
     self.fees=fees
     super()._init_(name,age,city)
    def displaystudent(self):
        super().displayperson()
        print("course",self.course)
        print("fees",self.fees)
s=Student("Mayank",21,"sagar","python",15000)
s.displaystudent()

