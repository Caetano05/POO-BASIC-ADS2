package Aula4;

public class Boletim {

   String aluno;

    public String verificaAlunoAprovado(String aluno,Integer mediaGeral, Boolean frequancia) {
        if (frequancia <70) {
            return ("reprovado");
        }
        if (mediaGeral >= 7) {
            return ("O aluno " +aluno+ " foi APROVADO");
        } else if (mediaGeral >= 5) {
           return ("O aluno " +aluno+ " foi para RECUPERACAO");
        } else {
            return ("O aluno " +aluno+ " foi REPROVADO");
        }
    }
}
