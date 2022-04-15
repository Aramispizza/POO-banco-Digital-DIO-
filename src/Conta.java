import java.util.Scanner; 

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIALCC = 1;
	
	
	Scanner Entrada = new Scanner(System.in);
	protected int Ag�ncia;
	protected int Numero;
	protected long CPF;
	protected double Saldo;
	
	
	public Conta() 
	{
	this.Ag�ncia= AGENCIA_PADRAO; 	
	this.Numero= SEQUENCIALCC++;
	System.out.println(String.format("Insira o N� do CPF:"));
	this.CPF = Entrada.nextLong();
	}
	
	@Override
	public void Sacar(double valor) {
		Saldo -= valor;
	}
	@Override
	public void Depositar(double valor) {
		Saldo += valor;		
	}
	@Override
	public void Transferir(double valor, IConta cc) {
		this.Sacar(valor);
		cc.Depositar(valor);
	}

@Override
public void TransferirCP(double valor, IConta pupanca) {
	this.Sacar(valor);
	pupanca.Depositar(valor);
}
	
	
	public int getAg�ncia() {
		return Ag�ncia;
	}
	public int getNumero() {
		return Numero;
	}
	
	public double getSaldo() {
		return Saldo;
	}
	
	public long getCPF() {
		return CPF;
	}
	
	
	

}
