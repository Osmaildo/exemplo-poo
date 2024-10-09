public class App {
    public static void main(String[] args) throws Exception {
       
        Aluno aluno1 = new Aluno();

        aluno1.nome = "jefferson";
        aluno1.cpf = "123456-12";
        aluno1.email = "jeff@gmail.com";
        aluno1.senha = "abc123";
        
        
        aluno1.exibirDetalhes();

        //aluno1.fazerLogin("jeff@gmail.com", "abc123");
        aluno1.setFiliacao("Maria");
        aluno1.setNome("Maria");
        aluno1.setCpf("Maria");
        aluno1.setGenero('m');
        
        
        String filiacao = aluno1.getFiliacao();
        String nome = aluno1.getNome();
        String filiacao = aluno1.getFiliacao();
           
        System.out.println("Filiação: " + filiacao);

        

    }
}
