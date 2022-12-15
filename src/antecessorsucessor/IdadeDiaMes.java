package primeiro;

import java.util.Scanner;

public class IdadeDiaMesAno {
	public static void main(String[] args){
	int DiaAno = 365;
	int DiaMes = 30;
	int dias, meses, anos;
        
	Scanner leitor = new Scanner(System.in);
		
	System.out.println("Informe a sua idade.");
	System.out.print("Anos: ");
	anos = leitor.nextShort();
		
	System.out.print("Meses: ");
	meses = leitor.nextShort();
		
	System.out.print("Dias: ");
	dias = leitor.nextShort();
		
	dias += (anos * DiaAno) + (meses * DiaMes);
		
	System.out.println("A sua idade em dias é \n" + dias);
	}
}
