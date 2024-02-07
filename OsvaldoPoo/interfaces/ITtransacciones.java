package org.academia.consultec.OsvaldoPoo.interfaces;

import org.academia.consultec.OsvaldoPoo.modelos.Cuenta;

public interface ITtransacciones {
    void transferenciaEntreCuentas(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto);
    void transferenciaATerceros(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto);
    void depositoACuenta(Cuenta cuentaDestino, double monto);
    void retiroACuenta(Cuenta cuentaDestino, double monto);
}
