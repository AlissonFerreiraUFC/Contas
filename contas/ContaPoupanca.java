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
public class ContaPoupanca extends Contas {
      public void tipoConta(){
        JOptionPane.showMessageDialog(null, "Tipo de conta: Poupança");
    }
      
    public void reajustar (double taxa){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * taxa;
        this.depositar(reajuste);
        
    }
    public void reajustar (){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * 0.1;
        this.depositar(reajuste);
    }
}
