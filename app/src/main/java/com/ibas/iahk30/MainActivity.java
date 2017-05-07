package com.ibas.iahk30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Tahap 1 : Inisialisasi View
    EditText edUser, edPass;
    Button btnLogin;
    ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Login");

        //Tahap 2 : Inisialisasi ID
        edUser = (EditText)findViewById(R.id.user);
        edPass = (EditText)findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.buttonLogin);
        ivGambar = (ImageView)findViewById(R.id.gambar);

        //Tahap 3 : Event
        btnLogin.setOnClickListener(this);
        ivGambar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonLogin){
            // Logika Button Login
            // Toast.makeText(this, "Button Login Disentuh",
                    //Toast.LENGTH_LONG).show();
            validasi();
        } else if (v.getId() == R.id.gambar){
            // Logika Image View
            Toast.makeText(this, "Image View Disentuh",
                    Toast.LENGTH_LONG).show();
        }
    }

    private void validasi() {
        if (edUser.getText().toString().isEmpty() &&
                edPass.getText().toString().isEmpty()){
            edUser.setError("User is empty");
            edPass.setError("Password is empty");
        } else if (edUser.getText().toString().equalsIgnoreCase("admin")){
            if (edPass.getText().toString().equalsIgnoreCase("admin")){
                Toast.makeText(this, "Login Sukses",
                        Toast.LENGTH_LONG).show();

                // Pindah halaman
                Intent intent = new Intent(this, FormPilihan.class);
                startActivity(intent);
            } else {
                edPass.setError("Password Invalid");
            }
        } else {
            edUser.setError("User Invalid");
        }
    }
}
