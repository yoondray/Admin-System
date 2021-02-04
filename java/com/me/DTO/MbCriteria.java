package com.me.DTO;
public class MbCriteria {
	
	private int pageNo;
	private int index;
	private String type;
	private String meword;
	
	public MbCriteria() {
		this(1,5);
	}

	@Override
	public String toString() {
		return "MemCriteria [pageNo=" + pageNo + ", index=" + index + "]";
	}

	public MbCriteria(int pageNo, int index) {
		// TODO Auto-generated constructor stub
		this.pageNo=pageNo;
		this.index=index;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMeword() {
		return meword;
	}


	public void setMeword(String meword) {
		this.meword = meword;
	}
	
	
	
}
