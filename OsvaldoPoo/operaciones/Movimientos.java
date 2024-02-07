package org.academia.consultec.OsvaldoPoo.operaciones;

import org.academia.consultec.OsvaldoPoo.interfaces.ITtransacciones;
import org.academia.consultec.OsvaldoPoo.modelos.Cuenta;

public class Movimientos implements ITtransacciones {
    private String fechaMovimiento;
    private double monto;
    private String tipoMovimiento;

    private static double comision=5.5;

    @Override
    public void transferenciaEntreCuentas(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {

    }

    @Override
    public void transferenciaATerceros(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {

    }

    @Override
    public void depositoACuenta(Cuenta cuentaDestino, double monto) {

    }

    @Override
    public void retiroACuenta(Cuenta cuentaDestino, double monto) {

    }
}
