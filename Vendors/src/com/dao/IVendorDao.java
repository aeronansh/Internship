package com.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;
import com.pojo.*;
public interface IVendorDao {
	
	
	void showTable() throws SQLException;
	
	
	HashMap<Integer, Vendors> insertVendorDetails(int id,String name, String email, String city,long phn, Date reg) throws Exception;
	
	Vendors getVendorDetails(String city) throws Exception;
	
	void updateVendorDetails(String city, long phn,int id) throws Exception;
	
	void deleteVendor(int id) throws Exception;

}
