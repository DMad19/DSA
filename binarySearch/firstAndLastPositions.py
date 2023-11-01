def firstAndLastPositions(l,num):
    s = ''
    for i in l:
        s+=str(i)
    print(s)
    # for i in range(len(l)):
    #     if(l[i]==num):
    #         for j in range(len(l)-1,i-1,-1):
    #             if(l[j]==num):
    #                 return [i,j]
    # else:
    #     return [-1,-1]
    # if str(num) in l:
    return [s.find(str(num)),s.rfind(str(num))]
print(firstAndLastPositions([1,2,3,3,3],3))