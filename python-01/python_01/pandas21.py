# -*- coding: utf-8 -*-
"""
Created on Tue Dec 17 20:44:11 2019

@author: Administrator
"""
import pandas as pd
import numpy as np
# Series DataFrame
#Series 1.创建
ser1 = pd.Series([1,2,5,2])
print(ser1)
# print(list(ser1.index))#list:列表化,index:索引
print(ser1.values)
print('--------------------------------------------')
print(ser1[0:3])
ser2 = pd.Series([1,2,5,2], index =['a','b','c','d'])
# print(ser2)
# print(ser2['a':'c'])
# ser2 = pd.Series([1,2,5,2], index =[1,2,3,4])
print(ser2)
print(ser2[2])
ser3 = ser2.reindex(['b','c','d','h','k'])
print('--------------------------------------------')
print(ser3)
#print(ser3)
print(ser3(ser3.isnull() == True )
print(ser3(ser3[ser3.isnull() == True ])
ser3 = ser2.reindex(['b','c','d','h','k'],fill_value=0)
#ser3 = (['b','c','d','h','k'],)
#print(ser3)
#
#dic={'calvin':7,'kobe':24,'mj':23,'kd':35}
#print((dic))
##pd.DataFrame
#data = {'name':['calvin','kobe','michale','durant','james'],'age':[29,40,56,30,34],'height':[1.70,1.98,1.98,2.06,2.03]} #从字典创建DataFrame
#print((data))
#data2 = [['a',1],['b',2],['c',3]]  #从列表创建DataFrame
#print((data2))
#df=(data2=['one','two','three','four'])
#print(pdf7)
#pdf8 = pdf7(['CA','FL'])
#print(pdf8)
#pdf8 = pdf7(['one','three'],axis=1)
#print(pdf8)
##索引、切片及过滤
#ser8 = (np.arange(4),['a','b','c','d'])
#print(ser8[])
#print(ser8[])
#print(ser8[])#字母标签包含末端
#print(ser8[])#数字标签跟python切片运算一样，不包含末端
#print(ser8[])
#pdf7 = (np.arange(16).reshape((4,4)),\
#                    ['CA','FL','HW','NY'],['one','two','three','four'])
#print(pdf7[])
#print(pdf7[[]])
#print(pdf7[])
#print(pdf7[pdf7[] > 4])
#print(pdf7 )
#pdf7 = 0
#'''loc-----通过行标签索引行数据
#   iloc-----通过行号索引行数据
#'''
#pdf7 = (np.arange(16).reshape((4,4)),\
#                    ['CA','FL','HW','NY'],['one','two','three','four'])
#pdf9 = pdf7.loc[['FL','NY'],['one','two']]#通过loc索引行为'FL','NY',列为'one','two'的数据
#print(pdf9)
#pdf10 = pdf7.iloc[:1]
#print(pdf10)
#s1 = ([1.2,-2.8,3.4,1.5],['a','c','d','e'])
#s2 = ([3.1,4.3,-5,6,4.8],['a','c','e','f','g'])
#print(s1)
#print(s2)
#print(s1+s2)
#df1=(np.arange(9).reshape((3,3)),('bcd'),\
#              ['CA','FL','NY'])
#df2=(np.arange(12).reshape((4,3)),('bde'),\
#              ['UT','CA','NY','TE'])
#print(df1+df2)
#df1 = (np.arange(12).reshape((3,4)),('abcd'))
#df2 = (np.arange(20).reshape((4,5)),('abcde'))
#df3 = df1(df2,)
#print(df3)
#df4 = df1.(columns= , )
#print(df4)
#arr=np.arange(12).reshape((3,4))
#
#arr1 = arr-arr[0]
#print(arr1)
#frame = (np.arange(12).reshape((4,3)),\
#                ('bde'),index = ['UT','CA','TE','NY'])
#series=frame.iloc[0]
#print(series)
#print(frame-series)
#series2 = pd.Series(range(3),index=['b','e','f'])
#print(frame+series2)
