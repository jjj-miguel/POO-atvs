package CInema;

public class Main {
    public static void main(String[] args) {
        
        SessaoCine s1 = new SessaoCine();
        s1.capacidadeTotal=100;
        s1.filme ="Avatar";
        s1.horario="21:00";
        s1.ingressosVendidos=80;
    
    s1.exibir();
    System.out.println("------------------------------------------------");
    s1.comprarIngressos(10);
    s1.cancelarIngressos(5);
    s1.alterarHorario("21:30");
    System.out.println("------------------------------------------------");

    s1.exibir();

    
    
    }
}
