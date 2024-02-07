package org.academia.consultec.OsvaldoPoo.enums.cuenta;

public class TipoCuenta {
   // AHORRO("Cuenta de Ahorro"), CORRIENTE("Cuenta de Corriente"), PLAZOFIJO("Cuenta de Plazo Fiijo");

    public final String descripcion;
    TipoCuenta(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
