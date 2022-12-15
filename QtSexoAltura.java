package qtalturasexo;

import java.util.Scanner;

public class QtSexoAltura {
    public static void main(String[] args) {
        int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

        try (Scanner entrada = new Scanner(System.in)) {
            for (int i=0; i<10; i++) {
                System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
                sexo = entrada.nextInt();
                System.out.print("Digite a altura: ");
                altura = entrada.nextFloat();
                switch (sexo) {
                    case 1:
                        qtMulheres++;
                        break;
                    case 2:
                        qtHomens++;
                        somaH = somaH + altura;
                        break;
                    default:
                        System.out.println("Opção sexo inválido!");
                        break;
                }
                if (altura > maior) {
                    maior = altura;
                } else if (altura < menor){
                    menor = altura;
                }
            }
            mediaHomens = somaH / qtHomens;
            
            System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
            System.out.println("A média de altura dos homens é " + mediaHomens + " m");
            System.out.println("O número de mulheres é " + qtMulheres);
        }
    }
}
