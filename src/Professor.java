import java.time.LocalDate;

public class Professor {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private char genero;
    private String email;
    private String telefone;
    private double valorHoraAula;
    private boolean temMestrado;
    private String senha;

    public Professor() {}
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, LocalDate dataNascimento, String cpf, char genero, String email, String telefone,
            double valorHoraAula, boolean temMestrado, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.valorHoraAula = valorHoraAula;
        this.temMestrado = temMestrado;
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public boolean isTemMestrado() {
        return temMestrado;
    }

    public void setTemMestrado(boolean temMestrado) {
        this.temMestrado = temMestrado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
