package com.thinking.grafisimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class GrafikKlasik extends AppCompatActivity {
    private Button tekan;
    private GLSurfaceView grafik1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafik_klasik);
        tekan = (Button) findViewById(R.id.button1);
        grafik1 = new HelloESSurfaceView(this);
        setContentView(grafik1);
    }

    @Override
    protected void onPause() {
        super.onPause();
        grafik1.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        grafik1.onResume();
    }

    class HelloESSurfaceView extends GLSurfaceView{
        public HelloESSurfaceView(Context context){
            super(context);
            setRenderer(new Segitiga());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
