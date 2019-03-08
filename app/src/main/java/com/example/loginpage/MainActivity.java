package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1, ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.loginButton);
        ed1 = (EditText) findViewById(R.id.UserNameTxt);
        ed2 = (EditText)findViewById(R.id.PasswordTxt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


