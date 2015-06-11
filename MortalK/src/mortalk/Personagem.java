package mortalk;
public class Personagem {
    
    
    
    protected String socoforte;
    protected String socofraco;
    protected String chuteforte;
    protected String chutefraco;
    protected String defesa;
    protected String agarra;
    protected String especial;
    protected Integer vida;
    protected String trocapersonagem;

    public String getTrocapersonagem() {
        return trocapersonagem;
    }

    public void setTrocapersonagem(String trocapersonagem) {
        this.trocapersonagem = trocapersonagem;
    }
    
    
    public String getSocoforte() {
        return socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
        
    public Personagem() {
        
        
        this.agarra = null;
        this.chuteforte = null;
        this.defesa = null;
        this.especial = null;
        this.socoforte = null;
        this.socofraco = null;
        this.chutefraco = null;
        this.vida = 100;

        

    }
    
    
    public String Combo1() {

        return "esquerda,baixo,cima," + especial;

    }

    public String Combo2() {

        return "direita, cima, baixo," + especial;

    }

    public String Fatallity1() {

        return "cima, baixo, direita, esquerda," + chuteforte;

    }

    public String Fatallity2() {

        return "esquerda, direita, cima," + chuteforte + socoforte;

    }
    
    
    
}
