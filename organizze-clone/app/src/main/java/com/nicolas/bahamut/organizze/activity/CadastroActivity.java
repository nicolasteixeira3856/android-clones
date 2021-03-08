package com.nicolas.bahamut.organizze.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nicolas.bahamut.organizze.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText campoNome, campoEmail, campoSenha;
    private Button botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        campoSenha = findViewById(R.id.editSenha);

        botaoCadastrar = findViewById(R.id.botaoCadastro);
        botaoCadastrar.setOnClickListener(view -> {
            String textoNome = campoNome.getText().toString();
            String textoEmail = campoEmail.getText().toString();
            String textoSenha = campoSenha.getText().toString();

            // Validacao de campos preenchidos

            if (textoNome.isEmpty() || textoEmail.isEmpty() || textoSenha.isEmpty()) {
                Toast.makeText(
                        getApplicationContext(),
                        "Por favor preencha todos os campos",
                        Toast.LENGTH_LONG
                ).show();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Parabéns cabaço",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}