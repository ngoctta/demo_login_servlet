/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL
 */
public class User {
    int id;
    String LoginName;
    String Password;

    public User(int id, String LoginName, String Password) {
        this.id = id;
        this.LoginName = LoginName;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getLoginName() {
        return LoginName;
    }

    public String getPassword() {
        return Password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLoginName(String LoginName) {
        this.LoginName = LoginName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
