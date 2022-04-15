
public class Contacorrente extends Conta {

	@Override
	public void ImprimeExtrato() {
		// TODO Auto-generated method stub
		System.out.println("Extrato da conta corrente");
		System.out.println(String.format("Agencia: %d", super.Agência));
		System.out.println(String.format("Conta: %d", super.Numero));
		System.out.println(String.format("Saldo: %.2f", super.Saldo));
		System.out.println(String.format("CPF: %d", super.CPF));

		
	}
 
	
}
