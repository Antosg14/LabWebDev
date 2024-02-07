package org.academia.consultec.OsvaldoPoo.Exceptions;

import org.academia.consultec.OsvaldoPoo.modelos.Cuenta;

public class ClienteBloqueadoExceptions extends RuntimeException{
    public ClienteBloqueadoExceptions(Cuenta cuenta){
      //  super("El cliente " + cuenta.getCliente().getNombre() + "titular de la cuenta" + cuenta.getNumero() + "se encuentra " + cue})
    }
}
