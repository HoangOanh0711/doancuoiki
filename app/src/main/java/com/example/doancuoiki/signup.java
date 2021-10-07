package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {


    Button btncreate, login;
    TextInputLayout regname, regusername, regemail, regphone, regpassword;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btncreate = (Button) findViewById(R.id.callcreate);
        login = (Button) findViewById(R.id.CallLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });

        /*regname = findViewById(R.id.regname);
        regusername = findViewById(R.id.regusername);
        regemail = findViewById(R.id.regemail);
        regphone = findViewById(R.id.regphone);
        regpassword = findViewById(R.id.regpassword);


        reg_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });

        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                String name = regname.getEditText().getText().toString();
                String username = regusername.getEditText().getText().toString();
                String email = regemail.getEditText().getText().toString();
                String phone = regphone.getEditText().getText().toString();
                String password = regpassword.getEditText().getText().toString();

                usersHelper helper = new usersHelper(name, username, email, phone, password);
                reference.child(phone).setValue(helper);
            }
        });*/
    }
}