package com.example.uoodma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

    }

    public void onLoginCLick(View view) {
        Intent intent =new Intent(MainActivity.this,loginActivity.class);
        startActivity(intent);
    }

    public void onRegisterCLick(View view) {
        Intent intent =new Intent(MainActivity.this,registerActivity.class);
        startActivity(intent);
    }
}
