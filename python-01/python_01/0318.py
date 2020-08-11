# import matplotlib.pyplot as plt
# import numpy as np
#
# plt.figure(figsize=(6, 4))
# x = np.arange(0, np.pi * 4, 0.01)
# y = np.cos(x)
# # df.plot()
# plt.plot(x, y, "g-", linewidth=2.0)
# plt.xlabel("x")  # x轴文字
# plt.ylabel("cos(x)")  # y轴文字
# plt.ylim(-1, 1)  # y轴范围
# plt.title("y=cos(x)")  # 图表标题
# plt.grid(True)
# plt.show()
#
# import pandas as pd
# import numpy as np
# import matplotlib.pyplot as plt
# path='一、车次上车人数统计表.xlsx';
# data=pd.read_excel(path);
# tb=data.loc[data['车次'] == 'D02',['日期','上车人数']].sort_values('日期');
# x=np.arange(1,len(tb.iloc[:,0])+1)
# y1=tb.iloc[:,1]
# plt.rcParams['font.sans-serif'] = 'SimHei'     # 设置字体为SimHei
# plt.scatter(x,y1)
# plt.xlabel('日期')
# plt.ylabel('上车人数')
# plt.xticks([1,5,10,15,20,24], tb['日期'].values[[0,4,9,14,19,23]], rotation = 45)
# plt.title('D02车次上车人数散点图')

import csv

csvFile = open("./data.csv", 'w', newline='', encoding='UTF-8')
writer = csv.writer(csvFile)
csvRow = []

f = open("C:/Users/Administrator/Desktop/python0325data/python0325data/student.txt", 'r', encoding='UTF-8')
for line in f:
    csvRow = line.split()
    writer.writerow(csvRow)

f.close()
csvFile.close()
