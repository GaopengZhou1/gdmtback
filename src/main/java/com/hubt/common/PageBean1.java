package com.hubt.common;

import java.util.ArrayList;
import java.util.List;

public class PageBean1<T>  //粗略分页
{
    private List<T> rows = new ArrayList<T>();
    private int total;
 
    public PageBean1() {
        super();
    }
 
    public List<T> getRows() {
        return rows;
    }
 
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
 
    public int getTotal() {
        return total;
    }
 
    public void setTotal(int total) {
        this.total = total;
    }
    
}
