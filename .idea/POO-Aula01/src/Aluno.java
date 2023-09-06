import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {

    static String nome;
    static Integer codigo;
    static LocalDate dataNascimento;
    String telefone;
    String endereço;
    String nomeresponsavel;
    String sexo;
    static Map<String, List<Integer>> disciplinas;

    public static void main(String[] args) {
        
        for (Map.Entry<String, List<Integer>> entry : disciplinas.entrySet()){
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplinas: " + nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas){
                int SomaNotas = somaNotas + nota;
            }
            System.out.println("Media: " + (somaNotas/notas.size()));
        }

        
        
        
        System.out.println("Codigo " + codigo + " Nome: " + nome + " Data de nascimento: "+ dataNascimento);
    }


    public void imprimirDadosAlunos() {
    }
}
