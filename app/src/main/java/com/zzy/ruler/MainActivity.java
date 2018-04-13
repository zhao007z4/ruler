package com.zzy.ruler;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ruler);

        HeightView hv = findViewById(R.id.hvRuler);
        getPhysicsSize(hv);

    }

    private void getPhysicsSize(HeightView hv) {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getRealSize(point);
        DisplayMetrics dm = getResources().getDisplayMetrics();

        double physicsW = (point.x/ dm.xdpi)*25.4;
        double physicsH = (point.y / dm.ydpi)*25.4;

        hv.setPhysicSize(physicsW,physicsH,point.x,point.y);

    }
}
