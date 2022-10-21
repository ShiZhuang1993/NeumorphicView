package com.zhuang.neumorphic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.sshadkany.android_neumorphic_test_app.R;
import com.zhuang.neumorphic.directuse.RectButton;

public class RectButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rect_button);

        RectButton recButton = findViewById(R.id.rec_image_button);

        findViewById(R.id.backgroundLayout).setBackgroundColor(recButton.background_color);  // set layout background color from neo object.

        recButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RectButtonActivity.this,"onClick: I am rect button !!",Toast.LENGTH_LONG).show();
            }
        });
    }
}