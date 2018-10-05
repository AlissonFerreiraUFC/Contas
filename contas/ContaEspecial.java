/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class ContaEspecial extends Contas {
     private int limite;
    private double multa;
    private double saldoEspecial;
    public double getMulta(){
        return this.multa;
    }
    public void setMulta(double multa){
        this.multa=multa;
    }
    public int getLimite(){
        return this.limite;
    }
    public void setLimite(int limite){
        this.limite=limite;
    }

    public double getSaldoEspecial() {
        return saldoEspecial;
    }
    
    public void tipoConta(){
       JOptionPane.showMessageDialog(null,("Tipo da Conta: conta-especial."));
    }
    public void descontar(double multa){
        double novoValor = this.getSaldo();
        
    }
    public void sacar(double valor){
        double saldoAtual = this.getSaldo();
        if (saldoAtual >= valor){
           saldoEspecial = this.getSaldo();
            this.saldoEspecial = saldoEspecial-valor;
             JOptionPane.showMessageDialog(null,("Saque efetuado com sucesso! "));
        }
        else{
        if(saldoAtual+limite > valor){
            JOptionPane.showMessageDialog(null,("Saque efetuado com sucesso usando cheque especial  "));
            saldoAtual-=valor;
            saldoAtual*=(1-(this.multa/100));
        }
        else{
            JOptionPane.showMessageDialog(null,this.getNome()+("Seu saldo é inferior ao valor que você deseja sacar. \nSaldo disponivel: ")+ this.getSaldo());
        }
        }
        
    }
}
