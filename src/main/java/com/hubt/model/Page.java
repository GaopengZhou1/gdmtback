package com.hubt.model;

public class Page {
	private int pageNumber; //每页的条数
    private int offset; //数据库查询索引
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
