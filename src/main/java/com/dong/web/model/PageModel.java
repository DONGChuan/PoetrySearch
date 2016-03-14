/**
 * 
 */
package com.dong.web.model;

import java.util.List;

/**
 * @author DONGChuan
 * Page model
 */
public class PageModel<T> {

	// Fields

	private int pageNo=1;    // Current page number
	private int pageSize=10; // Size of each page
	private int recordCount; // Total number of records
	private int pageCount;   // Total number of page
	private List<T> datas;   // List of data in page

	// Constructor

	public PageModel(){}
	
	public PageModel(int pageNo, int pageSize){
		this.pageNo=pageNo;
		this.pageSize=pageSize;
	}

	// Setters and getters

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		if(this.getRecordCount()<=0){
			return 0;
		}else{
			pageCount = (recordCount + pageSize - 1)/pageSize;
		}
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	
	
}
