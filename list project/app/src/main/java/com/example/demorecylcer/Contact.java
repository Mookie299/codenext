package com.example.demorecylcer;

public class Contact {

    private int profilePic;
    private String name;
    private String info;

    public Contact(int profilePic, String name, String info) {
        this.profilePic = profilePic;
        this.name = name;
        this.info = info;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}


