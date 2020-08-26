
class Book:
    def __init__(self,id=0,nm="",price=0.0):
        self.__id=id                         
        self.__name=nm                      
        self.__price=price              

    def __str__(self):                        
        return "Id : "+str(self.__id)+"\nName : "+self.__name+"\nPrice : "+str(self.__price)


if __name__=="__main__":
    b=Book(123,"python",234.00)
    print(b)
    print("Amount : ",b.calcAmt(5))
