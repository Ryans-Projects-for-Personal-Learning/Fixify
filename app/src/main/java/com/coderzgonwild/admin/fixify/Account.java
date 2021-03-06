package com.coderzgonwild.admin.fixify;
import java.io.Serializable;
import java.util.ArrayList;

public class Account {

    private String username;
    private String password;
    private String accountType;

    public Account(String username, String password, String accountType) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }


    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public String getAccountType() {return accountType;}

    public String toString(){
        return username + password + accountType;
    }


}
