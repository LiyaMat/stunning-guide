package com.example.simplelogin;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Objects;
public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.gostatus);
        login.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
                {
                   String texthere="You have authenticated sucessfully";
                    Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                    Intent intent =new Intent(MainActivity.this, com.example.simplelogin.status.class);
                    intent.putExtra("Text",texthere);
                    startActivity(intent);

                }else
                {
                    String texthere="You have not authenticated sucessfully";
                    Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                    Intent intent =new Intent(MainActivity.this, com.example.simplelogin.status.class);
                    intent.putExtra("Text",texthere);
                    startActivity(intent);
                }
            }
        });
    }
}