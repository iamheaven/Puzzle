package com.example.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //关联
        imageButton = findViewById(R.id.imageButton);
    }

    public void change1(View view){
        imageButton.setImageResource(R.drawable.tank);
    }
}
