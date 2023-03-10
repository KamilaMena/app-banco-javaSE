package model;

public class CuentaBancaria {

    private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public CuentaBancaria(int numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(float monto){
        saldo += monto;
    }

    public void retirar(float retiro){

        if (retiro > saldo){
            System.out.println("¡La cantidad que desea retirar excede el saldo disponible!");
            System.out.println("Saldo: $" + saldo);
        } else {
            System.out.println("¡Retiro realizado!");
            saldo -= retiro;
        }

    }
}