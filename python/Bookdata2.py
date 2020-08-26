
import sys
import Bookfun as bs

blist=[]

choice=0
while (choice<6):

    print("1.Add Book ")
    print("2.Delete Book")
    print("3.Modify Book")
    print("4.Search by Book")
    print("5.Display All")
    print("6.Exit")

    choice=int(input("Enter your choice : "))

    if(choice==1):
        ans=bs.addbook(blist)
        if ans==True:
            print("Added Book Details Successfully....")
            
        else:
            print("Adding New Book Details FAILED....")
        
        
    if(choice==2):
        id=int(input("Enter Book Id :"))
        ans=bs.deletebook(blist,id)
        if ans==True:
            print("Book Deleted Successfully....")
            
        else:
            print("Book Deletion FAILED....")
        
    if(choice==3):
        id=int(input("Enter Book ID :"))
        newprice=float(input("Enter New price of the Book :"))
        ans=bs.modifyprice(blist,id,newprice)
        if ans==True:
            print("Price Modified...")
        else:
            print("Book NOT-FOUND !!!")
        
    if(choice==4):
        name=input("Enter Book Name : ")
        b=bs.searchbyname(blist,name)
        if b!=None:
            print("Book Details : ",b)
        else:
            print(" Book NOT-FOUND !!!")
            
        
    if(choice==5):
        for b in blist:
            print(b)
        
    if(choice==6):
        sys.exit()
    
    
    
        
