package com.example.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //关联
        image = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.bt1);

    }
    public void change(View view){
        image.setImageResource(R.drawable.tank);
    }
    public void turn(View view){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
