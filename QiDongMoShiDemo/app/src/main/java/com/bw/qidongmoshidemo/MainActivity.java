package com.bw.qidongmoshidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        Log.i("A","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("A","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A","onRestart");
    }


}
