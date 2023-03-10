package model;

public class Transaccion {

    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;
    private float saldo;

    public Transaccion(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, float saldo) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.saldo = saldo;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ejecutarTransaccion(){

        if(cuentaOrigen.getSaldo() >= saldo){

            cuentaOrigen.retirar(saldo);
            cuentaOrigen.depositar(saldo);

        } else {

            System.out.println("¡La cantidad que desea retirar excede el saldo disponible!");

        }

    }

}