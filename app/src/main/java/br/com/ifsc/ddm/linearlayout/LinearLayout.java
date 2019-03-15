package br.com.ifsc.ddm.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
        ImageView img = (ImageView) findViewById(R.id.imagem);

        try {
            altura_w = Double.parseDouble(altura.getText().toString());
            peso_w = Double.parseDouble(peso.getText().toString());

            TextView resultado = (TextView) findViewById(R.id.resultado);
            resultado_w = (peso_w / Math.pow(altura_w, 2.0));
            resultado.setText(String.format("IMC: %.2f",resultado_w));


            if (resultado_w<=18.49){
                img.setImageResource(R.drawable.abaixopeso);
            }else if (resultado_w<25){
                img.setImageResource(R.drawable.normal);
            }else if (resultado_w<30){
                img.setImageResource(R.drawable.sobrepeso);
            }else if (resultado_w<35) {
                img.setImageResource(R.drawable.obesidade1);
            }else if (resultado_w<40){
                img.setImageResource(R.drawable.obesidade2);
            }else{
                img.setImageResource(R.drawable.obesidade3);
            }

        }catch (Exception e){
            img.setImageResource(R.drawable.perfil);
        }




    }
}
