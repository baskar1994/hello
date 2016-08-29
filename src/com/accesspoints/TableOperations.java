package com.accesspoints;

import java.util.List;

public interface TableOperations {
	public boolean insert(Object row);
	public boolean delete(Object row);
	public boolean update(Object row);
	public List getRows();
	public Object getRow(int id);
}
