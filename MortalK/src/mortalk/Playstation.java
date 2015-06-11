package mortalk;

import newlista.pkg4.LutaReptileScorpion;
import javax.swing.JOptionPane;

public class Playstation {

    public static void main(String[] args) {

        int op;

        Reptile personagemplay = new Reptile();
        SubZero personagemplay1 = new SubZero();
        Scorpion personagemplay2 = new Scorpion();
        LutaReptileScorpion lutars = new LutaReptileScorpion();

        op = Integer.parseInt(JOptionPane.showInputDialog("1 - Reptile, 2 - Sub Zero, 3 - Scorpion, 4 - Luta entre Reptile e Scorpion "));

        switch (op) {

            case 1: {

                personagemplay.setAgarra("R2");
                personagemplay.setChuteforte("quadrado");
                personagemplay.setChutefraco("bolinha");
                personagemplay.setDefesa("R1");
                personagemplay.setEspecial("L2");
                personagemplay.setSocoforte("xis");
                personagemplay.setSocofraco("triangulo");
                personagemplay.setTrocapersonagem("L1");

                JOptionPane.showMessageDialog(null, "*****************CONFIGURAÇÃO DOS BOTÕES*********** \n Soco forte: \n" + personagemplay.getSocoforte() + "\n" + "Soco fraco: \n" + personagemplay.getSocofraco() + "\n" + "Chute forte \n" + personagemplay.getChuteforte() + "\n" + "Chute fraco \n" + personagemplay.getChutefraco() + "\n" + "Agarrar \n" + personagemplay.getAgarra() + "\n" + "Defender \n" + personagemplay.getDefesa() + "\n" + "Especial \n" + personagemplay.getEspecial() + "\n");
                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - REPTILE############### \n Para ficar insível: " + personagemplay.FicarInvisivel() + "\n" + "Para cuspir ácido:" + personagemplay.CuspirAcido() + "\n" + "Para lançar bola rápida:" + personagemplay.LançarBolaRapida() + "\n" + "Para lançar bola lenta:" + personagemplay.LançarBolaLenta());
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - REPTILE &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + personagemplay.Combo1() + "\n" + "Para fazer o combo 2:" + personagemplay.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - REPTILE @@@@@@@@ \n Para fazer o fatallity 1:" + personagemplay.Fatallity1() + "\n" + "Para fazer o fatallity 2:" + personagemplay.Fatallity2());

                break;
            }

            case 2: {

                personagemplay1.setAgarra("R2");
                personagemplay1.setChuteforte("quadrado");
                personagemplay1.setChutefraco("bolinha");
                personagemplay1.setDefesa("R1");
                personagemplay1.setEspecial("L2");
                personagemplay1.setSocoforte("xis");
                personagemplay1.setSocofraco("triangulo");
                personagemplay1.setTrocapersonagem("L1");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - SUB ZERO############### \n Para jogar gelo na frente: " + personagemplay1.GeloFrente() + "\n" + "Para jogar gelo no chão:" + personagemplay1.GeloChao() + "\n" + "Para slide:" + personagemplay1.Slide() + "\n");
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - SUB ZERO &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + personagemplay1.Combo1() + "\n" + "Para fazer o combo 2:" + personagemplay1.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - SUB ZERO @@@@@@@@ \n Para fazer o fatallity 1:" + personagemplay1.Fatality1() + "\n" + "Para fazer o fatallity 2:" + personagemplay1.Fatality2());

                break;
            }

            case 3: {

                personagemplay2.setAgarra("R2");
                personagemplay2.setChuteforte("quadrado");
                personagemplay2.setChutefraco("bolinha");
                personagemplay2.setDefesa("R1");
                personagemplay2.setEspecial("L2");
                personagemplay2.setSocoforte("xis");
                personagemplay2.setSocofraco("triangulo");
                personagemplay2.setTrocapersonagem("L1");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - SCORPION ############### \n Para jogar a lança: : " + personagemplay2.Spear() + "\n" + "Para fazer o teletransporte:" + personagemplay2.Teleport() + "\n" + "Para derruba:" + personagemplay2.Takedown() + "\n");
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - SCORPION &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + personagemplay2.Combo1() + "\n" + "Para fazer o combo 2:" + personagemplay2.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - SCORPION@@@@@@@@ \n Para fazer o fatallity 1:" + personagemplay2.Fatality1() + "\n" + "Para fazer o fatallity 2:" + personagemplay2.Fatality2());

                break;
            }

            case 4: {

                //VERIFICAR SE TEM QUE SIMULAR AS 6 LUTAS EM CADA CONSOLE: XBOX E PLAY
                lutars.setCenario("Inferno no Play");
                lutars.setPersonagem1(personagemplay); //representa o reptile
                lutars.setPersonagem2(personagemplay2); //representa o scorpion

               //No caso de o Reptile acertar um golpe
                
//                lutars.AcertaGolpe("personagemplay");
//
//                JOptionPane.showMessageDialog(null, "Personagem Play - Reptile ! ACERTOU O GOOOOOLPE! ");
//                JOptionPane.showMessageDialog(null, "O personagem Scorpion ficou com" + lutars.getPersonagem1().getVida() + "vidas e o" + "Reptile ficou com:" + lutars.getPersonagem3().getVida() + "vidas");
//            
//            }
//
//                // No caso de o Reptile acertar um combo
//            
//            lutars.AcertaCombo("personagemplay");
//                
//                JOptionPane.showMessageDialog(null, "Personagem Play - Reptile ! ACERTOU O COOOOMBO! ");
//
//                JOptionPane.showMessageDialog(null, "O personagem Scorpion ficou com" + lutars.getPersonagem1().getVida() + "vidas e o" + "Reptile ficou com: " + lutars.getPersonagem3().getVida() + "vidas");
//
//                
//                // No caso de o SubZero acertar um golpe
//                
//                lutars.AcertaGolpe("perosnagemplay2");
//                
//                
//                JOptionPane.showMessageDialog(null, "Personagem Play 2 - Scorpion ! ACERTOU O GOOOOOLPE! ");
//                    JOptionPane.showMessageDialog(null, "O personagem Reptile ficou com" + lutars.getPersonagem1().getVida() + "vidas e o" + "Scorpion ficou com:" + lutars.getPersonagem3().getVida() + "vidas");
//            
//                
//                
//                
                break;
        }

    }

}
}
