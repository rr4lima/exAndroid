package br.ulbra.exercicio07;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtEmail, etxtConfirmarEmail;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtEmail = findViewById(R.id.etxtEmail);
        etxtConfirmarEmail = findViewById(R.id.etxtConfirmarEmail);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void recuperarSenha(View view) {
        String email = etxtEmail.getText().toString();
        String confirmacao = etxtConfirmarEmail.getText().toString();

        System.out.println("E-mail: " + email);
        System.out.println("Confirmação: " + confirmacao);

        if (email.equals(confirmacao)) {
            String mensagem = "Link enviado para " + email;
            System.out.println(mensagem);
            txtResultado.setText(mensagem);
        } else {
            String mensagem = "Os e-mails não conferem!";
            System.out.println(mensagem);
            txtResultado.setText(mensagem);
        }
    }
}
