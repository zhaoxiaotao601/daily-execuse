# -*- coding: utf-8 -*-
"""
Created on Sun Mar 29 11:15:58 2020

@author: anyuwei"""
import pandas as pd

## 使用read_table读取订单信息表
# 'meal_order_info.csv'
order = pd.read_table(,
        sep = ',', encoding = 'gbk')
# print('使用read_table读取的订单信息表的长度为：',(order))
# (,sep = ';',index = False) #存储文件
### 使用read_csv读取订单信息表
# order1 = pd.read_csv('../data/meal_order_info.csv',
#      encoding = 'gbk')
# print('使用read_csv读取的订单信息表的长度为：',(order1))
#
#
### 使用read_table读取菜品订单信息表,sep = ';'
# order2 = pd.read_table('../data/meal_order_info.csv',
#      sep = ';',encoding = 'gbk')
# print('分隔符为;时订单信息表为：\n',order2)
#
### 使用read_csv读取菜品订单信息表,header=None
# order3 = (,
#      sep = ',',header = None,encoding = 'gbk')
# print('订单信息表为：','\n',order3)
#
#### 使用gbk解析菜品订单信息表
##order4 = pd.read_csv('../data/meal_order_info.csv',
##      sep = ',',encoding = 'utf-8')
#
# user = ('../data/users.xlsx')## 读取user.xlsx文件
# print('客户信息表长度为：',len(user))
#
##客户信息表写入excel文件
# ('C:/Users/安玉伟/tmp/userInfo.xlsx')
#
### 使用read_table读取订单信息表
# orderInfo = pd.read_table('../data/meal_order_info.csv',
#      sep = ',',encoding = 'gbk')
# print('订单信息表的长度为：',len(orderInfo))
#
### 读取user.xlsx文件
# userInfo = pd.read_excel('../data/users.xlsx',
#      )#读取制定
# print('客户信息表的长度为：',len(userInfo))
#
# detail= pd.read_excel('../data/meal_order_detail.xlsx')
#
# print('订单详情表的所有值为：','\n', detail.)
# print('订单详情表的列名为：','\n', detail.)
# print('订单详情表的数据类型为：','\n', detail.)
#
### 查看DataFrame的元素个数
# print('订单详情表的元素个数为：', detail)
# print('订单详情表的维度数为：', detail.) ## 查看DataFrame的维度数
# print('订单详情表的形状为：', detail.) ## 查看DataFrame的形状
# print('订单详情表转置后形状为为：',detail.)
#
### 使用访问字典方式取出orderInfo中的某一列
# order_id = detail['order_id']
# print('订单详情表中的order_id的形状为:','\n',order_id.shape)
#
### 使用访问属性方式取出orderInfo中的菜品名称列
# dishes_name = detail.dishes_name
# print('订单详情表中的dishes_name的形状为:',dishes_name.shape)
#
# dishes_name5 = detail['dishes_name']
# print('订单详情表中的dishes_name前5个元素为：','\n',dishes_name5)
#
# orderDish = detail[][:5]
# print('订单详情表中的order_id和dishes_name前5个元素为：',
#      '\n',orderDish)

# order5 = detail[:]
# print('订单详情表的1-6行元素为：','\n',order5)
#
# print('订单详情表中前五行数据为','\n',detail.)
# print('订单详情表中后五个元素为：','\n',detail.)
#
# dishes_name1 = detail.[:,'dishes_name']
# print('使用 提取dishes_name列的size为：', dishes_name1.)
#
# dishes_name2 = detail.[:,3]
# print('使用 提取第3列的size为：', dishes_name2.size)
#
# orderDish1 = detail. [:,]
# print('使用 提取order_id和dishes_name列的size为：',
#      orderDish1.size)

# orderDish2 = detail.iloc[:,[1,3]]
# print('使用iloc提取第1和第3列的size为：', orderDish2.size)
# orderDish2 = detail.iloc[:,[1,3]]
# print('使用iloc提取第1和第3列的size为：', orderDish2.size)
#
# print('列名为order_id和dishes_name的行名为3的数据为：\n',
#      detail.loc[])
# print('列名为order_id和dishes_name行名为2,3,4,5,6的数据为：\n',
#      detail.loc[])
# print('列位置为1和3行位置为3的数据为：\n',detail.iloc[3,[1,3]])
# print('列位置为1和3行位置为2,3,4,5,6的数据为：\n',
#      detail.iloc[])

### loc内部传入表达式
# print('detail中order_id为458的dishes_name为：\n',
#     detail.loc[detail['order_id']== 458,
#     ['order_id','dishes_name']])#程序有错
#
lineser = detail[detail['order_id'].isin([458])]

print('detail中order_id为458的第1,5列数据为：\n', lineser.iloc[:, [1, 5]])
'''#print('detail中order_id为458的第1,5列数据为：\n',
#     detail.iloc[detail['order_id'].isin([458]),[1,5]])
#print('detail中order_id为458的第1,5列数据为：\n',
#      detail.iloc[(detail['order_id']=='458').values,[1,5]])
这段代码有误'''
# print('列名为dishes_name行名为2,3,4,5,6的数据为：\n',
#      detail.loc[])
#
# print('列位置为5,行位置为2至6的数据为：\n',detail.iloc[])
#

'''###将order_id为458的，变换为45800
#detail.loc[detail['order_id']=='458','order_id'] = '45800'
#print('更改后detail中order_id为458的order_id为：\n',
#     detail.loc[detail['order_id']=='458','order_id'])
#print('更改后detail中order_id为45800的order_id为：\n',
#     detail.loc[detail['order_id']=='45800','order_id'])
这段代码有误
'''

# detail['payment'] =  detail['counts']*detail['amounts']
# print('detail新增列payment的前五行为：','\n',
#      detail['payment'].)
#
# detail['pay_way'] = '现金支付'
# print('detail新增列pay_way的前五行为：','\n',
#      detail['pay_way'].)
#
# print('删除pay_way前deatil的列索引为：','\n',detail.)
# detail.drop( 'pay_way',axis = 1,inplace = True)
# print('删除pay_way后detail的列索引为：','\n',detail.)
#
# print('删除1-10行前detail的长度为：',len(detail))
# detail.drop(,axis = 0,inplace = True)
# print('删除1-10行后detail的列索引为：',len(detail))
#
# import numpy as np
# print('订单详情表中amount（价格）的平均值为：', np.(detail['amounts']))
#
# print('订单详情表中amount（价格）的平均值为：', detail['amounts'].)
#

# print('订单详情表counts和amounts两列的描述性统计为：\n',
#      detail[['counts','amounts']].)

# print('订单详情表dishes_name频数统计结果前10为：\n',
#      detail['dishes_name'].value_counts()[0:10])

# detail['dishes_name'] = detail['dishes_name'].astype('category')
# print('订单信息表dishes_name列转变数据类型后为：',detail['dishes_name'].dtypes)
#

# print('订单信息表dishes_name的描述统计结果为：\n',
#      detail['dishes_name'].describe())
