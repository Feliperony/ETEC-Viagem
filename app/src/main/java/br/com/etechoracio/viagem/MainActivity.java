package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    EditText txtTempogasto;
    EditText txtVelocidademedia;
    EditText txtRendimentoveiculo;
    TextView lblDistancia2;
    TextView lblConsumo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTempogasto = findViewById(R.id.txtTempogasto);
        txtVelocidademedia = findViewById(R.id.txtVelocidademedia);
        txtRendimentoveiculo = findViewById(R.id.txtRendimentoveiculo);
        lblDistancia2 = findViewById(R.id.lblDistancia2);
        lblConsumo2 = findViewById(R.id.lblConsumo2);


    }

    public void onCalcular(View view)
    {
        double tempo = Double.parseDouble(txtTempogasto.getText().toString());
        int velocidade = Integer.parseInt(txtVelocidademedia.getText().toString());
        int rendimento = Integer.parseInt(txtRendimentoveiculo.getText().toString());

        double distancia = tempo * velocidade;
        double consumo = distancia /rendimento;

        lblDistancia2.setText(String.valueOf(distancia));
        lblConsumo2.setText(String.valueOf(consumo));

    }
}
