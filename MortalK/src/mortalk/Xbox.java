package mortalk;

import javax.swing.JOptionPane;

public class Xbox {

    public static void main(String[] args) {

        //SE QUISER ESSA PARTE PODE ESTAR NA OPÇÃO 1 DE UM MENU NA CLASSE PRINCIPAL
        int op;

        //instanciar as classes
        Reptile p1 = new Reptile();
        Reptile reptile2 = new Reptile();
        SubZero p2 = new SubZero();
        Scorpion p3 = new Scorpion();
        JonnyCage p4 = new JonnyCage();
        Raiden p5 = new Raiden();
        KItana p6 = new KItana();

        //instanciar luta
        LutaL lutars = new LutaL();
        LutaL lutarr = new LutaL();
        LutaL lutass = new LutaL();

        op = Integer.parseInt(JOptionPane.showInputDialog("1 - Escolher Reptile , 2 - Escolher Sub Zero , 3 - Escolher Scorpion, 4 - Luta entre Reptile e o Scorpion, 5 - Luta entre Reptile e Reptile"
                + "6 - Luta entre Sub Zero e Scorpion, 7 - Luta entre Reptile e Sub Zero, 8 - Luta entre Scorpion e Scorpion, "
                + "9 - Luta entre SubZero e Subzero, 10 - Escolher Jonny Cage, 11 - Escolher Raiden, 12 - Escolher Kitana, 13 - Escolher Kung Lao"));

        switch (op) {

            case 1: {

                p1.setSocoforte("quadrado");
                p1.setSocofraco("xis");
                p1.setChuteforte("bolinha");
                p1.setChutefraco("triangulo");
                p1.setAgarra("R1");
                p1.setEspecial("L1");
                p1.setDefesa("R2");

                JOptionPane.showMessageDialog(null, "*****************CONFIGURAÇÃO DOS BOTÕES*********** \n Soco forte: \n" + p1.getSocoforte() + "\n" + "Soco fraco: \n" + p1.getSocofraco() + "\n" + "Chute forte \n" + p1.getChuteforte() + "\n" + "Chute fraco \n" + p1.getChutefraco() + "\n" + "Agarrar \n" + p1.getAgarra() + "\n" + "Defender \n" + p1.getDefesa() + "\n" + "Especial \n" + p1.getEspecial() + "\n");
                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - REPTILE############### \n Para ficar insível: " + p1.FicarInvisivel() + "\n" + "Para cuspir ácido:" + p1.CuspirAcido() + "\n" + "Para lançar bola rápida:" + p1.LançarBolaRapida() + "\n" + "Para lançar bola lenta:" + p1.LançarBolaLenta());
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - REPTILE &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + p1.Combo1() + "\n" + "Para fazer o combo 2:" + p1.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - REPTILE @@@@@@@@ \n Para fazer o fatallity 1:" + p1.Fatallity1() + "\n" + "Para fazer o fatallity 2:" + p1.Fatallity2());

                break;
            }

            case 2: {

                p2.setAgarra("R1");
                p2.setChuteforte("bolinha");
                p2.setChutefraco("triangulo");
                p2.setDefesa("R2");
                p2.setEspecial("L1");
                p2.setSocoforte("quadrado");
                p2.setSocofraco("xis");
                p2.setTrocapersonagem("L2");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - SUB ZERO############### \n Para jogar gelo na frente: " + p2.GeloFrente() + "\n" + "Para jogar gelo no chão:" + p2.GeloChao() + "\n" + "Para slide:" + p2.Slide() + "\n");
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - SUB ZERO &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + p2.Combo1() + "\n" + "Para fazer o combo 2:" + p2.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - SUB ZERO @@@@@@@@ \n Para fazer o fatallity 1:" + p2.Fatality1() + "\n" + "Para fazer o fatallity 2:" + p2.Fatality2());

                break;
            }

            case 3: {

                p3.setAgarra("R1");
                p3.setChuteforte("bolinha");
                p3.setChutefraco("triangulo");
                p3.setDefesa("R2");
                p3.setEspecial("L1");
                p3.setSocoforte("quadrado");
                p3.setSocofraco("xis");
                p3.setTrocapersonagem("L2");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - SCORPION ############### \n Para jogar a lança: : " + p3.Spear() + "\n" + "Para fazer o teletransporte:" + p3.Teleport() + "\n" + "Para derruba:" + p3.Takedown() + "\n");
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - SCORPION &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + p3.Combo1() + "\n" + "Para fazer o combo 2:" + p3.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - SCORPION@@@@@@@@ \n Para fazer o fatallity 1:" + p3.Fatality1() + "\n" + "Para fazer o fatallity 2:" + p3.Fatality2());

                break;

            }

            case 4: {

                lutars.setCenario("Inferno");
                lutars.setPersonagem1(p1); //reptile
                lutars.setPersonagem2(p3); //scorpion que no meu programa está como p3

                //PARA O PERSONAGEM 1 NO CASO O REPTILE ACERTAR O GOLPE
                lutars.AcertaGolpe("p1");

                JOptionPane.showMessageDialog(null, "Personagem 1 - Reptile ! ACERTOU O GOOOOOLPE! ");

                JOptionPane.showMessageDialog(null, "O personagem Reptile ficou com" + lutars.getPersonagem1().getVida() + "vidas e o" + "Scorpion ficou com:" + lutars.getPersonagem3().getVida() + "vidas");

                // PARA O PERSONAGEM 1 NO CASO O REPTILE ACERTAR O COMBO
                lutars.AcertaCombo("p1");

                JOptionPane.showMessageDialog(null, "Personagem 1 - Reptile ! ACERTOU O COOOOMBO! ");

                JOptionPane.showMessageDialog(null, "O personagem Reptile ficou com" + lutars.getPersonagem1().getVida() + "vidas e o" + "Scorpion ficou com: " + lutars.getPersonagem3().getVida() + "vidas");

                // PARA O PERSONAGEM 3 NO CASO O SCORPION ACERTAR O GOLPE
                lutars.AcertaGolpe("p3");

                JOptionPane.showMessageDialog(null, "Personagem 3 - Scorpion ! ACERTOU O GOOOOOLPE! ");

                JOptionPane.showMessageDialog(null, "O personagem Reptile ficou com " + lutars.getPersonagem1().getVida() + "vidas e o" + "Scorpion ficou com:" + lutars.getPersonagem3().getVida() + "vidas");

                // PARA O PERSONAGEM 3, NO CASO O SCORPION ACERTAR O COMBO
                lutars.AcertaCombo("p3");

                JOptionPane.showMessageDialog(null, "Personagem 3 - Scorpion ! ACERTOU O COOOOMBO! ");

                JOptionPane.showMessageDialog(null, "O personagem Scorpion ficou com " + lutars.getPersonagem1().getVida() + "vidas e o" + "Reptile ficou com:" + lutars.getPersonagem3().getVida() + "vidas");

                break;
            }

            case 5: {

                //LUTA DO REPTILE COM O REPTILE
                //NESSE CASE VERIFICAR NOVAMENTE SE OS VALORES FECHAM
                lutarr.setCenario("Inferno");
                lutarr.setPersonagem1(p1); //reptile
                lutarr.setPersonagem3(reptile2); //reptile

                //NO CASO DE  O REPTILE 1 ACERTAR O GOLPE
                lutarr.AcertaGolpe("p1");

                JOptionPane.showMessageDialog(null, "Personagem REPTILE 1 ! ACERTOU O GOOOOOLPE!");

                JOptionPane.showMessageDialog(null, "O personagem REPTILE 1 ficou com" + lutarr.getPersonagem1().getVida() + "vidas e o" + "REPTILE 2 ficou com:" + lutarr.getPersonagem3().getVida() + "vidas");

                //NO CASO DE O REPTILE 1 ACERTAR UM COMBO
                lutarr.AcertaCombo("p1");

                JOptionPane.showMessageDialog(null, "Personagem REPTILE 1 ! ACERTOU O COOOOMBO!");
                JOptionPane.showMessageDialog(null, "O personagem REPTILE 1 ficou com" + lutarr.getPersonagem1().getVida() + "vidas e o" + "REPTILE 2 ficou com:" + lutarr.getPersonagem3().getVida() + "vidas");

                //NO CASO DE O REPTILE 2 ACERTAR O GOLPE
                lutarr.AcertaGolpe("p3");

                JOptionPane.showMessageDialog(null, "Personagem REPTILE 2 ! ACERTOU O GOOOOOLPE!");
                JOptionPane.showMessageDialog(null, "O personagem REPTILE 1 ficou com" + lutarr.getPersonagem1().getVida() + "vidas e o" + "REPTILE 2 ficou com:" + lutarr.getPersonagem3().getVida() + "vidas");

                // NO CASO DE O REPTILE 2 ACERTAR UM COMBO
                lutarr.AcertaCombo("p3");

                JOptionPane.showMessageDialog(null, "Personagem REPTILE 2 ! ACERTOU O COOOOMBO!");
                JOptionPane.showMessageDialog(null, "O personagem REPTILE 1 ficou com" + lutarr.getPersonagem1().getVida() + "vidas e o" + "REPTILE 2 ficou com:" + lutarr.getPersonagem3().getVida() + "vidas");

                break;

            }

            case 6: {

                //LUTA ENTRE SUB ZERO E SCORPION
                break;
            }

            case 7: {

                //LUTA ENTRE REPTILE E SUBZERO
                break;
            }

            case 8: {

                //LUTA ENTRE SCORPION E SCORPION
                break;
            }

            case 9: {

                //LUTA ENTRE SUBZERO E SUBZERO
                break;

            }

            case 10: {

                p4.setAgarra("R1");
                p4.setChuteforte("bolinha");
                p4.setChutefraco("triangulo");
                p4.setDefesa("R2");
                p4.setEspecial("L1");
                p4.setSocoforte("quadrado");
                p4.setSocofraco("xis");
                p4.setTrocapersonagem("L2");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - JONNY CAGE ############### \n Para jogar a bola em cima: : " + p4.bolacima() + "\n" + "Para jogar a bola para frente:" + p4.bolafrente());
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - JONNY CAGE &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + p4.Combo1() + "\n" + "Para fazer o combo 2:" + p4.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - JONNY CAGE @@@@@@@@ \n Para fazer o fatallity 1:" + p4.Fatality1() + "\n" + "Para fazer o fatallity 2:" + p4.Fatality2());

            }

            case 11: {

                p5.setAgarra("R1");
                p5.setChuteforte("bolinha");
                p5.setChutefraco("triangulo");
                p5.setDefesa("R2");
                p5.setEspecial("L1");
                p5.setSocoforte("quadrado");
                p5.setSocofraco("xis");
                p5.setTrocapersonagem("L2");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - RAIDEN ############### \n Para jogar a bola de raio: : " + p5.boladeraio() + "\n");
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - RAIDEN &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + p5.Combo1() + "\n" + "Para fazer o combo 2:" + p5.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - RAIDEN @@@@@@@@ \n Para fazer o fatallity 1:" + p5.Fatality1() + "\n" + "Para fazer o fatallity 2:" + p5.Falality2());

            }

            case 12: {

                // escolher kitana
                p6.setAgarra("R1");
                p6.setChuteforte("bolinha");
                p6.setChutefraco("triangulo");
                p6.setDefesa("R2");
                p6.setEspecial("L1");
                p6.setSocoforte("quadrado");
                p6.setSocofraco("xis");
                p6.setTrocapersonagem("L2");

                JOptionPane.showMessageDialog(null, "################COMANDOS ESPECIAIS - KITANA ############### \n Para cortar: : " );
                JOptionPane.showMessageDialog(null, "&&&&&&&&&&&&&& COMBOS - KITANA &&&&&&&&&&&&&&&&& \n Para fazer o combo 1:" + p6.Combo1() + "\n" + "Para fazer o combo 2:" + p6.Combo2());
                JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ FATALLITYS - KITANA @@@@@@@@ \n Para fazer o fatallity 1:" + p6.Fatality1() + "\n" + "Para fazer o fatallity 2:" + p6.Falality2());

            }

        }

    }
}
