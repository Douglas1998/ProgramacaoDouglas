package mortalk;

public class LutaL {
    
    private String cenario;
    //exemplo de uso de classe em outra
    private Personagem personagem1;
    private Personagem personagem3;    
    private Integer dano;    
    private Integer danocombo;

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Personagem getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Personagem personagem1) {
        this.personagem1 = personagem1;
    }

    public Personagem getPersonagem3() {
        return personagem3;
    }

    public void setPersonagem3(Reptile personagem2) {
        this.personagem3 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo;
    }

    public void setDanocombo(Integer danocombo) {
        this.danocombo = danocombo;
    }
    
    
    
    
    public LutaL() {
        
        this.cenario = "Casa do Goro";
        this.personagem1 = new Personagem();
        this.personagem3 = new Personagem();
        this.dano = 5;
        this.danocombo = 20;
        
    }
    
    public void AcertaGolpe(String lutador) {
        
        if (lutador.equals("p1")) {
            
            this.personagem3.setVida(this.personagem3.getVida() - this.dano);
            
        } else {
            
            this.personagem1.setVida(this.personagem1.getVida() - this.dano);
            
        }
        
    }
    
    public void AcertaCombo(String lutador) {
        
        if (lutador.equals("p1")) {
            
            this.personagem3.setVida(this.personagem3.getVida() - this.danocombo);
            
        } else {
            
            this.personagem1.setVida(this.personagem1.getVida() - this.danocombo);
            
        }
        
    }
    
}
