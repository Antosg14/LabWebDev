package org.academia.consultec.OsvaldoPoo.modelos;


import org.academia.consultec.practicas.projectCuentas.enums.cliente.EstadoCliente;
import org.academia.consultec.practicas.projectCuentas.enums.cliente.TipoCliente;
import org.academia.consultec.practicas.projectCuentas.enums.cliente.TipoDocumento;

public class Cliente {
    //Propiedades de la clase Cliente(Padre)
    private String nombre;
    private String apellido;
    private TipoDocumento tipodeDNI;
    private String dni;
    private TipoCliente tipoCliente;
    private int edad;
    private char sexo;
    private String direccion;
    private int telefonoContacto;
    private String correoContacto;
    private EstadoCliente estadoCliente;

    //Constructor de la clase cliente


    public Cliente(String nombre, String apellido, TipoDocumento tipodeDNI, String dni, TipoCliente tipoCliente, int edad, char sexo, String direccion, int telefonoContacto, String correoContacto, EstadoCliente estadoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodeDNI = tipodeDNI;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.correoContacto = correoContacto;
        this.estadoCliente = estadoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipodeDNI() {
        return tipodeDNI;
    }

    public void setTipodeDNI(TipoDocumento tipodeDNI) {
        this.tipodeDNI = tipodeDNI;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public EstadoCliente getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(EstadoCliente estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
}
