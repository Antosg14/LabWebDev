package org.academia.consultec.OsvaldoPoo;

import org.academia.consultec.OsvaldoPoo.modelos.Cliente;
import org.academia.consultec.OsvaldoPoo.modelos.CuentaAhorro;
import org.academia.consultec.OsvaldoPoo.modelos.CuentaCorriente;
import org.academia.consultec.practicas.projectCuentas.enums.cliente.EstadoCliente;
import org.academia.consultec.practicas.projectCuentas.enums.cliente.TipoCliente;
import org.academia.consultec.practicas.projectCuentas.enums.cliente.TipoDocumento;
import org.academia.consultec.practicas.projectCuentas.enums.cuenta.TipoCuenta;
import org.academia.consultec.practicas.projectCuentas.modelos.Cuenta;
import org.academia.consultec.practicas.projectCuentas.operaciones.Movimiento;

public class Main {


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("cliente1", "Gonzalez",
                TipoDocumento.CEDULA, "dni", TipoCliente.INDIVIDUAL, 26,
                'M', "At Home", 66665555,
                "osvaldo@prueba.com", EstadoCliente.ACTIVO);

        Cuenta cuentaAhorro = new CuentaAhorro(1111111, "cuentaAhorro", EstadoCuenta.ACTIVA, TipoCuenta.AHORRO, 0.0, cliente1, 12.3, "14/04/23");
        Cuenta cuentaCorriente = new CuentaCorriente(2222222, "cuentaCorriente", estado, cliente1, 0, cliente1,6.4,"08/05/2024");

        Movimiento movimiento = new Movimiento();

        movimiento.depositoACuenta(cuentaAhorro, 100);
        movimiento.transferenciaEntreCuentas(cuentaAhorro, cuentaCorriente, 200);

        movimiento.depositoACuenta(cuentaAhorro, 250);
        movimiento.transferenciaEntreCuentas(cuentaAhorro, cuentaCorriente, 200);

        System.out.println("Saldo final en mi cuenta de " + cuentaAhorro.getTipo() + " es: " +  cuentaAhorro.getBalance());
        System.out.println("Saldo final en mi cuenta de " + cuentaCorriente.getTipo() + " es: " +  cuentaCorriente.getBalance());


    }
}
