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
        Carteira obj_carteira = new Carteira();
        //obj_carteira.nome = "Gabriel Ribeiro";
        //obj_carteira.saldo = 2;
        
        //System.out.println(obj_carteira.nome + "R$: " + obj_carteira.saldo);
        //System.out.println("Gabriel");
        
        ContaCorrente obj_cc = new ContaCorrente();
        //obj_cc.nome = "Banco do zé";
        //obj_cc.saldo = 1000;
        //obj_cc.limite = 1000;
        //System.out.println(obj_cc.nome);
        //System.out.println("Saldo: R$ " + obj_cc.saldo);
        //System.out.println("Limite: R$ " + obj_cc.limite);
        
        obj_cc.setLimite(1000);
        
        System.out.println(obj_cc.GetLimite());
        
        obj_carteira.setNome("Carteira de couro");
        obj_carteira.setSaldo(5000);
        System.out.println(obj_carteira.getNome() + " R$: " + obj_carteira.getSaldo());
        
                
                
    }
}
