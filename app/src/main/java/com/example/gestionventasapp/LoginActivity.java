package com.example.gestionventasapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextPassword;
    private ImageView ivShowPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);  // Asegúrate de que este sea el nombre de tu layout

        // Inicializando las vistas
        editTextPassword = findViewById(R.id.editTextPassword);
        ivShowPassword = findViewById(R.id.ivShowPassword);

        Button btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, registroactivity.class);
            }
        });

        // Configurando el clic en el ícono de mostrar/ocultar contraseña
        ivShowPassword.setOnClickListener(v -> {
            // Verifica si la contraseña está visible o no
            if (editTextPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                // Si está oculta, mostrarla
                editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                ivShowPassword.setImageResource(R.drawable.ojo_abierto);  // Asegúrate de tener el ícono ojo_abierto en drawable
            } else {
                // Si está visible, ocultarla
                editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                ivShowPassword.setImageResource(R.drawable.ojo_cerrado);  // Asegúrate de tener el ícono ojo_cerrado en drawable
            }
        });
    }
}
