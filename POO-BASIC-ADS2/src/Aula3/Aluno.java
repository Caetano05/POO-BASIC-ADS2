import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {

    Integer codigo;
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    boolean frequancia;
    List<Disciplina> disciplinas = new ArrayList<>();
    List<Boolean> frencia = new ArrayList();

    public void imprimirDadosAluno() {
        System.out.println("Código: " + codigo + " Nome: " + nome + " Data nascimento:" + dataNascimento);
    }

    public Integer calcularMediaGeral() {
        Integer somaMedias = 0;
        for (Disciplina disciplina : disciplinas) {
            somaMedias += disciplina.calcularMediaDisciplina();
        }
        return somaMedias / disciplinas.size();

    }
    public void verifica{
        Integer mediaGeral = calcularMediaGeral();

        if (mediaGeral > 7){
            System.out.println("APROVADO");
        }
        else if (mediaGeral >=5){
            System.out.println("REPROVADO");
        }
        else{
            System.out.println("RECUPERAÇÃO");
        }
    }


}
