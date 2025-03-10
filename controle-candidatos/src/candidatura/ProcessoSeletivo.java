package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Luiz"};
        for (String candidato : candidatos) {
           entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentivasRealizadas = 1;
        boolean continuarTentando = true;
        boolean Atendeu = false;
        do {
            System.out.println("Tentativa de contato: " + tentivasRealizadas);
            Atendeu = atender();
            if (Atendeu) {
                continuarTentando = false;
            } else {
                System.out.println("Candidato não atendido");
                tentivasRealizadas++;
            }

        }while (continuarTentando && tentivasRealizadas < 3);

        if (Atendeu) {
            System.out.println("Conseguimos contato com o Candidato: " + candidato + " na "+ tentivasRealizadas +" tentiva");
        } else {
            System.out.println("Não conseguimos contato com o Candidato: " + candidato + " no número maximos de tentativas");
        }
    }

    static boolean atender(){
        return  new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Luiz"};
        System.out.println("Imprimindo a lista de candidatos selecionados com indice:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato Selecionado: " + (i+1) + "º " + candidatos[i]);
        }
    }

    static void selecaoCandidato() {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Luiz", "Fernanda"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendido();
            System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("Candidato selecionado para a vaga: " + candidato);
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }
    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");

        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato e enviar contra proposta");
        }else {
            System.out.println("Aguardando outros candidatos");
        }
    }
}
