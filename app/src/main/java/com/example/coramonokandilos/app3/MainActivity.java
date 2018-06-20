package com.example.coramonokandilos.app3;

import android.content.Intent;
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

    public void nextPage(View view) {
        Intent startNewActivity = new Intent(this, PictureUploadActivity.class);
        startActivity(startNewActivity);
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
                    MediaPlayer a = MediaPlayer.create(getApplicationContext(), R.raw.a);
                    a.start();
                    break;
                case R.id.b:
                    MediaPlayer b = MediaPlayer.create(getApplicationContext(), R.raw.b);
                    b.start();
                    break;
                case R.id.c:
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.c);
                    c.start();
                    break;
                case R.id.d:
                    MediaPlayer d = MediaPlayer.create(getApplicationContext(), R.raw.d);
                    d.start();
                    break;
                case R.id.e:
                    MediaPlayer e = MediaPlayer.create(getApplicationContext(), R.raw.e);
                    e.start();
                    break;
                case R.id.f:
                    MediaPlayer f = MediaPlayer.create(getApplicationContext(), R.raw.f);
                    f.start();
                    break;
                case R.id.g:
                    MediaPlayer g = MediaPlayer.create(getApplicationContext(), R.raw.g);
                    g.start();
                    break;
                case R.id.h:
                    MediaPlayer h = MediaPlayer.create(getApplicationContext(), R.raw.h);
                    h.start();
                    break;
                case R.id.i:
                    MediaPlayer i = MediaPlayer.create(getApplicationContext(), R.raw.i);
                    i.start();
                    break;
                case R.id.j:
                    MediaPlayer j = MediaPlayer.create(getApplicationContext(), R.raw.j);
                    j.start();
                    break;
                case R.id.k:
                    MediaPlayer k = MediaPlayer.create(getApplicationContext(), R.raw.k);
                    k.start();
                    break;
                case R.id.l:
                    MediaPlayer l = MediaPlayer.create(getApplicationContext(), R.raw.l);
                    l.start();
                    break;
                case R.id.m:
                    MediaPlayer m = MediaPlayer.create(getApplicationContext(), R.raw.m);
                    m.start();
                    break;
                case R.id.n:
                    MediaPlayer n = MediaPlayer.create(getApplicationContext(), R.raw.n);
                    n.start();
                    break;
                case R.id.o:
                    MediaPlayer o = MediaPlayer.create(getApplicationContext(), R.raw.o);
                    o.start();
                    break;
                case R.id.p:
                    MediaPlayer p = MediaPlayer.create(getApplicationContext(), R.raw.p);
                    p.start();
                    break;
                case R.id.q:
                    MediaPlayer q = MediaPlayer.create(getApplicationContext(), R.raw.q);
                    q.start();
                    break;
                case R.id.r:
                    MediaPlayer r = MediaPlayer.create(getApplicationContext(), R.raw.r);
                    r.start();
                    break;
                case R.id.s:
                    MediaPlayer s = MediaPlayer.create(getApplicationContext(), R.raw.s);
                    s.start();
                    break;
                case R.id.t:
                    MediaPlayer t = MediaPlayer.create(getApplicationContext(), R.raw.t);
                    t.start();
                    break;
                case R.id.u:
                    MediaPlayer u = MediaPlayer.create(getApplicationContext(), R.raw.u);
                    u.start();
                    break;
                case R.id.v:
                    MediaPlayer v = MediaPlayer.create(getApplicationContext(), R.raw.v);
                    v.start();
                    break;
                case R.id.w:
                    MediaPlayer w = MediaPlayer.create(getApplicationContext(), R.raw.w);
                    w.start();
                    break;
                case R.id.x:
                    MediaPlayer x = MediaPlayer.create(getApplicationContext(), R.raw.x);
                    x.start();
                    break;
                case R.id.y:
                    MediaPlayer y = MediaPlayer.create(getApplicationContext(), R.raw.y);
                    y.start();
                    break;
                case R.id.z:
                    MediaPlayer z = MediaPlayer.create(getApplicationContext(), R.raw.z);
                    z.start();
                    break;
            }
        }
    };

}
