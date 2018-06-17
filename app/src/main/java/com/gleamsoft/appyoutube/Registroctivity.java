package com.gleamsoft.appyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registroctivity extends AppCompatActivity {
private Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroctivity);

        btnVolver =(Button) findViewById(R.id.btnregresar);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registroctivity.this,LoginActivity.class));
            }
        });
    }
}
