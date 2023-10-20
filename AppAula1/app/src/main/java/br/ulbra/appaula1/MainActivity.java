package br.ulbra.appaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDiviir;
    TextView txtResultado;
    double v1,v2,soma,subtracao,multiplicacao,divisao;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.editValor1);
        ed2 = (EditText)findViewById(R.id.editValor2);
        btnSomar = (Button)findViewById(R.id.btnSomar);
        btnSubtrair = (Button)findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button)findViewById(R.id.btnMultiplicar);
        btnDiviir = (Button)findViewById(R.id.btnDividir);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: "+soma);
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                subtracao = v1 - v2;
                txtResultado.setText("Resultado: "+subtracao);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                multiplicacao = v1 * v2;
                txtResultado.setText("Resultado: "+multiplicacao);
            }
        });

        btnDiviir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                divisao = v1 / v2;
                txtResultado.setText("Resultado: "+divisao);
            }
        });

    }
}