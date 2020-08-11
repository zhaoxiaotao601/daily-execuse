package com.zxt.po;

import java.util.List;

public class PageInfo {
    //每页显示的个数
    private int pageSize;
    //当前显示第几页
    private int pageNumber;
    //总页数
    private long total;
    //当前页显示的数据
    private List<?> list;

    public int getPageSize(int pageSize) {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
