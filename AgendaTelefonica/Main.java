package AgendaTelefonica;


public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Miguel","9999-9999" , "joao@gmail");
        Contato c2 = new Contato("Maro","8888-8888" , "marigmail");
         
    c1.info();
    c2.info();


System.out.println("------------------------------------------------");
   
    c1.alterarTelefone("1111-1111");
    
System.out.println("------------------------------------------------");

    c2.alterarNome("Mari");

System.out.println("------------------------------------------------");

    c2.validarEmail();
    
System.out.println("------------------------------------------------");
    
    c1.info();
    c2.info();     
    

}
}
