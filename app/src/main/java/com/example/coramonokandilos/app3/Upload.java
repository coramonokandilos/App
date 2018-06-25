package com.example.coramonokandilos.app3;


import com.google.firebase.database.Exclude;

public class Upload {
    private String mImageUrl;
    private String mComment;
    private String mKey;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String imageUrl) {

        mImageUrl = imageUrl;

//        if (comment.trim().equals("")) {
//            comment = "";
//        }
//
//        mComment = comment;
    }


    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getmComment() {return mComment;}

    public void setComment(String comment) { mComment = comment;}

    @Exclude
    public String getKey(){
        return mKey;
    }

    @Exclude
    public void setKey(String key){
        mKey = key;
    }
}
