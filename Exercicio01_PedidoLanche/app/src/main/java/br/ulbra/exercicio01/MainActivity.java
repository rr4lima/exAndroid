package br.ulbra.exercicio01;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtLanche, etxtBebida, etxtObservacao;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtLanche = findViewById(R.id.etxtLanche);
        etxtBebida = findViewById(R.id.etxtBebida);
        etxtObservacao = findViewById(R.id.etxtObservacao);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void fazerPedido(View view) {
        String lanche = etxtLanche.getText().toString();
        String bebida = etxtBebida.getText().toString();
        String observacao = etxtObservacao.getText().toString();

        System.out.println("Lanche: " + lanche);
        System.out.println("Bebida: " + bebida);
        System.out.println("Observação: " + observacao);

        txtResultado.setText("Pedido: " + lanche + " + " + bebida + " (" + observacao + ")");
    }
}
