package televisao;

public class Apresentador {

    private String nome;
    private int data_nascimento;
    private String programa;
    private String email;
    private String nome_artistico;
    private double salario_mensal;
    private double cache_participacao;
    private double valor_merchan;
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

    public int getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(int data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
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

    public double getValor_merchan() {
        return valor_merchan;
    }

    public void setValor_merchan(double valor_merchan) {
        this.valor_merchan = valor_merchan;
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

   

    public Apresentador() {
        
        //método construtor

        nome = null;
        data_nascimento = 0;
        programa = null;
        email = null;
        nome_artistico = null;
        salario_mensal = 0.0;
        cache_participacao = 0.0;
        valor_merchan = 0.0;
        cidade = null;
        endereco = null;
        bairro = null;
        estado = null;
        
        

    }
    
    public Double calcularGanhos (int numero_eventos) {
        
        Double ganho_mensal;
        
        ganho_mensal = (numero_eventos * cache_participacao) + (valor_merchan + salario_mensal);
        
        return ganho_mensal;
        

        

        
    }

}
