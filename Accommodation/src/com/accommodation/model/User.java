package com.accommodation.model;
import java.util.ArrayList;

public class User {
   private String userID;
   private String userName;
   private String password;
   private String profilePhotoPath;

    public User(String userID, String userName, String password, String profilePhotoPath) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.profilePhotoPath = profilePhotoPath;
    }

    public User(){

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePhotoPath() {
        return profilePhotoPath;
    }

    public void setProfilePhotoPath(String profilePhotoPath) {
        this.profilePhotoPath = profilePhotoPath;
    }
}

