package com.example.coramonokandilos.app3;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class CommentAdapter {

    private List<UserComment> mComments;
    private Context mContext;

    public CommentAdapter(Context context, List<UserComment> comments) {
        mContext = context;
        mComments = comments;
    }


}
