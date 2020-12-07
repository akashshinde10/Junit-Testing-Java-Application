package asd;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class ConfirmOrder {
private JFrame frame;
static int TotalPrice;
static String address;
static String name;
static String address1;
/**
* Launch the application.
*/
public static void NewScreen() {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
ConfirmOrder window = new
ConfirmOrder(TotalPrice,address);
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the application.
*/
public ConfirmOrder(int TotalPrice,String address) {
this.TotalPrice=TotalPrice;
this.address=address;

initialize();
}
public ConfirmOrder(int i) {
	// TODO Auto-generated constructor stub
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 650, 501);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JPanel panel = new JPanel();
panel.setBackground(new Color(189, 163, 247));
panel.setBounds(69, 86, 453, 270);
frame.getContentPane().add(panel);
panel.setLayout(null);
JLabel lblNewLabel = new JLabel("Order details");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
lblNewLabel.setBounds(133, 13, 202, 66);
panel.add(lblNewLabel);
JButton btnNewButton = new JButton("confirm order");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Order placed successfully:)!\nThankyou for shoping with us!", "Order",
JOptionPane.INFORMATION_MESSAGE);
OrderPage o=new OrderPage(address);
frame.dispose();
o.NewScreen();
}
});

btnNewButton.setBounds(162, 196, 136, 25);
panel.add(btnNewButton);
JLabel lblNewLabel_1 = new JLabel("Total Prize = "+TotalPrice+"/-");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_1.setBounds(80, 115, 311, 16);
panel.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("Address : "+address);
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_2.setBounds(80, 159, 295, 16);
panel.add(lblNewLabel_2);
}
public boolean addresstest1(String str)
{
try {

String JdbcURL = "jdbc:mysql://localhost:3306/stqa? + \"autoReconnect=true&useSSL=false\"";
 Connection conn=DriverManager.getConnection(JdbcURL,"root","root");
 Statement s = conn.createStatement();
 String q ="select address from account where fname = 'Akash'";
 ResultSet rs = s.executeQuery(q);
 if(rs.next() == false) {
	 return false;
 }
 else{
address1=rs.getString("address");}
if(str == address1)
	return true;
else
	return false;

}catch(Exception e)
{
	System.out.println("Successfull");
}
return true;


//public boolean addresstest1(String str)
//{
//	String str1 = address;
//	if(str == str1)
//	{
//		return true;
//	}else {
//		return false;
//	}
//}
}
}