package AgendaTelefonica;

public class Contato{
    String nome;
    String email;
    String telefone;


public Contato(String nome, String telefone, String email){

    this.nome= nome;
    this.email=email;
    this.telefone=telefone;
}

    void alterarTelefone(String novoTelefone){
        this.telefone= novoTelefone;
    }

    void alterarNome(String novoNome){
        this.nome= novoNome;
    }
    
    void info() {
        System.out.println("Nome : " + nome);
        System.out.println("Número de Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
    
    public boolean validarEmail(){
        return email.contains("@");
   }

}