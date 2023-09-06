package Aula4;

import Aula4.Aluno;
import Aula4.Boletim;
import Aula4.Disciplina;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Bruno Kurzawe";



        Disciplina matematica = new Disciplina();
        matematica.adicionaNota(9);
        matematica.adicionaNota(7);

        Disciplina portugues = new Disciplina();
        portugues.adicionaNota(8);
        portugues.adicionaNota(8);



        aluno.disciplinas.add(matematica);
        aluno.disciplinas.add(portugues);

        Integer notaGeral = aluno.calcularMediaGeral();
        System.out.println("O aluno "+aluno.nome+ " tem média geral "+ notaGeral);


        Boletim boletim = new Boletim();
        String mensagemAprovado(aluno01.nomme, mediaGeralAluno);

        System.out.println(mensagemAprovacao);



    }
    public Integer calcularfrequancia(){
        Integer totalpresencas =0
                for(Boolean presenca :frequancia){
                    if (presenca.equals(true)){
                        totalpresencas++
                    }
                }
                Integer totalAulas = frequencia.size();
                IntegerfrequnciaFinal = (totalpresencas * 100)/totalAulas;

                return frequnciaFinal;
    }

}