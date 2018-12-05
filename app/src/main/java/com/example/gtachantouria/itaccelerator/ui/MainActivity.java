package com.example.gtachantouria.itaccelerator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gtachantouria.itaccelerator.R;
import com.example.gtachantouria.itaccelerator.model.Conversor;

public class MainActivity extends AppCompatActivity {
    private EditText etMillas;
    private TextView txtMillasResult;
    private Button btnConvertir;
    private Conversor mConversor;

    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /*double millasResult = Double.parseDouble(etMillas.getText().toString()) * (1.609);*/

            mConversor.setmMillas(Float.parseFloat(etMillas.getText().toString()));
            mConversor.Convertir();

            txtMillasResult.setText(String.valueOf(mConversor.getmKm() + " "));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConversor = new Conversor();
        btnConvertir = (Button) findViewById(R.id.btn_convertir);
        etMillas = (EditText) findViewById(R.id.et_millas);
        txtMillasResult = (TextView) findViewById(R.id.txt_millasResult);

        btnConvertir.setOnClickListener(myListener);
    }
}
