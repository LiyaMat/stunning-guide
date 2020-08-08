package com.example.simplelogin;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;
import android.widget.TextView;


public class status extends AppCompatActivity {
    TextView textr;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String text=getIntent().getExtras().getString("Text");
        textr = (TextView)findViewById(R.id.text);
        textr.setText(text);

    }
    }



