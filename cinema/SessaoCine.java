package CInema
;

public class SessaoCine {

     String filme;
     String horario;
     int capacidadeTotal;
     int ingressosVendidos;

     void exibir(){
          System.out.println("filme: "+ filme);
          System.out.println("horario: "+ horario);
          System.out.println("ingressos vendidos: "+ ingressosVendidos);
          System.out.println("capacidade total: " + capacidadeTotal);
     }

     void comprarIngressos(int ingressos){
          if (ingressos > 0 && ingressos <= capacidadeTotal) {
               System.out.println("ingressos adquiridos: " + ingressos);
               ingressosVendidos += ingressos;
               capacidadeTotal -= ingressos;
          } else {
               System.out.println("Número inválido de ingressos.");
          }
     }

     void cancelarIngressos(int ingressos){
          if (ingressos >= 0 && ingressos <= ingressosVendidos) {
               System.out.println("ingressos Cancelados: " + ingressos);
               ingressosVendidos -= ingressos;
               capacidadeTotal += ingressos;
          } else {
               System.out.println("Número inválido de ingressos para cancelar.");
          }
     }

     void alterarHorario(String novoHorario){
          horario=novoHorario;
          System.out.println("horario alterado para " + horario);
     }
}
