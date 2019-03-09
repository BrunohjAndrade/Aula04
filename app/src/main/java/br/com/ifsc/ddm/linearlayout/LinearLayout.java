package br.com.ifsc.ddm.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void onClick(View view) {
        EditText altura = (EditText) findViewById(R.id.vAltura);
        EditText peso = (EditText) findViewById(R.id.vPeso);
        double altura_w, peso_w, resultado_w;

        altura_w = Double.parseDouble(altura.getText().toString());
        peso_w = Double.parseDouble(peso.getText().toString());

        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado_w = (peso_w / Math.pow(altura_w, 2.0));
        resultado.setText(String.format("IMC: %.2f",resultado_w));
    }
}
