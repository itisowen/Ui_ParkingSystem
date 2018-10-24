/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author fluke
 */
public class Check {
    
    public static void main(String[] args) {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String userr;
	Scanner input = new Scanner(System.in);
	userr = input.next();
	try{
	    String sql = "SELECT * FROM `carlist` WHERE user=?";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, userr);
	    rs = pst.executeQuery();
	    while(rs != null && rs.next()){
		System.out.print("|");
                System.out.print(rs.getString("car"));
                System.out.print("   ");
                System.out.println(rs.getString("license")+"|");
	    }
	}catch(Exception e){
	    System.out.println(e);
	}
    }
}
