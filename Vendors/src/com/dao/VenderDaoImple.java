package com.dao;

import static utils.DBUtils.fetchConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import com.pojo.Vendors;


public class VenderDaoImple implements IVendorDao {
	
	private Connection cn;
	private PreparedStatement pst,pst1,pst2,pst3,pst4;
	
	public VenderDaoImple() throws Exception{
		
		cn=fetchConnection();
	
		pst = cn.prepareStatement("select * from vendors");
		pst1 =cn.prepareStatement("insert into vendors values(?,?,?,?,?,?)");
		pst2 =cn.prepareStatement("select * from vendors where city=?");
		pst3 = cn.prepareStatement("update vendors set city=?,phone=? where id=?");
		pst4 = cn.prepareStatement("delete from vendors where id=?");
		
	
	}



	@Override
	public void showTable() throws SQLException{
		try(ResultSet rst = pst.executeQuery()){		
			while(rst.next()){
			 System.out.println(new Vendors(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getLong(5),rst.getDate(6)));
			 }
	}}


	@Override
	public HashMap<Integer, Vendors> insertVendorDetails(int id,String name, String email, String city, long phn, Date reg) throws Exception
	{
		
		HashMap<Integer, Vendors> hm = new HashMap<>();
		
				pst1.setInt(1, id);
				pst1.setString(2,name);
				pst1.setString(3,email);
				pst1.setString(4,city);
				pst1.setLong(5,phn);
				pst1.setDate(6,reg);
				int a=pst1.executeUpdate();
				if(a==1){
					System.out.println("Values Inserted Successfully");
					hm.put(id,new Vendors(id, name, email, city, phn, reg));
					return hm;
				}
				System.out.println("Values not inserted");
		
			
		return new HashMap<Integer, Vendors>();
	
	}


	@Override
	public Vendors getVendorDetails(String city) throws Exception 
	{
	
		pst2.setString(1, city);
		
		try(ResultSet rst = pst2.executeQuery())
		{	
			if(rst.next())
				 return new Vendors(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getLong(5),rst.getDate(6));
			else
				return null;	
		}
	}
	

	@Override
	public void updateVendorDetails(String city, long phn, int id) throws Exception {
		
		pst3.setString(1,city);
		pst3.setLong(2, phn);
		pst3.setInt(3, id);
		int a = pst3.executeUpdate();
		
		System.out.println("showing a:=" +a);
		if (a<0)
		{
			//System.out.println("showing a:=" +a);
			System.out.println("Values not insterted!!!");
		}
		System.out.println("Updation Completed");

	}



	@Override
	public void deleteVendor(int id) throws Exception {
		
		pst4.setInt(1, id);
		int a = pst4.executeUpdate();
		if ( a<0 )
		{
			//System.out.println("showing a:=" +a);
			System.out.println("Unable to delete Vendor");
		}
		System.out.println("Vendor Deleted!!!");

	}



	public void cleanUp() throws SQLException{
		
		if(pst4!=null)
			pst4.close();
		if(pst3!=null)
			pst3.close();
		if(pst2!=null)
			pst2.close();
		if(pst1!=null)
			pst1.close();
		if(pst!=null)
			pst.close();
	}
	
	
}
