package java_8.stream.alunos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Long id;
    private String nome;
    private String curso;
    private double nota;

    public Aluno(Long id, String nome, String curso, double nota) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", " +
                "Curso: " + curso + ", " +
                "Nota: " + nota;
    }

    public static List<Aluno> carregarLista() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1L,"Maria", "Java", 7.0));
        alunos.add(new Aluno(2L,"José", "SQL", 8.0));
        alunos.add(new Aluno(3L,"Ana", "CSS", 9.0));
        alunos.add(new Aluno(4L,"Maria", "Java", 10.0));
        alunos.add(new Aluno(5L,"José", "SQL", 7.5));
        alunos.add(new Aluno(6L,"Ana", "CSS", 6.0));
        alunos.add(new Aluno(7L,"Maria", "Git", 5.0));
        alunos.add(new Aluno(8L,"José", "Git", 8.5));
        alunos.add(new Aluno(9L,"Ana", "Docker", 9.5));
        alunos.add(new Aluno(10L,"Maria", "Docker", 6.5));
        return alunos;
    }
}
