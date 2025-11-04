package java_8.stream.alunos;

import java.util.*;

public class AlunoService {

    // 1. Imprimir alunos de um curso específico
    public void imprimirAlunosPorCurso(List<Aluno> alunos, String curso) {
        for (Aluno a : alunos) {
            if (a.getCurso().equalsIgnoreCase(curso)) {
                System.out.println(a);
            }
        }
    }

    // 2. Calcular média das notas de todos os alunos
    public double calcularMediaNotas(List<Aluno> alunos) {
        if (alunos.isEmpty()) return 0.0;

        double soma = 0.0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma / alunos.size();
    }

    // 3. Encontrar o aluno com a maior nota
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

    // 4. Encontrar o aluno com a menor nota
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

    // 5. Listar apenas os nomes dos alunos
    public List<String> listarNomes(List<Aluno> alunos) {
        List<String> nomes = new ArrayList<>();
        for (Aluno a : alunos) {
            nomes.add(a.getNome());
        }
        return nomes;
    }

    // 6. Verificar se existe algum aluno com nota abaixo de 6
    public boolean existeAlunoReprovado(List<Aluno> alunos) {
        for (Aluno a : alunos) {
            if (a.getNota() < 6.0) {
                return true;
            }
        }
        return false;
    }

    // 7. Verificar se todos os alunos têm nota acima de 7
    public boolean todosAprovados(List<Aluno> alunos) {
        for (Aluno a : alunos) {
            if (a.getNota() < 7.0) {
                return false;
            }
        }
        return true;
    }

    // 8. Ordenar alunos por nota (decrescente)
    public void ordenarPorNotaDecrescente(List<Aluno> alunos) {
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

    // 9. Agrupar alunos por curso
    public void imprimirAlunosAgrupadosPorCurso(List<Aluno> alunos) {
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

    // 10. Calcular a soma total das notas
    public double somarNotas(List<Aluno> alunos) {
        double soma = 0.0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma;
    }

    // 11. Gerar estatísticas das notas (soma, média, maior, menor)
    public void estatisticasNotas(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            return;
        }

        double soma = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (Aluno a : alunos) {
            double nota = a.getNota();
            soma += nota;
            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        double media = soma / alunos.size();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + max);
        System.out.println("Menor nota: " + min);
        System.out.println("Quantidade: " + alunos.size());
    }

}
