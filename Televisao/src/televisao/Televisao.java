package televisao;

import javax.swing.JOptionPane;

public class Televisao {

    public static void main(String[] args) {

//            InformacoesJogador c = new InformacoesJogador();
        //INSTANCIANDO   
        Emissora e = new Emissora();
        Apresentador ap = new Apresentador();

        int op = 0;

        while (op != 4) {

            op = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPÇÃO DESEJADA: "
                    + "1 - ATOR"
                    + "2 - NOVELA"
                    + "3 - EMISSORA"
                    + "4 - APRESENTADOR"));

            switch (op) {

                case 1: {

                    Ator a = new Ator();

                    a.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
                    a.setEmail(JOptionPane.showInputDialog("INFORME SEU E-MAIL"));
                    a.setNome_artistico(JOptionPane.showInputDialog("INFORME SEU NOME ARTÍSTICO"));
                    a.setCidade(JOptionPane.showInputDialog("INFORME O NOME DE SUA CIDADE"));
                    a.setBairro(JOptionPane.showInputDialog("INFORME SEU BAIRRO"));
                    a.setEstado(JOptionPane.showInputDialog("INFORME SEU ESTADO"));
                    
//                    a.setdatadenascimento = Integer.parseInt(JOptionPane.showInputDialog("INFORME A DATA DE NASCIMENTO"));
                    
                    
                    
                    a.setDatadenascimento =   (JOptionPane.showInputDialog("INFORME SUA DATA DE NASCIMENTO"));
                    a.setQuantidade_novelas = (JOptionPane.showInputDialog("INFORME A QUANTIDADE DE NOVELAS"));
                    a.setSalario_mensal = (JOptionPane.showInputDialog("INFORME O SALÁRIO MENSAL"));
                    a.setCache_participacao = (JOptionPane.showInputDialog("INFORME O CACHE RECEBIDO POR CADA PARTICIPAÇÃO EVENTO"));

//                    
                    break;
                }

                case 2: {

                    Novela n = new Novela();
                    
                    
                    n.setTitulo(JOptionPane.showInputDialog("INFORME O TÍTULO DA NOVELA"));
                    n.setPontuacao_ibope(JOptionPane.showInputDialog("INFORME A PONTUAÇÃO IBOPE DA NOVELA"));
                    
                    
                    
                    String cenasexo = (JOptionPane.showInputDialog("Há cenas de sexo n novela? (SIM/NÃO)"));
                    
                    if ("sim".equals(cenasexo)) {
                        
                        n.setCenas_sexo(Boolean.TRUE);
                        
                    }
                    
                    else {
                        
                        n.setCenas_sexo(Boolean.FALSE);
                    }
                    
                    String cenaviolencia = (JOptionPane.showInputDialog("Há cenas de violencia? (SIM/NÃO)"));
                    
                    if ("sim".equals(cenaviolencia)) {
                        
                        n.setCenas_violencia(Boolean.TRUE);
                        
                        
                    }
                    
                    else {
                        
                        n.setCenas_violencia(Boolean.FALSE);
                    }
                    
                    String cenadrogas = (JOptionPane.showInputDialog("Há cenas de drogas? (SIM/NÃO"));
                    
                    if ("sim".equals(cenadrogas)) {
                        
                        n.setCenas_drogas(Boolean.TRUE);
                        
                        
                    }
                    
                    else {
                        
                        n.setCenas_drogas(Boolean.FALSE);
                    }
                    
                    
                    String exibesexo;
                    
                    if (n.isCenas_sexo() == true) {
                        
                        exibesexo = "sim";
                    }
                    
                    else {
                        
                        exibesexo = "não";
                    }
                    
                    
                    String exibeviolencia;
                    
                    if (n.isCenas_violencia() == true) {
                        
                        exibeviolencia = "sim";
                    }
                    
                    else {
                        
                        exibeviolencia = "não";
                    }
                    
                    
                    String exibedrogas;
                    
                    if (n.isCenas_drogas() == true) {
                        
                        exibedrogas = "sim";
                    }
                    
                    else {
                        
                        exibedrogas = "não";
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    

                    break;
                }

                case 3: {

                    e.setNome(JOptionPane.showInputDialog("Informe o nome da emissora"));
                    e.setEndereco(JOptionPane.showInputDialog("Informe o endereço da emissora"));
                    String abertafechada = JOptionPane.showInputDialog("aberta ou fechada (SIM/NÃO)");

                    if ("sim".equals(abertafechada)) {

                        e.setTv(Boolean.TRUE);

                    } else {
                        e.setTv(Boolean.FALSE);

                    }

                    String exibeAberta;

                    if (e.isTv() == true) {

                        exibeAberta = "sim";

                    } else {

                        exibeAberta = "não";
                    }

                    JOptionPane.showMessageDialog(null, "Dados da Emissora" + e.getNome() + e.getEndereco() + exibeAberta);

                    break;
                }

                case 4: {

                    String numero_eventos = JOptionPane.showInputDialog("Informe a quantidade de eventos em que o apresentador participou no mês");

                    JOptionPane.showMessageDialog(null, "O ganho total do mês do apresentador foi de" + ap.calcularGanhos(op));

                    break;
                }

                default: {

                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA. TENTE NOVAMENTE!");

                    break;
                }

            }

        }

    }

}
