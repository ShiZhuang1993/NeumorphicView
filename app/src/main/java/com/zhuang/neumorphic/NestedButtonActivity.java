package com.zhuang.neumorphic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zhuang.neumorphic.directuse.PolygonButton;


public class NestedButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.github.sshadkany.android_neumorphic_test_app.R.layout.activity_nested_button);

        PolygonButton polygonButton = findViewById(com.github.sshadkany.android_neumorphic_test_app.R.id.polygon_button);

        findViewById(com.github.sshadkany.android_neumorphic_test_app.R.id.backgroundLayout).setBackgroundColor(polygonButton.background_color);  // set layout background color from neo object.

        polygonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("neo", "onClick: I am poly button !!");
            }
        });
    }
}