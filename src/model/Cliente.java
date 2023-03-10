package model;

public class Cliente {

    //Atributos

    private String Nombre;
    private String Ocupacion;
    private String ID;
    private CuentaBancaria cuentabancaria;

    public Cliente(String nombre, String ocupacion, String ID) {
        Nombre = nombre;
        Ocupacion = ocupacion;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public CuentaBancaria getCuentabancaria() {
        return cuentabancaria;
    }

    public void setCuentabancaria(CuentaBancaria cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

}