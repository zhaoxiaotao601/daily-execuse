# -*- coding: utf-8 -*-
"""
Created on Fri Dec 20 13:00:27 2019

@author: anyuwei1
"""

# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import matplotlib.pyplot as plt
import numpy as np
plt.plot(np.arange(10))
fig=plt.figure()

ax1=fig.add_subplot(2,2,1)
from numpy.random import randn
plt.plot(randn(50).cumsum(),'k--')
ax1=fig.add_subplot(2,2,2)
ax1=fig.add_subplot(2,2,3)
ax1=fig.add_subplot(2,2,4)
print(randn(10).cumsum())
fig,axes=plt.subplots(2,3)
fig=plt.figure()
ax1=fig.add_subplot(2,2,2)
ax2=fig.add_subplot(2,2,3)
from numpy.random import randn
# fig,axes=plt.subplots(2,2,sharex=True,sharey=True)
# for i in range(2):
#     for j in range(2):
#         axes[i,j].hist(randn(500),bins=50,color='k',alpha=0.5)
# plt.subplots_adjust(wspace=0,hspace=0)
# fig=plt.figure()
# plt.plot(randn(30).cumsum(),'ko--')
# plt.plot(randn(30).cumsum(),color='k',linestyle='dashed',marker='o')
# data=randn(30).cumsum()
# fig=plt.figure()
# plt.plot(data,'k--',label='Default')
# fig=plt.figure()
# plt.plot(data,'k--',drawstyle='steps-post',label='steps-post')
# fig=plt.figure()
# plt.legend(loc='best')
# fig=plt.figure()
# ax=fig.add_subplot(1,1,1)
# ax.plot(randn(1000).cumsum())
# ticks=ax.set_xticks([0,250,500,750,1000])
# labels=ax.set_xticklabels(['one','two','three','four','five'],rotation=30,fontsize='small')
# ax.set_title('My first matplotlib plot')
# ax.set_xlabel('Stages')
# fig=plt.figure();ax=fig.add_subplot(1,1,1)
# ax.plot(randn(1000).cumsum(),'k',label='one')
# ax.plot(randn(1000).cumsum(),'k--',label='two')
# ax.plot(randn(1000).cumsum(),'k.',label='three')
# ax.legend(loc='best')
# import matplotlib.pyplot as plt
# fig=plt.figure()
# ax=fig.add_subplot()
# ax=fig.add_subplot(1,1,1)
# import numpy as np
# t=np.arange(0,5,0.01)
# s=np.cos(2*np.pi*t)
# line,=ax.plot(t,s,lw=2)
# ax.annotate('local max',xy=(2,1),xytext=(3,1.5),\
#             arrowprops=dict(facecolor='black',shrink=0.05),)
# ax.set_ylim(-2,2)
# fig=plt.figure()
# ax=fig.add_subplot(1,1,1)
# rect=plt.Rectangle((0.2,0.75),0.8,0.25,color='k',alpha=0.3)
# circ=plt.Circle((0.7,0.2),0.1,color='b',alpha=0.3)
# pgon=plt.Polygon([[0.15,0.15],[0.35,0.6],[0.2,0.8]],color='g',alpha=0.5)
# ax.add_patch(rect)
# ax.add_patch(circ)
# ax.add_patch(pgon)
# from pandas import Series,DataFrame
# import numpy as np
# s=Series(np.random.randn(10).cumsum(),index=np.arange(0,100,10))
# s.plot()
# df=DataFrame(np.random.randn(10,4).cumsum(0),columns=['A','B','C','D'],index=np.arange(0,100,10))
# print(df)
# df.plot()
# fig,axes=plt.subplots(2,1)
# df = Series(np.random.rand(16),index = list('abcdefghijklmnop'))
# df.plot(kind='bar',ax=axes[0],color='k',alpha=0.7)
# df.plot(kind='barh',ax=axes[1],color='k',alpha=0.7)
# from pandas import Series,DataFrame
# import pandas as pd
# import matplotlib.pyplot as plt
# import numpy as np
# import scipy
# comp1=np.random.normal(0,1,size=200)   #生成一个高斯分布的概率密度函数
# comp2=np.random.normal(10,2,size=200)  #生成一个高斯分布的概率密度函数
# values=Series(np.concatenate([comp1,comp2]))   #将两个图拼接
# fig=plt.figure()
# values.hist(bins=100,alpha=0.3,color='k',density=True)   #生成直方图
# values.plot(kind='kde',style='k--')   #这一步需要用到第三方库scipy，所以要提前安装scipy，
# import numpy as np
# import matplotlib.pyplot as plt
# N=50
# fig = plt.figure()
# x=np.random.rand(N)
# y=np.random.rand(N)
# colors=np.random.rand(N)
# area=(30*np.random.rand(N))**2
# plt.scatter(x,y,s=area,c=colors,alpha=0.5)