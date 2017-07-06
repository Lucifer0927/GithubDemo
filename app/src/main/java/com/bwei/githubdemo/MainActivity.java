package com.bwei.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
               switch(event.getAction()){//View点击事件选择使用
                   case MotionEvent.ACTION_DOWN:
                       Toast.makeText(MainActivity.this,"按下",Toast.LENGTH_SHORT).show();
                   break;
                   case MotionEvent.ACTION_UP:
                       Toast.makeText(MainActivity.this,"抬起",Toast.LENGTH_SHORT).show();
                       break;
                   default :
                   break;
               }

                return true;
            }
        });
    }
}
