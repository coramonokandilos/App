package com.example.coramonokandilos.app3;

import com.google.firebase.database.Exclude;

public class UserComment {

    private String mComment;
    private String mCommentKey;

    public UserComment() {
        //empty constructor
    }

    public UserComment(String comment) {
        mComment = comment;
    }

    public String getUserComment(){
        return mComment;
    }

    @Exclude
    public String getKey(){
        return mCommentKey;
    }

    @Exclude
    public void setKey(String key){
        mCommentKey = key;
    }

}
