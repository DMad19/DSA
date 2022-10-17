if token<=2:
    return 1
a = 1
b =1
k =2
while(k<token):
    a,b = b,a+b
    k+=1
return b