/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Massingue
 */
public  class ContaCorrente extends ContaBancaria implements Imprimivel  {
    private double taxaOperacao;

    public double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
