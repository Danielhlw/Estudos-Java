package antecessorsucessor;

import javax.swing.JOptionPane;

public class AntecessorSucessor {


    public static void main(String[] args) {
        
        int num = 0;
        String a;
        int antecessor = 0;
        int sucessor = 0;
        
        a = JOptionPane.showInputDialog("Entre com o número");
        num = Integer.parseInt(a);
        
        antecessor = num -1;
        sucessor = num +1;
        
        System.out.println("O sucessor + nyu + do numero é: " + antecessor);
        System.out.println("O sucessor + nyu + do numero é: " + sucessor);
        
        
        
        
        
        
        
    }
    
}
