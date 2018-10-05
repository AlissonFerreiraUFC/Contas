/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;
import javax.swing.JOptionPane;
/**
 *
 * @author Laboratório 16
 */
public class Contas{
     private String nome;
     private double saldo;
     private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
       return numero;
        
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
 
     
    public Contas() {
        this.saldo = 0;
    }
     
    public void depositar(double valor) {
        this.saldo += valor;
    }
     
    public void sacar(double valor) {
        if(valor<=saldo) {
            double novoSaldo = saldo - valor;
            this.saldo = novoSaldo;
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!");
        }
               
        else JOptionPane.showMessageDialog(null,"Saldo insuficiente!");
        
    }
    
     
    public void tipoConta(){
        JOptionPane.showMessageDialog(null, "Tipo de conta: comum");
    }
     
    public double getSaldo() {
        return saldo;
    }
    
   public void transferencia(Contas conta1, double valor){
        this.saldo = this.saldo - valor;
        conta1.saldo = conta1.saldo + valor;
           
    }
}
