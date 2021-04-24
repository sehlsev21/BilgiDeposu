package com.example.bilgideposu.Aktiviteler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bilgideposu.R;

public class MainActivity extends AppCompatActivity {
    private Button button_giris;
    private EditText editTextPersonName;
    private EditText editTextPassword;
    private String personName,password;
    private TextView kayitText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPersonName = findViewById(R.id.editTextPersonName);
        editTextPassword = findViewById(R.id.editTextPassword);
        button_giris = findViewById(R.id.button_giris);
        kayitText = findViewById(R.id.kayitText);



        //kayıt olmaya yönlendirme
        kayitText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Yakinda kayit olma secenegi gelecektir !", Toast.LENGTH_SHORT).show();
            }
        });


        //Sisteme giriş yapma
        button_giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personName = editTextPersonName.getText().toString();
                password = editTextPassword.getText().toString();

                if(password.equals("") || personName.equals("")){
                    Toast.makeText(MainActivity.this,"Lütfen heryeri doldurunuz", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Giris Başarılı!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,AnaSayfa.class);
                    startActivity(intent);
                }

            }
        });
    }
}