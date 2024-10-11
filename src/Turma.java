import java.time.LocalDate;
import java.util.List;

public class Turma {

    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String turno;
    private Curso curso;
    private List<Aluno> alunos;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibirDetalhes() {
        System.out.println("DETALHES DA TURMA:");
        System.out.println("Nome: " + nome);
        System.out.println("Data início: " + dataInicio);
        System.out.println("Data término: " + dataTermino);
        System.out.println("Turno: " + turno);
        
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
            
        }

        if(professor != null) {
            System.out.println("Professor: " + professor.getNome());
        }
        if(alunos != null) {
            System.out.println("Qtde de alunos matriculados: " + alunos.size());
        }

    }
}
