package Sistema_Bancario;

public class Main {
    public static void main(String[] args) {

    
    contaCorrente c1 = new contaCorrente();
    c1.saldo=100;
    c1.nomeTitular="Miguel";
    c1.numeroConta= 22222222;
    
    contaCorrente c2 = new contaCorrente();
    c2.saldo=50;
    c2.nomeTitular="Mari";
    c2.numeroConta= 1111111;
    
    c1.info();
    System.out.println("------------------------------------------------");
    c2.info();
    System.out.println("------------------------------------------------");
    
    c1.depositar(2);
    c2.sacar(5);
    c1.transferir(c2, 1);
    System.out.println("------------------------------------------------");
    
    c1.info();
    System.out.println("------------------------------------------------");
    c2.info();
    System.out.println("------------------------------------------------");

    }
}
