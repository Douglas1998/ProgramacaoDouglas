package televisao;

public class Ator {

    Ator a = new Ator();

    private String nome;
    private int datadenascimento;
    private int quantidade_novelas;
    private String email;
    private String nome_artistico;
    private double salario_mensal;
    private double cache_participacao;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(int datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public int getQuantidade_novelas() {
        return quantidade_novelas;
    }

    public void setQuantidade_novelas(int quantidade_novelas) {
        this.quantidade_novelas = quantidade_novelas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_artistico() {
        return nome_artistico;
    }

    public void setNome_artistico(String nome_artistico) {
        this.nome_artistico = nome_artistico;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public double getCache_participacao() {
        return cache_participacao;
    }

    public void setCache_participacao(double cache_participacao) {
        this.cache_participacao = cache_participacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
//MÉTODO CONSTRUTOR

    public Ator() {
        this.nome = null;
        this.datadenascimento = 0;
        this.quantidade_novelas = 0;
        this.email = null;
        this.nome_artistico = null;
        this.salario_mensal = 0;
        this.cache_participacao = 0;
        this.cidade = null;
        this.endereco = null;
        this.bairro = null;
        this.estado = null;

    }

    public String obterStatus(int quantidade_novelas, double salario_mensal) {

        String x;

        if (quantidade_novelas <= 3 && salario_mensal <= 5000) {

            x = "CALOURO";

        } else if (quantidade_novelas <= 6) {

            x = "REVELAÇÃO";
        } else if (quantidade_novelas <= 6 && salario_mensal > 30000) {

            x = "JÓIA";
        } else if (quantidade_novelas > 9 && salario_mensal < 30000) {

            x = "ELENCO DE APOIO";
        } else if (salario_mensal > 30000 && salario_mensal < 100000) {

            x = "ELENCO PRINCIPAL";
        } else if (salario_mensal > 100000.00) {

            x = "ESTRELA";

        } else {

            x = "ELENCO REGULAR";
        }

        return x;

    }

    //no caso a quantidade de eventos deverá ser informado pelo usuário
    public Double calcularGanhos(int quantidade_eventos) {

        Double ganho_mensal;

        ganho_mensal = (quantidade_eventos * cache_participacao) + salario_mensal;

        return ganho_mensal;
        
        
        
        
        

    }

}
