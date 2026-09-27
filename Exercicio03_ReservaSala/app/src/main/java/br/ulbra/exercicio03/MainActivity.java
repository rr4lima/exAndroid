package br.ulbra.exercicio03;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtNome, etxtSala, etxtHorario;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtNome = findViewById(R.id.etxtNome);
        etxtSala = findViewById(R.id.etxtSala);
        etxtHorario = findViewById(R.id.etxtHorario);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void reservarSala(View view) {
        String nome = etxtNome.getText().toString();
        String sala = etxtSala.getText().toString();
        String horario = etxtHorario.getText().toString();

        System.out.println("Responsável: " + nome);
        System.out.println("Sala: " + sala);
        System.out.println("Horário: " + horario);

        txtResultado.setText(sala + " reservado para " + nome + " às " + horario);
    }
}
