package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	
public static WebDriver driver;
	
	public static void browserLaunch() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	}
	
	public static void maxWin() {
    driver.manage().window().maximize();
	}

	public static void url(String ul) {
		driver.get(ul);

	}
	
	public static void sendValues(String s , WebElement v) {
		v.sendKeys(s);
      
	}
	
	public static void click(WebElement cl) {
		cl.click();

}
	
	public static void closeWindow() {
       driver.close();
	}
	
	public static String dbdatas()  {
		Connection con = null;
		String cidClmn = "";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "TomJerry");
			String que = "Select First_Name from employees where First_Name ='David'";
			PreparedStatement pr = con.prepareStatement(que);
			ResultSet ex = pr.executeQuery();
			
			for (int i = 0; i < que.length(); i++) {
				
			
			if (ex.next()) {
				
			cidClmn = ex.getString("First_Name");
				
//				String cnameClmn = ex.getString("cname");
//				System.out.println(cnameClmn);
				
			}
				
			
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
	
	finally {
		
		    try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
	return 	cidClmn;
	}
	
	
	
}
