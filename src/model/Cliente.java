package model;

public class Cliente {

    //Atributos

    private String nombre;
    private String ocupacion;
    private String ID;
    private CuentaBancaria cuentabancaria;

    public Cliente(String nombre, String ocupacion, String ID) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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