package asd;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Scanner;

import org.junit.Test;

public class JunitTestCase2 {

	@Test
	  public void sqlcloseconnection() throws ClassNotFoundException, SQLException
	  {
	      Login sql=new Login();
	      assertNotEquals(false,sql.closeConnection());
	      System.out.print("\nConnection Closed  \n"); 
	  	System.out.println("Test Case 12 Implemented");

		  	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  }

	@Test
	  public void totalrecords() throws ClassNotFoundException, SQLException
	  {
	      Login sql1=new Login();
	      int check=sql1.recordcheck();
	      assertNotEquals(0,check);
	      System.out.print("\nCount of records:  "+check); 
	  	System.out.println("\nTest Case 14 Implemented");

		  	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  }
	
	@Test
	  public void sqlopenconnection() throws ClassNotFoundException, SQLException
	  {
	      Login sql=new Login();
	      assertSame(true,sql.getConnection());
	  	System.out.println("Test Case 13 Implemented");

	  	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      
	  }
}
