package org.academia.consultec.OsvaldoPoo.modelos;

import org.academia.consultec.OsvaldoPoo.modelos.Cliente;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.EstadoCuenta;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.TipoCuenta;


//Abstraer la clase cuenta y herencia de clase cliente
public abstract class Cuenta {
    private int numero;
    private String alias;
    private EstadoCuenta estado;
    private TipoCuenta tipo;
    private double balance;
    private Cliente cliente;
    private double interes;
    private String fechaApertura;

    //Constructor de la clase cliente

    public Cuenta(int numero, String alias, EstadoCuenta estado, TipoCuenta tipo, double balance, Cliente cliente, double interes, String fechaApertura) {
        this.numero = numero;
        this.alias = alias;
        this.estado = estado;
        this.tipo = tipo;
        this.balance = balance;
        this.cliente = cliente;
        this.interes = interes;
        this.fechaApertura = fechaApertura;
    }
    //Método depositar y retirar
    public abstract void depositar(double monto);
    public abstract void retirar(double monto);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public EstadoCuenta getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuenta estado) {
        this.estado = estado;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
}
