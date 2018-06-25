package com.example.coramonokandilos.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class SingleImageActivity extends AppCompatActivity {

    private ImageView mImageView;

    private FirebaseDatabase database;

    private DatabaseReference mDatabaseRef;

    /*FOR THE COMMENTING*/

    private EditText mCommentEditText;
    private ImageButton mCommentButton;
    private TextView commentView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);

        Intent intent = getIntent();
        final String itemKey = intent.getStringExtra("ID_KEY");

        database = FirebaseDatabase.getInstance();

        /*FOR THE COMMENTING*/

        mCommentButton = findViewById(R.id.comment_button);
        mCommentEditText = findViewById(R.id.comment_text);
        commentView = findViewById(R.id.comment_text_view);

        mImageView = findViewById(R.id.image_view_upload);

        mDatabaseRef = database.getReference("uploads");

        mDatabaseRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                DatabaseReference imageUrlRef = FirebaseDatabase.getInstance().getReference("uploads").child(itemKey);
                imageUrlRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Upload upload = dataSnapshot.getValue(Upload.class);

                        String imageUrl = upload.getImageUrl();
                        try {
                            Picasso.with(getApplicationContext())
                                    .load(imageUrl)
                                    .placeholder(R.mipmap.ic_launcher)
                                    .into(mImageView);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {}
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });

        mCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadComment(itemKey);
                mCommentEditText.setText("");
            }
        });
    }

    private void uploadComment(String itemKey){
        if(mCommentEditText != null) {
            String comment = mCommentEditText.getText().toString().trim();
            mDatabaseRef.child(itemKey).child("mComment").setValue(comment); //take the id and set the data to upload file

            DatabaseReference commentRef = FirebaseDatabase.getInstance().getReference("uploads").child(itemKey).child("mComment");
            commentRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String comment = dataSnapshot.getValue(String.class);
                    commentView.setText(comment);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });


        } else {
            Toast.makeText(this, "No comment written", Toast.LENGTH_SHORT).show();
        }
    }
}


