package com.univ.DAO;

import java.io.InputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.univ.DB.DBconnection;
import com.univ.DTO.ImageDTO;

public class ImageDAO {

	public int uploadFile(String fnm, String price, String type, InputStream in) {
	
		int x=0;
		int price1=Integer.parseInt(price);
		try {
			Connection con1=DBconnection.getconn();
		   PreparedStatement ps=con1.prepareStatement
			("insert into imagedata(imgname,prodnm,price) values(?,?,?)");
		  ps.setString(1, fnm);
		  ps.setString(2, type);
		  ps.setInt(3, price1);
		 x= ps.executeUpdate();
		 if(x==1)
		 {
	    String path="D:\\eclipse workspace\\organicprojectfrm\\src\\main\\webapp\\img"+fnm;
	    FileOutputStream fos=new FileOutputStream(path);
	     byte bt[]= in.readAllBytes();
		 fos.write(bt);
		 fos.close();
		 }

		}
		catch(Exception tt)
		{
			System.out.println(tt);
			}
		return x;
	}//upload
	
public List<Vector> getImageData()
	{
	  List<Vector> lst=new ArrayList<>();
	  try {
	     Connection con1= DBconnection.getconn();
	    Statement stmt= con1.createStatement();
	    ResultSet rs=stmt.executeQuery
	      ("select * from imagedata where status=0");

	    while(rs.next())
	    {
	      Vector v1=new Vector();
	      v1.add(rs.getInt(1));
	      v1.add(rs.getString(2));
	      v1.add(rs.getString(3));
	      v1.add(rs.getInt(4));

	      lst.add(v1);
	    }
	   }catch(Exception tt)
	  {System.out.println(tt);}
	  return lst;

	}

}


