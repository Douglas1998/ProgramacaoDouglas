package mortalk;

public class Raiden extends Personagem {

    String raiofrente() {
        return "Cima,Cima" + chuteforte;

    }

    String teleport() {
        return "Esquerda,direita" + chuteforte;
    }

    String boladeraio() {
        return "Cima , Esquerda" + chuteforte;
    }

    public String Combo1() {
        return socoforte + chuteforte + chutefraco;
    }

    public String Combo2() {
        return socofraco + chutefraco + socoforte;
    }

    public String Fatality1() {
        return "Baixo,esquerda,Baixo,Cima" + chutefraco;
    }

    String Falality2() {
        return "Baixo,cima,Direita,Esquerda" + socofraco;
    }

    private String bolaultrasonica() {
        return "Cima,Baixo,Cima,Cima,Baixo" + socofraco;
    }
}
