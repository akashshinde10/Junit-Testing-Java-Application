package asd;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCase3 {
	Login l = new Login();
	@Test
	  public void minimize()
	  {
		
	      assertEquals(false,l.minimize_button());
	      System.out.print("\n Minimize button not is clicked "); 
	  	System.out.println("\nTest Case 15 Implemented");

	  	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  }
	  @Test
	  public void maximize()
	  {

	      assertEquals(false,l.maximize_button());
	      System.out.print("\n Maximize button is not clicked "); 
		  	System.out.println("\nTest Case 17 Implemented");

	  	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  }
	  @Test
	  public void objectcreated()
	  {
		  assertNotNull(l);
		  System.out.println("\n Object Created without null values");
		  	System.out.println("\nTest Case 16 Implemented");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  }
	  @Test
	  public void valuenotsame()
	  {
		  Login l1 = new Login();
		  assertNotSame(l, l1);
		  	System.out.println("\nTest Case 18 Implemented");

		  System.out.println("\n Both objects created are different");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  }
}
