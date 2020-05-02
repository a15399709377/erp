package com.erp.pojo;
/**
 *  id    INT(6) AUTO_INCREMENT PRIMARY KEY NOT NULL,#仓库序号
  housename VARCHAR(50) NOT NULL,#仓库名称
  maxnum INT NOT NULL
 */
public class warehouse {
private int id;
private String housename;
private int maxnum;

public warehouse() {
	super();
}
public warehouse(int id, String housename, int maxnum) {
	super();
	this.id = id;
	this.housename = housename;
	this.maxnum = maxnum;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHousename() {
	return housename;
}
public void setHousename(String housename) {
	this.housename = housename;
}
public int getMaxnum() {
	return maxnum;
}
public void setMaxnum(int maxnum) {
	this.maxnum = maxnum;
}
@Override
public String toString() {
	return "warehouse [id=" + id + ", housename=" + housename + ", maxnum=" + maxnum + "]";
}


}
