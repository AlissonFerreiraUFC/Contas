/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Windows10
 */
public class Botao extends JFrame implements ActionListener {
    JButton jb = new JButton("Saque");
    JButton jb2 = new JButton("Depósito");
    JButton jb3 = new JButton("Transferência");
    JButton jb4 = new JButton("Reajustar");
    JButton jb5 = new JButton("Ver Saldos");
    JButton jb6 = new JButton("Sair");
   private BorderLayout border = new BorderLayout();
    
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== jb6){
            System.exit(0);
        }
    }
    public Botao(){
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
        this.add(new JLabel("               Selecione a operação desejada"), BorderLayout.NORTH);
        setTitle("Contas");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Botao();
    }
}
