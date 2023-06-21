package com.db.dao;

import java.util.List;

public interface Db 
{
	void createDb();
	void useDb();
	void createTable();
	void insertData();
	List getData();
}
