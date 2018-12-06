package com.example.gtachantouria.itaccelerator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gtachantouria.itaccelerator.R;
import com.example.gtachantouria.itaccelerator.model.Conversor;
import com.example.gtachantouria.itaccelerator.presenter.ConversorPresenter;

public class MainActivity extends AppCompatActivity implements ConversorPresenter.ConversorView {

    private ConversorPresenter mPresenter;
    private final String LOG_MSG = MainActivity.class.getName();

    private EditText etMillas;
    private TextView txtMillasResult;
    private Button btnConvertir;

    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mPresenter.convertir(Float.parseFloat(etMillas.getText().toString()));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new ConversorPresenter(this);
        btnConvertir = (Button) findViewById(R.id.btn_convertir);
        etMillas = (EditText) findViewById(R.id.et_millas);
        txtMillasResult = (TextView) findViewById(R.id.txt_millasResult);

        btnConvertir.setOnClickListener(myListener);
    }

    @Override
    public void updateKm(float km) {
        txtMillasResult.setText(String.valueOf(km + " "));
    }
}
