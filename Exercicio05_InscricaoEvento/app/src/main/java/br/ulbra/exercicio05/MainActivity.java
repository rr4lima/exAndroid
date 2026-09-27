package br.ulbra.exercicio05;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtNome, etxtEmail, etxtIdade;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtNome = findViewById(R.id.etxtNome);
        etxtEmail = findViewById(R.id.etxtEmail);
        etxtIdade = findViewById(R.id.etxtIdade);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void inscrever(View view) {
        String nome = etxtNome.getText().toString();
        String email = etxtEmail.getText().toString();
        String textoIdade = etxtIdade.getText().toString();

        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Idade: " + textoIdade);

        if (textoIdade.isEmpty()) {
            txtResultado.setText("Idade inválida para o evento.");
            return;
        }

        int idade = Integer.parseInt(textoIdade);

        if (idade >= 14 && idade <= 99) {
            System.out.println("Inscrição confirmada!");
            txtResultado.setText(nome + ", sua inscrição foi confirmada!");
        } else {
            System.out.println("Idade inválida para o evento.");
            txtResultado.setText("Idade inválida para o evento.");
        }
    }
}
