package com.example.coramonokandilos.app3;

public class UserComment {
    private String comment;
    public UserComment() {
        //empty constructor
    }
    public UserComment(String comment) {
        this.comment = comment;
    }
    public String getUserComment() {
        return comment;
    }
}
