
from Bookdata1 import Book
#-----------------------------------------------
def addbook(blist):
    id = int(input("Enter book Id : "))
    name = input("Enter Book Name : ")
    price = float(input("Enter Book Price : "))
    b=Book(id,name,price)
    blist.append(b)
    
    return True
#-----------------------------------------------------

def searchbyname(blist,name):
    for b in blist:
        if b.getName() == name:
            return b
    else:
        return None
#-----------------------------------------------------
def modifyprice(blist,id,newprice):
    for b in blist:
        if b.getId() == id:
            b.setPrice(newprice)
            return True
    else:
        return False
#---------------------------------------------------------    
def deletebook(blist,id):
    count=0
    for b in blist:
        if b.getId() == id:
            print(b)
            ans=input("Do you want to Delete [y/n] ? :")
            if(ans == "y"):
                blist.pop(count)
                return True
            else:
                return False
        count=count+1    
    else :
        return False
#-----------------------------------------------------------
