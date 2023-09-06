import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alunomain {
    public static void main(String[] args) {

        Aluno Aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();

        Aluno01.codigo = 123321;
        Aluno01.nome = "Gabriel";
        Aluno01.dataNascimento = LocalDate.of(2005,04,10);
        Aluno01.endereço = "Criciuma";
        Aluno01.telefone = "48 998492552";

        notasMatematica.add(10);
        notasMatematica.add(9);
        notasPortugues.add(7);
        notasPortugues.add(6);
        disciplinas.put("matematica", notasMatematica);
        disciplinas.put("portugues", notasPortugues);
        Aluno01.disciplinas = disciplinas;

        Aluno01.disciplinas = disciplinas;

        Aluno01.imprimirDadosAlunos();



    }
}
