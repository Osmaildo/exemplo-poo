import java.time.LocalDate;

public class Aluno {
    
   private String nome;
   LocalDate dataNascimento;
   String cpf;
   String filiacao;
   String matricula;
   char genero;
   String email;
   String telefone;
   String senha;

   public void exibirDetalhes() {
       System.out.println("Detalhes do aluno");
       System.out.println("Nome: " + nome);
       System.out.println("Data de Nascimento: " + dataNascimento);
       System.out.println("CPF: " + cpf);
       System.out.println("Filiação: " + filiacao);
       System.out.println("Matricula: " + matricula);
       System.out.println("Gênero: " + genero);
       System.out.println("E-mail: "+ email);
       System.out.println("Telefone: " + telefone);
       System.out.println("Senha: " + senha);

   }

   public void fazerLogin(String email, String senha) {
       System.out.println("Usuário logado!");
       System.out.println("E-mail: " + email);
       System.out.println("Senha: " + senha);


   }

   public String getFiliacao() {
       return filiacao;
   }

   public void setFiliacao(String filiacao) {
      this.filiacao = filiacao;

   }

   public String getNome() {
    return nome;

   }

   public void setNome(String nome) {
    this.nome = nome;

   }

   public char getGenero() {
    return genero;
   }

   public void setGenero(char genero) {
    this.genero = genero;
   }

   public String getCpf() {
    return cpf;
   }

   public void setCpf(String cpf) {
    this.cpf = cpf;
   }




}
