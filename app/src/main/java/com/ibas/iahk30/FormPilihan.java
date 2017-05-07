package com.ibas.iahk30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormPilihan extends AppCompatActivity implements View.OnClickListener {

    Button btnList, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pilihan);

        getSupportActionBar().setTitle("Form Pilihan");

        btnList = (Button)findViewById(R.id.btnList);
        btnCustom = (Button)findViewById(R.id.btnCustomList);

        btnList.setOnClickListener(this);
        btnCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnList){

            Intent intent = new Intent(this, SimpleList.class);
            startActivity(intent);

        }else if (v.getId() == R.id.btnCustomList){

            Intent intent = new Intent(this, CustomList.class);
            startActivity(intent);

        }
    }
}
