import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		try (Scanner Entrada = new Scanner(System.in)) {
			Conta pupanca = null;
			IConta cc = null;
			while(true) {
				System.out.println("Escolha qual operação você deseja:\n1-Criar conta CC\n2-Criar conta Poupança\n3-Deposito\n4-Transferencia\n5-Extrato");
				int operacao = Entrada.nextInt();
			switch(operacao)
			{
			case 1:
				cc =new Contacorrente();
			break;	
			
			case 2:
				 pupanca = new Contapoupança();

			break;	
			
			case 3:
				System.out.println("Agora insira o valor para Deposito");
				int Dep = Entrada.nextInt();  // ler o proximo inteiro digitado
				System.out.println("Agora insira\nCC - Conta Corrente\nCP - Conta Poupança");
				String B = Entrada.next();  // ler o proximo texto digitado
				
				
				if(B.equals("CC"))
				 {
				  cc.Depositar(Dep);
				  System.out.println("Deposito de:"+Dep+ " na Conta Corrente");
				 }
				else if(B.equals("CP"))
				 {
				  pupanca.Depositar(Dep);
				  System.out.println("Deposito de:"+Dep+" na Conta Poupança");
				 }
				
			break;
			
			case 4:
				System.out.println("Digite CC para Conta Corrente e CP para Poupança");
			    String D = Entrada.next();
			    System.out.println("Agora insira o valor para Transferencia");
			    int C = Entrada.nextInt();  // Read user input
			    if(D.equals("CC")) {
				  pupanca.TransferirCP(C,cc);	
				}
				else if(D.equals("CP"))
				{
				cc.Transferir(C,pupanca);		
				}
					
					
				
			break;
			
			case 5:
				cc.ImprimeExtrato();
				 pupanca.ImprimeExtrato();
		    break;
				 
			
			default:
			System.out.println("Escolha uma opção Valida Entre 1 - 4");	
			break;
			}
 
			
   }
  }
 }	
}
