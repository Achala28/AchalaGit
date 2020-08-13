package com.virtusa.web.model;

import com.virtusa.web.Patient;


import java.text.*;
import java.util.*;
import java.sql.*;

public class PatientDao 	
{
   static Connection currentCon = null;
   static ResultSet rs = null;  
	
	
	
   public static Patient login(Patient bean) {
	
      //preparing some objects for connection 
      Statement stmt = null;    
	
      int id = bean.getId();    
      String password = bean.getPassword();   
	    
      String searchQuery ="select * from PatientData where id="+id+" AND pass=md5('"+password+"');";
            
	    
   // "System.out.println" prints in the console; Normally used to trace the process
  
	    
   try 
   {
      //connect to DB 
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      rs = stmt.executeQuery(searchQuery);	        
      boolean more = rs.next();
	       
      // if user does not exist set the isValid variable to false
      if (!more) 
      {
    	 
         System.out.println("Sorry, you are not a registered user! Please sign up first");
         bean.setValid(false);
      } 
	        
      //if user exists set the isValid variable to true
      else if (more) 
      {  
    	 bean.setId(rs.getInt("id"));
     	 bean.setName(rs.getString("name"));
     	 bean.setHeartrate(rs.getInt("heartrate"));
     	 bean.setBloodpressure(rs.getInt("bloodpressure"));
     	 bean.setPhno(rs.getInt("phno"));
     	 bean.setTemperature(rs.getInt("temperature"));
     	 bean.setDoctorid(rs.getInt("doctorid"));
         bean.setValid(true);
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
   finally 
   {
      if (rs != null)	{
         try {
            rs.close();
         } catch (Exception e) {}
            rs = null;
         }
	
      if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
            stmt = null;
         }
	
      if (currentCon != null) {
         try {
            currentCon.close();
         } catch (Exception e) {
         }

         currentCon = null;
      }
   }

return bean;
	
   }	
}
