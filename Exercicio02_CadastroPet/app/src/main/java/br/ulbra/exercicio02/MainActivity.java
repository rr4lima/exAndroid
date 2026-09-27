package br.ulbra.exercicio02;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtNomePet, etxtEspecie, etxtIdadePet;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtNomePet = findViewById(R.id.etxtNomePet);
        etxtEspecie = findViewById(R.id.etxtEspecie);
        etxtIdadePet = findViewById(R.id.etxtIdadePet);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void cadastrarPet(View view) {
        String nome = etxtNomePet.getText().toString();
        String especie = etxtEspecie.getText().toString();
        String idade = etxtIdadePet.getText().toString();

        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");

        txtResultado.setText(nome + " (" + especie + "), " + idade + " anos, cadastrado com sucesso!");
    }
}
