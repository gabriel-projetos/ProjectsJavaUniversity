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
public class Conta {
    private String nome;
    private double saldo;
    
    public void setNome(String AValue){
        this.nome = AValue;
    }
    
    public String getNome(){
       return this.nome;
    }
    
    public void setSaldo(double AValue){
        this.saldo = AValue;
    }
    
    public double getSaldo(){
       return this.saldo; 
    }
    
    
    public void Sacar(){
        
    }
    public void Transferir(){
        
    }
    
    public void Depositas(){
        
    }
}
