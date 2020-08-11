# f=6
# def sum1(a,b):
#     c=a+b
#     e=a-b
#     print("a+b=",c)
#     return c
#d=sum1(3,4)
#print(d)


# def printstu(name,age=19):
#     print('name:',name)
#     print('age',age)
# printstu('LI',18)


# def test1(a,b,*f,**kargs):
#     print(a)
#     print(b)
#     print(f)
#     print(kargs)
#     # print(args)
# test1(10,11,12,13,14,15)

# def bubbleSort(arr):
#     n = len(arr)
#     # 遍历所有数组元素
#     for i in range(n):
#         # Last i elements are already in place
#         for j in range(0, n-i-1):
#             if arr[j] > arr[j+1] :
#                 arr[j], arr[j+1] = arr[j+1], arr[j]
# arr = [64, 34, 25, 12, 22, 11, 90,9999,5555,4444]
# bubbleSort(arr)
# print ("排序后的数组:")
# for i in range(len(arr)):
#     print ("%d" %arr[i])

# k= int(input('请选择操作:'))
# if k==1:            #添加名片
#    pass
# elif k==2:
#    pass
# elif k==3:
#    pass
# elif k==4:
#    pass
# elif k==5:
#    pass
# else:

# import numpy as np
# ar1 = np.arange(7)
# ar2 = ar1*3
# print(ar2)
# li1 = [0,1,2,3]
# li2 = li1*3
# print(li2)
# ar3 = np.empty((8,4))
# for i in range(4):
#    ar3[:,i] = i
# print(ar3)
#ar4 = np.arange(12).reshape(3,4)
#print(ar4)
#ar4 = np.arange(48).reshape(8,6)
#print(ar4)
#ar4 = np.arange(48).reshape(8,6)
#print(ar4[[2,3,4],[3,4,5]])
#ar4 = np.arange(12).reshape(3,4)
#print(ar4)
# ar4 = np.arange(24).reshape(2,3,4)
# print(ar4)
# print(ar4.transpose(1,0,2))
# import numpy as np
#     a=np.array([1,2,3,4,5])
#     print a
#     b = np.zeros((2,3))
#     print b
#     c = np.arange(10)
#     print c
#     d = np.arange(2,10,dtype=np.float)
#     print d
#     e = np.linspace(1.0,4.0,6)
#     print e
#     f = np.indices((3,3))
#     print f
# in [3]: h=
#    (170-140)*np.random.random_sample(10)+30

import numpy as np
def bmi(w,h):
   bmi_index = w/h**2
   if bmi_index < 18:
      return -1
   elif bmi_index > 25:
      return 1
   else:
      return 0
h = (2.2-1.4)*np.random.random_sample((10,))+1.4
h = np.round(h,2)
#print(len(h))
w = (96-30)*np.random.random_sample((10,))+30
w = np.round(w,2)
print(type(w))
# print(bmi(w,h))