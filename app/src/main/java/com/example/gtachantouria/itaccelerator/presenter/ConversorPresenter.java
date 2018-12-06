package com.example.gtachantouria.itaccelerator.presenter;

import com.example.gtachantouria.itaccelerator.model.Conversor;

public class ConversorPresenter {
    private Conversor mConversor;
    private ConversorView mConversorView;

    public ConversorPresenter(ConversorView view){
        this.mConversor = new Conversor();
        this.mConversorView = view;
    }

    public void convertir(float millas){
        mConversor.setMillas(millas);
        mConversor.convertir();
        mConversorView.updateKm(mConversor.getKm());
    }

    public float obtenerKilometros(){
        return mConversor.getKm();
    }

    public interface ConversorView{
        void updateKm(float km);
    }
}
