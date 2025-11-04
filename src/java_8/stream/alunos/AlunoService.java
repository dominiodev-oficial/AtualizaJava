package java_8.stream.alunos;

import java.util.*;

public class AlunoService {

    // 1. Filtra alunos de um curso específico
    public void filtraAlunosPorCurso(List<Aluno> alunos, String curso) {
        for (Aluno a : alunos) {
            if (a.getCurso().equalsIgnoreCase(curso)) {
                System.out.println(a);
            }
        }
    }

    // 2. Calcula média das notas de todos os alunos
    public double calculaMediaNotas(List<Aluno> alunos) {
        if (alunos.isEmpty()) return 0.0;

        double soma = 0.0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }

        return soma / alunos.size();
    }

    // 3. Encontra o aluno com a maior nota
    public Aluno alunoComMaiorNota(List<Aluno> alunos) {
        if (alunos.isEmpty()) return null;

        Aluno maior = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNota() > maior.getNota()) {
                maior = a;
            }
        }
        return maior;
    }

    // 4. Encontra o aluno com a menor nota
    public Aluno alunoComMenorNota(List<Aluno> alunos) {
        if (alunos.isEmpty()) return null;

        Aluno menor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNota() < menor.getNota()) {
                menor = a;
            }
        }
        return menor;
    }

    // 5. Lista o nome dos alunos
    public void listaNomes(List<Aluno> alunos) {
        // Usamos um Set para garantir que os nomes fiquem distintos
        Set<String> alunosSet = new LinkedHashSet<String>();

        for (Aluno a : alunos) {
            alunosSet.add(a.getNome());
        }

        // Agora unimos os nomes separados por vírgula
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String aluno : alunosSet) {
            if (count > 0) {
                sb.append(", ");
            }
            sb.append(aluno);
            count++;
        }

        System.out.println("Alunos: " + sb.toString());
    }

    // 6. Verifica se existe algum aluno com nota abaixo de 6
    public boolean existeAlunoReprovado(List<Aluno> alunos) {
        for (Aluno a : alunos) {
            if (a.getNota() < 6.0) {
                return true;
            }
        }
        return false;
    }

    // 7. Verifica se todos os alunos têm nota acima de 7
    public boolean todosAprovados(List<Aluno> alunos) {
        for (Aluno a : alunos) {
            if (a.getNota() < 7.0) {
                return false;
            }
        }
        return true;
    }

    // 8. Ordena alunos por nota (decrescente)
    public void ordenaPorNotaDecrescente(List<Aluno> alunos) {
        Collections.sort(alunos, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return Double.compare(a2.getNota(), a1.getNota());
            }
        });

        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    // 9. Imprime alunos por curso
    public void imprimeAlunosAgrupadosPorCurso(List<Aluno> alunos) {
        Map<String, List<Aluno>> agrupado = new HashMap<>();

        for (Aluno a : alunos) {
            String curso = a.getCurso();
            if (!agrupado.containsKey(curso)) {
                agrupado.put(curso, new ArrayList<>());
            }
            agrupado.get(curso).add(a);
        }

        for (Map.Entry<String, List<Aluno>> entry : agrupado.entrySet()) {
            System.out.println("Curso: " + entry.getKey());
            for (Aluno a : entry.getValue()) {
                System.out.println(a);
            }
            System.out.println();
        }
    }

}
