/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Principal extends JFrame implements ActionListener {
    JButton jb = new JButton("Saque");
    JButton jb2 = new JButton("Depósito");
    JButton jb3 = new JButton("Transferência");
    JButton jb4 = new JButton("Reajustar");
    JButton jb5 = new JButton("Ver Saldos");
    JButton jb6 = new JButton("Sair");
    Contas contas = new Contas();
    ContaPoupanca contas2 = new ContaPoupanca();
    ContaEspecial contas3 = new ContaEspecial();
   private BorderLayout border = new BorderLayout();
    

    public void actionPerformed (ActionEvent e){
         float valor;
        if (e.getSource() == jb){
            setVisible(true);
            setTitle("Saques"); 
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
            if (numero == contas.getNumero()){
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Saque: "));
            if (JOptionPane.showConfirmDialog(null,contas.getNome()+ " \nDeseja sacar o valor solicitado?", "Saque",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
           contas.sacar(valor);
           }           
           else {
                JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
           }
           }
           if (numero == contas2.getNumero()){
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Saque: "));
            if (JOptionPane.showConfirmDialog(null,contas2.getNome()+ " \nDeseja sacar o valor solicitado?", "Saque",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           contas2.sacar(valor);
           }           
           else {
                JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
           }
           }
           
            if (numero == contas3.getNumero()){
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Saque: "));
            if (JOptionPane.showConfirmDialog(null,contas3.getNome()+ " \nDeseja sacar o valor solicitado?", "Saque",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           contas3.sacar(valor);
           }           
           else {
                JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
           }
           }
            if (numero != contas.getNumero() && numero != contas2.getNumero()&& numero != contas3.getNumero()) {
               JOptionPane.showMessageDialog(null,"Número de conta inválido! ");
           }
           
        }
        if (e.getSource() == jb2){
            setVisible(true);
            setTitle("Depósito");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
            if (numero == contas.getNumero()){
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
                 if (JOptionPane.showConfirmDialog(null,contas.getNome()+ " \nDeseja depositar o valor?", "Depósito",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           contas.depositar(valor);
           JOptionPane.showMessageDialog(null,"Valor depositado: "+ contas.getSaldo()+" reais");
           }           
                else {
                JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
           }
            
            }
            if (numero == contas2.getNumero()){
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
             if (JOptionPane.showConfirmDialog(null,contas2.getNome()+ " \nDeseja depositar o valor?", "Depósito",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           contas2.depositar(valor);
           JOptionPane.showMessageDialog(null,"Valor depositado: "+ contas2.getSaldo()+" reais");
           }           
                else {
                JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
           }
            }
           if (numero == contas3.getNumero()){
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
             if (JOptionPane.showConfirmDialog(null,contas3.getNome()+ " \nDeseja depositar o valor?", "Depósito",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           contas3.depositar(valor);
           JOptionPane.showMessageDialog(null,"Valor depositado: "+ contas3.getSaldo()+" reais");
           }           
                else {
                JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
           }
            }
           if (numero != contas.getNumero() && numero != contas2.getNumero()&& numero != contas3.getNumero()){
                 JOptionPane.showMessageDialog(null,"Número de conta inválido! ");
             }
       }
        if (e.getSource()== jb3){
            setVisible(true);
            setTitle("Transferência");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Número da conta destino: "));
            if (numero == contas.getNumero() && numero2 == contas2.getNumero()){
                  valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                  if (JOptionPane.showConfirmDialog(null,contas.getNome()+ " \n Deseja Transferir o valor solicitado para?\n"+contas2.getNome(), "Transferência",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                  contas.transferencia(contas2, valor);
                  JOptionPane.showMessageDialog(null,"Transferêcia realizada com sucesso no valor de:"+valor); 
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
                  }
                  
             }
             if (numero == contas.getNumero() && numero2 == contas3.getNumero()){
                  valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                  if (JOptionPane.showConfirmDialog(null,contas.getNome()+ " \n Deseja Transferir o valor solicitado para?\n"+contas3.getNome(), "Transferência",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                  contas.transferencia(contas3, valor);
                  JOptionPane.showMessageDialog(null,"Transferêcia realizada com sucesso no valor de:"+valor); 
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
                  }
                  
             }
              if (numero == contas2.getNumero() && numero2 == contas.getNumero()){
                  valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                  if (JOptionPane.showConfirmDialog(null,contas2.getNome()+ " \n Deseja Transferir o valor solicitado para?\n"+contas.getNome(), "Transferência",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                  contas2.transferencia(contas, valor);
                  JOptionPane.showMessageDialog(null,"Transferêcia realizada com sucesso no valor de:"+valor); 
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
                  }
                  
             }
              if (numero == contas2.getNumero() && numero2 == contas3.getNumero()){
                  valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                  if (JOptionPane.showConfirmDialog(null,contas2.getNome()+ " \n Deseja Transferir o valor solicitado para?\n"+contas3.getNome(), "Transferência",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                  contas2.transferencia(contas3, valor);
                  JOptionPane.showMessageDialog(null,"Transferêcia realizada com sucesso no valor de:"+valor); 
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
                  }
                  
             }
               if (numero == contas3.getNumero() && numero2 == contas.getNumero()){
                  valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                  if (JOptionPane.showConfirmDialog(null,contas3.getNome()+ " \n Deseja Transferir o valor solicitado para?\n"+contas.getNome(), "Transferência",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                  contas3.transferencia(contas, valor);
                  JOptionPane.showMessageDialog(null,"Transferêcia realizada com sucesso no valor de:"+valor); 
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
                  }
                  
             }
                if (numero == contas3.getNumero() && numero2 == contas2.getNumero()){
                  valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                  if (JOptionPane.showConfirmDialog(null,contas3.getNome()+ " \n Deseja Transferir o valor solicitado para?\n"+contas2.getNome(), "Transferência",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                  contas3.transferencia(contas2, valor);
                  JOptionPane.showMessageDialog(null,"Transferêcia realizada com sucesso no valor de:"+valor); 
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Operação cancelada!"); 
                  }
                  
             }
        }
        if (e.getSource()== jb4){
            setVisible(true);
            setTitle("Reajustar");
            double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Taxa de reajuste da poupança?"));
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta poupança: "));
            if (numero == contas2.getNumero()){
                contas2.reajustar(reajuste);
                JOptionPane.showMessageDialog(null,"Ajuste realizado com sucesso: "); 
            }
            if (numero != contas2.getNumero()){
                JOptionPane.showMessageDialog(null,"Número de conta poupança inválido"); 
            }
        }
         if (e.getSource()== jb5){
            setVisible(true); 
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
            if (numero == contas.getNumero()){
            JOptionPane.showMessageDialog(null,"Saldo: "+ contas.getSaldo());
            }
             if (numero == contas2.getNumero()){
            JOptionPane.showMessageDialog(null,"Saldo: "+ contas2.getSaldo());
            }
             if (numero == contas3.getNumero()){
            JOptionPane.showMessageDialog(null,"Saldo: "+ contas3.getSaldo());
            }
             if (numero != contas.getNumero() && numero != contas2.getNumero()&& numero != contas3.getNumero()){
                 JOptionPane.showMessageDialog(null,"Número de conta inválido! ");
             }
        }
        if (e.getSource()== jb6){
            System.exit(0);
        }
    }
    public Principal(){
        jb.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        setLayout(null);
        jb.setBounds(10, 50, 120, 40);
        jb2.setBounds(150, 50, 120, 40);
        jb3.setBounds(10, 100, 120, 40);
        jb4.setBounds(150, 100, 120, 40);
        jb5.setBounds(10, 150, 120, 40);
        jb6.setBounds(150, 150, 120, 40);
        add(jb);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(jb6);
        this.setLayout(border);
        
        contas.tipoConta();
        String name = JOptionPane.showInputDialog("Nome do titular");
        contas.setNome(name);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
        contas.setNumero(numero);
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial para conta comum?"));
        contas.depositar(saldo);
        JOptionPane.showMessageDialog(null, "Bem-vindo " +contas.getNome()+("\nNúmero da conta: ")+ contas.getNumero()+("\nSaldo inicial: ")+contas.getSaldo()+(" reais"));
        contas.setNome(name);
        
        contas2.tipoConta();
        String name2 = JOptionPane.showInputDialog("Nome do titular");
        contas2.setNome(name2);
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
        contas2.setNumero(numero2);
        double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial para conta poupança?"));
        contas2.depositar(saldo2);
        double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Taxa de reajuste da poupança?"));
        JOptionPane.showMessageDialog(null, "Bem-vindo " +contas2.getNome()+("\nNúmero da conta: ")+ contas2.getNumero()+("\nSaldo inicial: ")+contas2.getSaldo()+(" reais"));
        
        contas3.tipoConta();
        String name3 = JOptionPane.showInputDialog("Nome do titular");
        contas3.setNome(name3);
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
        contas3.setNumero(numero3);
        double saldo3 = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial para conta especial?"));
        contas3.depositar(saldo3);
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Limite da conta: "));
        contas3.setLimite(limite);
        double multa = Double.parseDouble(JOptionPane.showInputDialog("Multa:"));
        contas3.setMulta(multa);
        JOptionPane.showMessageDialog(null, "Bem-vindo " +contas3.getNome()+("\nNúmero da conta: ")+ contas3.getNumero()+("\nSaldo inicial: ")+contas3.getSaldo()+(" reais")+("\nLimite da conta:")+contas3.getLimite()+("\nMulta: ")+contas3.getMulta());
     
        this.add(new JLabel("               Selecione a operação desejada"), BorderLayout.NORTH);
        setTitle("Contas");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        if (JOptionPane.showConfirmDialog(null, "Deseja criar uma conta?", "Abertura de conta",
           JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        
        JFrame janela = new Principal();  
        }           
           else {
               
        }
        
    }
    }
    

