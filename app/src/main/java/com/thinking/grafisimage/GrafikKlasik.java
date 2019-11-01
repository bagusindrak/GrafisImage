package com.thinking.grafisimage;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.Button;

public class GrafikKlasik extends AppCompatActivity {
    private Button tekan;
    private GLSurfaceView grafik1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafik_klasik);
        tekan = (Button) findViewById(R.id.button1);
        grafik1 = new GLSurfaceView(this);
        setContentView(grafik1);
    }
}
