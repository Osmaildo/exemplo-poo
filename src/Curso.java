public class Curso {
    
    private String nome;
    private int cargaHoraria;
    private double preco;

    public static void exibirDetalhes(){
        System.out.println("DETALHES DO CURSO:");
        System.out.println("Nome: " + nome);
        System.out.println("Duração do curso: " + cargaHoraria + "h");
        System.out.println("Preço R$: " + preco);
                
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Curso(){}

    public Curso(String nome, int cargaHoraria, double preco) {
        
    }
}
