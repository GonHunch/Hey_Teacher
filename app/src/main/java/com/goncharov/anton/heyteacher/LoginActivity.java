package com.goncharov.anton.heyteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button proceed;
    EditText user,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        proceed = (Button)findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Перенаправляем...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        TextView regis = (TextView)findViewById(R.id.registration);
        regis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Создаём Intent для надписи для перехода на другую активность
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}
