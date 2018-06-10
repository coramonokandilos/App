package com.example.coramonokandilos.app3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.a).setOnClickListener(buttonClickListener);
        findViewById(R.id.b).setOnClickListener(buttonClickListener);
        findViewById(R.id.c).setOnClickListener(buttonClickListener);
        findViewById(R.id.d).setOnClickListener(buttonClickListener);
        findViewById(R.id.e).setOnClickListener(buttonClickListener);
        findViewById(R.id.f).setOnClickListener(buttonClickListener);
        findViewById(R.id.g).setOnClickListener(buttonClickListener);
        findViewById(R.id.h).setOnClickListener(buttonClickListener);
        findViewById(R.id.i).setOnClickListener(buttonClickListener);
        findViewById(R.id.j).setOnClickListener(buttonClickListener);
        findViewById(R.id.k).setOnClickListener(buttonClickListener);
        findViewById(R.id.l).setOnClickListener(buttonClickListener);
        findViewById(R.id.m).setOnClickListener(buttonClickListener);
        findViewById(R.id.n).setOnClickListener(buttonClickListener);
        findViewById(R.id.o).setOnClickListener(buttonClickListener);
        findViewById(R.id.p).setOnClickListener(buttonClickListener);
        findViewById(R.id.q).setOnClickListener(buttonClickListener);
        findViewById(R.id.r).setOnClickListener(buttonClickListener);
        findViewById(R.id.s).setOnClickListener(buttonClickListener);
        findViewById(R.id.t).setOnClickListener(buttonClickListener);
        findViewById(R.id.u).setOnClickListener(buttonClickListener);
        findViewById(R.id.v).setOnClickListener(buttonClickListener);
        findViewById(R.id.w).setOnClickListener(buttonClickListener);
        findViewById(R.id.x).setOnClickListener(buttonClickListener);
        findViewById(R.id.y).setOnClickListener(buttonClickListener);
        findViewById(R.id.z).setOnClickListener(buttonClickListener);




    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.a:
                    MediaPlayer a = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    a.start();
                    break;
                case R.id.b:
                    MediaPlayer b = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    b.start();
                    break;
                case R.id.c:
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    c.start();
                    break;
                case R.id.d:
                    MediaPlayer d = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    d.start();
                    break;
                case R.id.e:
                    MediaPlayer e = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    e.start();
                    break;
                case R.id.f:
                    MediaPlayer f = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    f.start();
                    break;
                case R.id.g:
                    MediaPlayer g = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    g.start();
                    break;
                case R.id.h:
                    MediaPlayer h = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    h.start();
                    break;
                case R.id.i:
                    MediaPlayer i = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    i.start();
                    break;
                case R.id.j:
                    MediaPlayer j = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    j.start();
                    break;
                case R.id.k:
                    MediaPlayer k = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    k.start();
                    break;
                case R.id.l:
                    MediaPlayer l = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    l.start();
                    break;
                case R.id.m:
                    MediaPlayer m = MediaPlayer.create(getApplicationContext(), R.raw.c_letter);
                    m.start();
                    break;
            }
        }
    };

}
