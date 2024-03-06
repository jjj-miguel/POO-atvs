package Sistema_Bancario;
public class contaCorrente {
    
    String nomeTitular;
    int numeroConta;
    double saldo;


        


void info() {
    System.out.println("Nome do titular: " + nomeTitular);
    System.out.println("Número da conta: " + numeroConta);
    System.out.println("Saldo: " + saldo);
}

void depositar(double valor){
    
        saldo += valor ;
        System.out.println("valor depositado: " + valor);
                          
}
boolean sacar(double valor){

    if(valor<= saldo){
        saldo -= valor;
        System.out.println("valor sacado: " + valor); 
            return true; 
        } 
    else{
            System.out.println("erro !!!");
            return false; 
        }
}
boolean transferir(contaCorrente c2 ,double valor){
    if(valor<= saldo){
        saldo -= valor;
        c2.saldo+=valor;

        System.out.println("valor sacado: " + valor); 
            return true; 
        } 
    else{
            System.out.println("erro !!!");
            return false; 
        }
    }


}

