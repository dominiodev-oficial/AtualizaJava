package java_8.stream.alunos;

import java.util.List;

public class AlunoMain {

    public static void main(String[] args) {
        AlunoService service = new AlunoService();
        List<Aluno> alunos = Aluno.carregarLista();

        service.filtraAlunosPorCurso(alunos, "Java");
    }

}
