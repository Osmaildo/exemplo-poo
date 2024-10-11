import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
       Curso curso = new Curso("Full Stack", 1000,350.0);
       Professor professor = new Professor();
       professor.setNome("Alexandre");
       professor.setTemMestrado(true);

       Aluno aluno1 = new Aluno("Jeferson");
       Aluno aluno2 = new Aluno("Leidiane");
       Aluno aluno3 = new Aluno("Osmaildo");
       Aluno aluno4 = new Aluno("Mário");
       Aluno aluno5 = new Aluno("Emerson");

       List<Aluno> aluno = new ArrayList<>();
       alunos.add(aluno1);
       alunos.add(aluno2);
       alunos.add(aluno3);
       alunos.add(aluno4);
       alunos.add(aluno5);
       
       Turma turmaTercQui = new Turma();

       turmaTercQui.setNome("Terças e Quintas");
       turmaTercQui.setDataInicio(LocalDate.now());
       turmaTercQui.setDataTermino(java.time.LocalDate.of(2025,3,30));
       turmaTercQui.setTurno("Noite");
       turmaTercQui.setCurso(curso);
       turmaTercQui.setProfessor(professor);

       turmaTercQui.exibirDetalhes();
       
    }
}
