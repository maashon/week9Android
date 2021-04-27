package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Change ch=new Change();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        TextView dest=(TextView)findViewById(R.id.text);
        EditText inp=(EditText)findViewById(R.id.edit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String ans=ch.fun1(inp.getText().toString()) ;
             dest.setText(ans);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans=ch.fun2(inp.getText().toString()) ;
                dest.setText(String.valueOf(ans));
            }
        });

    }
}