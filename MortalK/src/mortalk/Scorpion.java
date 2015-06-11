package mortalk;

public class Scorpion extends Personagem {


    
     public String Spear() {

        return "esquerda, esquerda," + chutefraco;

    }

    public String Teleport() {

        return "baixo, baixo," + socoforte;

    }

    public String Takedown() {

        return "cima,cima,cima" + chuteforte;

    }

    public String Combo1() {

        return "esquerda,direita,cima, baixo," + especial;

    }

    public String Combo2() {

        return "esquerda, baixo, cima," + especial;

    }

    public String Fatality1() {

        return "baixo, baixo, esquerda, cima," + chuteforte;

    }

    public String Fatality2() {

        return "baixo, cima, cima, cima," + chuteforte;

    }

    private String Airdeamon() {
        
        
        return chuteforte + "," + especial + "baixo, cima, esquerda, direita, direita, direita";

    }
    

}
