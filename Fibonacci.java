package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextShort();
        System.out.println("Digite o segundo numero: ");
        num2 = ler.nextShort();
        
        for(int i = 0; i < 10; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
    
}
