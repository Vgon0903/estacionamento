import java.util.Scanner;

public class exercicio_estacionamento {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//variaveis criadas
		int condicao = 0; 
		int deficiente,gestante,idoso;
		//Exibir mensagem e quebrar linha
		System.out.printf("Vaga preferencial \n");
		//Exibir mensagem para escolher uma das opcoes apresentadas
		System.out.printf("Para estacionar digite: (1) Deficiente (2)Gestante (3)Idoso (4)Se voce nao se identifica com as opcoes anteriores");
		condicao = sc.nextInt(); // ler opcao e armazenar na variavel "condicao"
		
		switch(condicao) //estrutura de decisao
		{
		case 1: //caso escolha a opcao 1 ira exibir a mensagem a baixo
			System.out.printf("Voce se identificou como Deficiente \n Estacionamento liberado");
			//para laco de repeticao	
			break; 
		case 2:	//caso escolha a opcao 2 ira exibir a mensagem a baixo	
			System.out.printf("Voce se identificou como Gestante \n Estacionamento liberado");
			//para laco de repeticao
			break;	
		case 3: //caso escolha a opcao 3 ira exibir a mensagem a baixo	
			System.out.printf("Voce se identificou como Idoso \n Estacionamento liberado");
			//para laco de repeticao	
			break; 
		case 4: //caso escolha a opcao 4 ira exibir a mensagem a baixo	
			System.out.printf("Voce nao possui nenhuma das necessidades exigidas para estacionar \n Estacionamento NAO liberado");
			//para laco de repeticao	
			break;	
		default: //caso nao escolha nenhuma das opcoes apresentadas ira exibir a mensagem a baixo	
			System.out.printf("ERRO, favor escolher uma das opcoes apresentadas");
			//para laco de repeticao	
			break; 
		

	}
	}
}
