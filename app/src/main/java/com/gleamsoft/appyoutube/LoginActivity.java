package com.gleamsoft.appyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCrearCuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnCrearCuenta =(Button) findViewById(R.id.btncrearcuenta);

        btnCrearCuenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId() /*to get clicked view id**/) {
            case R.id.btncrearcuenta:
                startActivity(new Intent(this,Registroctivity.class));
                break;
            default:
                break;

        }

    }
}
