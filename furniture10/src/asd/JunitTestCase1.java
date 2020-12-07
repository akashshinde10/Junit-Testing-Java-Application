package asd;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class JunitTestCase1 {

	@Test
	public void chairtest() 
	{
	OrderPage s1 = new OrderPage(0);
	Scanner s = new Scanner(System.in);
	System.out.println("\n Enter Chair Count =");
	int i=s.nextInt();
	boolean x =s1.chairtest1(i);
	assertSame(true, x);
	System.out.println("\nTest Case 10 Implemented");

	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Test
	public void diningtest()
	{
	OrderPage s1 = new OrderPage(0);
	Scanner s = new Scanner(System.in);
	System.out.println("\n Enter Dining Table Count =");
	int i1=s.nextInt();
	boolean x =s1.diningtest1(i1);
	assertTrue(x);
	System.out.println("\nTest Case 11 Implemented");

	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	@Test
	public void loungetest()
	{
	OrderPage s1 = new OrderPage(0);
	Scanner s = new Scanner(System.in);
	System.out.println("\n Enter Lounge Count =");
	int i2=s.nextInt();
	boolean x =s1.loungetest1(i2);
	assertNotSame(false, x);
	System.out.println("\nTest Case 8 Implemented");

	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	@Test
	public void sofatest()
	{
	OrderPage s1 = new OrderPage(0);
	Scanner s = new Scanner(System.in);
	System.out.println("\n Enter Sofa Count =");
	int i3=s.nextInt();
	boolean x =s1.sofatest1(i3);
	assertNotEquals(false, x);
	System.out.println("\nTest Case 9 Implemented");

	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	@Test
	public void bedtest()
	{
	OrderPage s1 = new OrderPage(0);
	Scanner s = new Scanner(System.in);
	System.out.println("\n Enter Bed Count =");
	int i4=s.nextInt();
	boolean x =s1.bedtest1(i4);
	assertEquals(true, x);
	System.out.println("\nTest Case 7 Implemented");

	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	@Test
	public void addresstest()
	{
	ConfirmOrder s1 = new ConfirmOrder(0);
	Scanner s = new Scanner(System.in);
	System.out.println("\n Enter Address Present in database =");
	String a=s.nextLine();
	boolean x =s1.addresstest1(a);
	assertEquals(true, x);
	System.out.println("\nTest Case 6 Implemented");

	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
