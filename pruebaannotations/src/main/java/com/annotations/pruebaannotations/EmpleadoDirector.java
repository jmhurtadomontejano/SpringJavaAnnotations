package com.annotations.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("EmpleadoDirector")
public class EmpleadoDirector implements Empleados {

    public String getResponsabilidades() {
        return "Dirije los departamentos y objetivos de la empresa";
    }

    /*
     * @Override
     * public String getDocumento() {
     * return "Documento Generado por el Director";
     * }
     */

    /* 8 @autowired */
   /*  private CrearDocumentoDirector documentoDirector;

    public void setDocumentoDirector(CrearDocumentoDirector documentoDirector) {
        this.documentoDirector = documentoDirector;
    }

    public EmpleadoDirector(CrearDocumentoDirector documentoDirector) {
        this.documentoDirector = documentoDirector;
    }
*/
    @Override
    public String getDocumentoDirector() {
        return "Documento de Dirección específico";

    }

  

}
