package com.brodasistah.mx.hmx2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.TextView;
import com.google.android.gms.vision.CameraSource;
import org.w3c.dom.Text;


public class MainScreen extends AppCompatActivity {
    SurfaceView cameraView;
    TextView textView;
    CameraSource cameraSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        cameraView=(SurfaceView)findViewById(R.id.surface_view);
        textView=(TextView)findViewById(R.id.text_view);
    }
}
