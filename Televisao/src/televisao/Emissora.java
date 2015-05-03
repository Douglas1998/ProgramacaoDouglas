package televisao;
public class Emissora {
    
    private String nome;
    private String endereco;
    private Boolean tv;
    private Boolean aberta;

    //mostrar se é exibida na tv aberta ou fechada
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean isTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }
    
    
    public Emissora () {
        
        this.nome = null;
        this.endereco = null;
        this.aberta = null;     
        
        
        
        
    }
}
