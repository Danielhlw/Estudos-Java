package vogais;

import java.util.Scanner;

public class Vogais {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        char letra;
        System.out.println("Digite uma letra: ");
        letra = ler.next().charAt(0);
        System.out.println("A letra é: " + letra);
        
        if(letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i'
            || letra == 'I' || letra == '0' || letra == 'O' || letra == 'u' || letra == 'U')
            System.out.println("É uma vogal");
        else
            System.out.println("É uma consoante");
    }
}
