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
    
    public Conta(String nome){
        setNome(nome);
    }
    
    public void setNome(String AValue){
        if(AValue.length() >= 5){
            this.nome = AValue;  
        }else{
            //Exceção de argumento ilegal
            throw new IllegalArgumentException("Nome deve ter mais que 5 caracteres");
        }
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
    
    public void Depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new IllegalArgumentException("Valor do deposito deve ser maior que zero!");
        }
    }
}
