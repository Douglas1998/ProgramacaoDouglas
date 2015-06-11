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
public class KungLao extends Personagem {

    String chapeuvoador() {
        return "esquerda,esquerda" + chuteforte;

    }

    String teleport() {
        return "baixo,baixo" + chuteforte;
    }

    String giro() {
        return "Cima , Esquerda" + chuteforte;
    }

    public String Combo1() {
        return socoforte + chuteforte;
    }

    public String Combo2() {
        return socofraco + chutefraco + socoforte + "baixo";
    }

    String Fatality1() {
        return "Baixo,Baixo,Baixo,Cima" + chutefraco;
    }

    String Falality2() {
        return "Baixo,Esquerda,Direita,Esquerda" + socofraco;
    }

    private String girogigante() {
        return "Cima,cima,Cima,Cima,Baixo" + socofraco;
    }
}
