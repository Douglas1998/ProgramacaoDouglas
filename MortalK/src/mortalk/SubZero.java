package mortalk;

public class SubZero extends Personagem {



    public String GeloFrente() {

        return "baixo, esquerda," + socoforte;

    }

    public String GeloChao() {

        return "cima, cima," + socofraco;

    }

    public String Slide() {

        return "baixo,baixo," + chuteforte;

    }

    public String Combo1() {

        return "esquerda,esquerda,baixo," + especial;

    }

    public String Combo2() {

        return "direita, direita, baixo," + especial;

    }

    public String Fatality1() {

        return "cima, cima, baixo, baixo," + chuteforte;

    }

    public String Fatality2() {

        return "baixo, cima, baixo, baixo," + chuteforte;

    }

    private String SuperGelo() {
        
        
        return chuteforte + "," + especial + "cima, cima, esquerda";

    }
}
