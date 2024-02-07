package org.academia.consultec.OsvaldoPoo.modelos;

import org.academia.consultec.OsvaldoPoo.modelos.Cliente;
import org.academia.consultec.OsvaldoPoo.modelos.Cuenta;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.EstadoCuenta;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.TipoCuenta;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int numero, String alias, EstadoCuenta estado, TipoCuenta tipo, double balance, Cliente cliente, double interes, String fechaApertura) {
        super(numero, alias, estado, tipo, balance, cliente, interes, fechaApertura);
    }

    //Sobre carga de métodos
    @Override
    public void depositar(double monto) {

    }

    @Override
    public void retirar(double monto) {

    }
}
