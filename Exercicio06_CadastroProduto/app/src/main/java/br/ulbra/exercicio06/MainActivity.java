package br.ulbra.exercicio06;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etxtProduto, etxtPreco, etxtQuantidade;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtProduto = findViewById(R.id.etxtProduto);
        etxtPreco = findViewById(R.id.etxtPreco);
        etxtQuantidade = findViewById(R.id.etxtQuantidade);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void cadastrarProduto(View view) {
        String produto = etxtProduto.getText().toString();
        String textoPreco = etxtPreco.getText().toString();
        String textoQuantidade = etxtQuantidade.getText().toString();

        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + textoPreco);
        System.out.println("Quantidade: " + textoQuantidade);

        if (textoPreco.isEmpty() || textoQuantidade.isEmpty()) {
            txtResultado.setText("Preço inválido!");
            return;
        }

        double preco = Double.parseDouble(textoPreco);
        int quantidade = Integer.parseInt(textoQuantidade);

        if (preco <= 0) {
            System.out.println("Preço inválido!");
            txtResultado.setText("Preço inválido!");
        } else {
            double valorEstoque = preco * quantidade;
            System.out.println("Produto cadastrado!");
            txtResultado.setText(produto + " cadastrado! Valor em estoque: R$ " + valorEstoque);
        }
    }
}
