package com.bw.qidongmoshidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
            }
        });
        Log.i("B","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("B","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("B","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("B","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("B","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("B","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("B","onRestart");
    }

}
