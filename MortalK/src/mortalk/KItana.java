/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortalk;

/**
 *
 * @author MateusMalaquias
 */
public class KItana extends Personagem {

    String ventania() {
        return "direita,direita" + chuteforte;

    }

    String cortar() {
        return "Esquerda,direita" + chuteforte;
    }

    String voar() {
        return "Cima , cima" + chuteforte;
    }

    public String Combo1() {
        return socoforte + chuteforte + "esquerda";
    }

    public String Combo2() {
        return socofraco + chutefraco + "direita";
    }

    String Fatality1() {
        return "Baixo,Baixo,Baixo,Cima" + chutefraco;
    }

    String Falality2() {
        return "Baixo,Esquerda,Direita,Esquerda" + socofraco;
    }

    private String furação() {
        return "Cima,Baixo,Cima,direita,direita" + socofraco;
    }
}
