package com.univ.DB;
import  java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection implements DBconfig{
	
	    public static Connection getconn()
	    {
	    Connection con=null;
	    try{
	        Class.forName(Driver);
	        con=DriverManager.getConnection(URL,UNM,PW);
	    }
	    catch(Exception tt)
	    {
	        System.out.println(tt);
	    }
	    return con;
	    }
	}

