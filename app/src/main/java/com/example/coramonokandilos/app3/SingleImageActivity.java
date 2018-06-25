package com.example.coramonokandilos.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class SingleImageActivity extends AppCompatActivity {

    private ImageView mImageView;

    private DatabaseReference mDatabaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);

        Intent intent = getIntent();
        final String itemKey = intent.getStringExtra("ID_KEY");

        mImageView = findViewById(R.id.image_view_upload);

        mDatabaseRef = FirebaseDatabase.getInstance().getReference("uploads");

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
    }
}


