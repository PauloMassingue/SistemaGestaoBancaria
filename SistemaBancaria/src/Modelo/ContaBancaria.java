
package Modelo;


public abstract class ContaBancaria {
    private int nrConta;
    private double saldo;

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valorSaque ){
        
    }
    public void depositar(double deposito){
        
    }
}
