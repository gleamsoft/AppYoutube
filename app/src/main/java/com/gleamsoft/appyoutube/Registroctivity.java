package com.gleamsoft.appyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class Registroctivity extends AppCompatActivity {
    private Button btnVolver;
    private Button btnRegistro;

    private EditText txtcorreo;
    private EditText txttelefono;
    private EditText txtusuario;
    private EditText txtcontrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroctivity);

        txtcorreo =(EditText) findViewById(R.id.txtcorreoregistro);
        txttelefono =(EditText) findViewById(R.id.txttelefonoregistro);
        txtusuario =(EditText) findViewById(R.id.txtusuarioregistro);
        txtcontrasena =(EditText) findViewById(R.id.txtcontrasenaregistro);


        btnVolver =(Button) findViewById(R.id.btnregresar);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registroctivity.this,LoginActivity.class));
            }
        });


        btnRegistro =(Button) findViewById(R.id.btnregistrarme);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseUser user = new ParseUser();
                user.setUsername(txtusuario.getText().toString());
                user.setPassword(txtcontrasena.getText().toString());
                user.setEmail(txtcorreo.getText().toString());

                // other fields can be set just like with ParseObject
                user.put("telefono", txttelefono.getText().toString());

                user.signUpInBackground(new SignUpCallback() {
                    public void done(ParseException e) {
                        if (e == null) {
                            Toast.makeText(Registroctivity.this, "Ok", Toast.LENGTH_SHORT).show();
                        } else {
                            // Sign up didn't succeed. Look at the ParseException
                            // to figure out what went wrong
                            Toast.makeText(Registroctivity.this, "No Ok" + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
