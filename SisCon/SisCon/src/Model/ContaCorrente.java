/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gabriel
 */
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(String nome){
        super(nome);
        setAgencia(agencia);
        setNumero(numero);
    }
    
    public void pagar(){
        
    }
    
    public void setLimite(double AValue){
        this.limite = AValue;
    }
    
    public double GetLimite(){
        return this.limite;
    }
}
