/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carteira;
import Model.ContaCorrente;

/**
 *
 * @author Gabriel
 */
public class Principal {
    public static void main(String[] args) {
        Carteira obj_carteira = new Carteira("Carteira Preta");
        //obj_carteira.nome = "Gabriel Ribeiro";
        //obj_carteira.saldo = 2;
       // obj_carteira.setNome('Gabriel');
        obj_carteira.Depositar(500);
        System.out.println(obj_carteira.getNome() + obj_carteira.getSaldo());

        
        //System.out.println(obj_carteira.nome + "R$: " + obj_carteira.saldo);
        //System.out.println("Gabriel");
        
        ContaCorrente cc = new ContaCorrente("Gabriel");
        //obj_cc.nome = "Banco do zé";
        //obj_cc.saldo = 1000;
        //obj_cc.limite = 1000;
        //System.out.println(obj_cc.nome);
        //System.out.println("Saldo: R$ " + obj_cc.saldo);
        //System.out.println("Limite: R$ " + obj_cc.limite);
        
        cc.Depositar(1000);
        cc.setLimite(10000);
        cc.setSaldo(5000);
        System.out.println(cc.getNome() + " R$SS: " + cc.getSaldo());
        
                
                
    }
}
