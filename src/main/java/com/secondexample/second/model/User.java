
package com.secondexample.second.model;

public class User {
  private String name;
   private String pwd;

   public User(){

   }

   public User(String uname, String password) {
       this.name = uname;
       this.pwd = password;
   }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }


}

