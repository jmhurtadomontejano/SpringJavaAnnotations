package com.annotations.pruebaannotations;

public class InformePeriodicoAnual implements CrearDocumentoDirector {

    @Override
    public String getDocumentoDirector() {
        return "Informe Periodico Anual";
    }
    
}
