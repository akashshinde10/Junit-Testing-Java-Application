package asd;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;
public class JunitTestCase {
@Test
public void test()
{
Signup si = new Signup(0);
String p1,p2;
Scanner s = new Scanner(System.in);
System.out.println("\n Enter password =");
p1=s.nextLine();
boolean x = si.passValidation(p1);
assertEquals(true, x);
System.out.println("\nTest Case 2 Implemented");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
@Test
public void emailTest()
{
Signup s1 = new Signup(0);
Scanner s = new Scanner(System.in);
System.out.println("\n Enter email =");
String p1=s.nextLine();
boolean x =s1.emailValidation(p1);
assertEquals(true, x);
System.out.println("\nTest Case 5 Implemented");

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

@Test
public void PhnTest()
{
Signup s1 = new Signup(0);
Scanner s = new Scanner(System.in);
System.out.println("\n Enter Phone Number =");
String str=s.nextLine();
boolean x =s1.phnValidation(str);
assertNotEquals(false, x);
System.out.println("\nTest Case 4 Implemented");

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
@Test
public void Accnt_exists()
{
Login l = new Login(0);
Scanner s = new Scanner(System.in);
System.out.println("\n Enter username =");
String p1=s.nextLine();
boolean x =l.does_exist(p1);
assertNotEquals(false, x);
System.out.println("\nTest Case 3 Implemented");

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
@Test
public void addrval()
{
Signup s2 = new Signup(0);
Scanner s = new Scanner(System.in);
//System.out.println("\n Enter Address =");
//String str=s.nextLine();
String str = "chinchwad";
boolean x =s2.addrval(str);
assertNotEquals(false, x);
System.out.println("\nTest Case 1 Implemented");

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}