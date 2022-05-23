import java.util.Scanner;

public class exercicio_estacionamento {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int condicao = 0;
		int deficiente,gestante,idoso;
		System.out.printf("Vaga preferencial \n");
		System.out.printf("Para estacionar digite: (1) Deficiente (2)Gestante (3)Idoso (4)Se voce nao se identifica com as opcoes anteriores");
		condicao = sc.nextInt();
		
		switch(condicao)
		{
		case 1: 
			System.out.printf("Voce se identificou como Deficiente \n Estacionamento liberado");
			break;
		case 2: 
			System.out.printf("Voce se identificou como Gestante \n Estacionamento liberado");
			break;	
		case 3: 
			System.out.printf("Voce se identificou como Idoso \n Estacionamento liberado");
			break;
		case 4: 
			System.out.printf("Voce nao possui nenhuma das necessidades exigidas para estacionar \n Estacionamento NAO liberado");
			break;		
		default:
			System.out.printf("ERRO, favor escolher uma das opcoes apresentadas");
			break;
		

	}
	}
}
