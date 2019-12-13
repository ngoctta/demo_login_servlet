/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserController {
    static public User LayDSSV(String LoginName, String Password) throws ClassNotFoundException, SQLException{
        Connection connection = Controller.connectDB.ConnectionSqL();
        String sql = "Select Id, LoginName, Password from customers where LoginName=? and Password=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, LoginName);
        statement.setString(2, Password);
        
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
//            System.out.println(rs.getString("LoginName"));
//            System.out.println(rs.getString("Password"));
           return new User(rs.getInt("Id"), rs.getString("LoginName"), rs.getString("Password"));
        }
        return null;
    }
}
