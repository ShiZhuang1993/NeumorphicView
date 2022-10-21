package com.zhuang.neumorphic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.sshadkany.android_neumorphic_test_app.R;
import com.zhuang.neumorphic.directuse.neoText;

public class NeoTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neo_text);
        neoText neotext = findViewById(R.id.neotext);
        findViewById(R.id.backgroundLayout).setBackgroundColor(neotext.background_color);
    }
}