package br.ulbra.exercicio04;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtEmail, etxtSenha;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtEmail = findViewById(R.id.etxtEmail);
        etxtSenha = findViewById(R.id.etxtSenha);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void entrar(View view) {
        String email = etxtEmail.getText().toString();
        String senha = etxtSenha.getText().toString();

        System.out.println("E-mail digitado: " + email);
        System.out.println("Senha com " + senha.length() + " caracteres");

        if (senha.length() < 6) {
            txtResultado.setText("Senha muito curta! Mínimo 6 caracteres.");
        } else {
            txtResultado.setText("Login realizado: " + email);
        }
    }
}
