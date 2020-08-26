class Person:
    def __init__(self,id=0,nm="",mob=""):
        self.id=id
        self.name=nm
        self.mobile=mob
    def __str__(self):
        return "Id : "+str(self.id)+"\nName : "+self.name+"\nMobile : "+self.mobile
class Employee(Person):
    def __init__(self,id=0,nm="",mob="",dt="",ds=""):
        Person.__init__(self,id,nm,mob)
        self.dept=dt
        self.desg=ds
    def __str__(self):
        return Person.__str__(self)+"\nDepartment : "+self.dept+"\nDesignation : "+self.desg

class SalariedEmp(Employee):
    def __init__(self,id=0,nm="",mob="",dt="",ds="",sal=0.0,bonus=0.0):
        Employee.__init__(self,id,nm,mob,dt,ds)
        self.sal=sal
        self.bonus=bonus
    def __str__(self):
        return Employee.__str__(self)+"\nSalary: "+str(self.sal)+"\nBonus : "+str(self.bonus)
        


if __name__=="__main__":
    s=SalariedEmp(123,"Rajan","3333","Game","Manager",34056,3456)
    print(s)







