package com.brainworks.Model;

public class User {
    private String name;
    private String panNo;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", panNo='" + panNo + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
