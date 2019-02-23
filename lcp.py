num=int(input("\nEnter the number:"))
s=input("\nEnter the string:")
a=list(s)
b=0
while num>0:
    print(a[b],end="")
    b=b+1
    num=num-1
