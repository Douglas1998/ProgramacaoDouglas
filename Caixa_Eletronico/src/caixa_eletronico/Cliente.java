package caixa_eletronico;

public class Cliente {

    private String cpf;
    private String nome;
    private String data_nascimento;
    private String endereco;
    private Boolean negativadoSpc;
    private Boolean negativadoSerasa;
    private String nomepai;
    private String nomemae;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean isNegativadoSpc() {
        return negativadoSpc;
    }

    public void setNegativadoSpc(Boolean negativadoSpc) {
        this.negativadoSpc = negativadoSpc;
    }

    public Boolean isNegativadoSerasa() {
        return negativadoSerasa;
    }

    public void setNegativadoSerasa(Boolean negativadoSerasa) {
        this.negativadoSerasa = negativadoSerasa;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    Cliente() {

        cpf = null;
        nome = null;
        data_nascimento = null;
        endereco = null;
        negativadoSpc = null;
        negativadoSerasa = null;
        nomepai = null;
        nomemae = null;

    }

    public Boolean verificaCredito() {

        return this.negativadoSerasa == false && this.negativadoSpc == false;

    }

}
