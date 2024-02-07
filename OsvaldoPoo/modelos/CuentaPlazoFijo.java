package org.academia.consultec.OsvaldoPoo.modelos;

import org.academia.consultec.OsvaldoPoo.modelos.Cliente;
import org.academia.consultec.OsvaldoPoo.modelos.Cuenta;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.EstadoCuenta;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.TipoCuenta;

public class CuentaPlazoFijo extends Cuenta {
    private int cantidadCuotas;
    private int cuotasPagadas;
    private double montoCuotas;
    public CuentaPlazoFijo(int numero, String alias, EstadoCuenta estado, TipoCuenta tipo, double balance, Cliente cliente, double interes, String fechaApertura) {
        super(numero, alias, estado, tipo, balance, cliente, interes, fechaApertura);
    }

    @Override
    public void depositar(double monto) {

    }

    @Override
    public void retirar(double monto) {

    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setCuotasPagadas(int cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }

    public double getMontoCuotas() {
        return montoCuotas;
    }

    public void setMontoCuotas(double montoCuotas) {
        this.montoCuotas = montoCuotas;
    }
}
