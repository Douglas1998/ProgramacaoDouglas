package mortalk;

public class Reptile extends Personagem {

    

    

    public String FicarInvisivel() {

        return "baixo, cima," + chuteforte;
        

    }

    public String CuspirAcido() {

        return "baixo, frente," + socofraco;

    }

    public String LançarBolaRapida() {

        return "cima,baixo," + socoforte;

    }

    public String LançarBolaLenta() {

        return "cima,baixo," + socofraco;

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
    
    
    private String BolaUltra() {
        
        
        return chuteforte + "," + especial + "baixo, direita, cima";
    }
    
 

}
