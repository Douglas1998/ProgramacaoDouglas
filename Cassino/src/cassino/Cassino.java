package cassino;

import javax.swing.JOptionPane;

public class Cassino {

    public static void main(String[] args) {

        InformacoesJogador c = new InformacoesJogador();

        int op = 0;

        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPERAÇÃO DESEJADA: \n"
                    + "1 - REALIZAR CADASTRO \n"
                    + "2 - ENTRAR \n"
                    + "3 - INSERIR CASH \n"
                    + "4 - COMPRAR ROUPA \n"
                    + "5 - COMPRAR ACESSÓRIO \n"
                    + " 6 - COMPRAR SAPATO \n"
                    + "7 - JOGAR GAME DE DADOS \n "
                    + "8 - JOGAR GAME DA ROLETA \n"
                    + "9 - SAIR\n"));

            switch (op) {

                case 1: {

                    String nome, login, senha, vconfirma;

                    nome = JOptionPane.showInputDialog("Informe seu nome");
                    login = JOptionPane.showInputDialog("Informe seu login");
                    senha = JOptionPane.showInputDialog("Informe sua senha");
                    vconfirma = JOptionPane.showInputDialog("CONFIRME SUA SENHA");

                    if (c.realizarCadastro(nome, login, senha, vconfirma) == true) {

                        JOptionPane.showMessageDialog(null, "CONTA CRIADA COM SUCESSO");

                    } else {

                        JOptionPane.showMessageDialog(null, "SUA CONTA NÃO FOI CRIADA COM SUCESSO. TENTE NOVAMENTE");
                    }

                    break;

                }

                case 2: {
                    
                   
                    String a, w;

                    a = JOptionPane.showInputDialog("informe o seu login");
                    w = JOptionPane.showInputDialog("Informe a sua senha");
                    
                    if (c.Entrar(a, w) == true) {
                        
                        JOptionPane.showMessageDialog(null, "Você fez o login com sucesso");
                        
                    }
                    
                    else {
                        JOptionPane.showMessageDialog(null, "O login não foi feito corretamente. Tente novamente");
                    }


                    break;
                }

                case 3: {

//                    c.Inserir_cash(null, op);

                    String x = JOptionPane.showInputDialog("Informe o número do cartão");
                    String y = JOptionPane.showInputDialog("Informe o valor para inserir cache");

                    if (c.Inserir_cash(x, Float.parseFloat(y)) == true) {

                        JOptionPane.showMessageDialog(null, "OPERAÇÃO REALIZADA COM SUCESSO");

                    } else {

                        JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL INSERIR CACHE");
                    }
                    
                    break;
                }

                case 4: {

                    String op1;

                    JOptionPane.showMessageDialog(null, " Escolha o item que deseja comprar. Digite a palavra com letra minúscula. "
                            + "terno \n"
                            + "smoking \n"
                            + "vestidorosa \n"
                            + "tubinhodourado \n");

                    op1 = JOptionPane.showInputDialog("Entre com sua opção:");

                    c.Comprar_roupa(op1);
                    

                    if (c.Comprar_roupa(op1) == true) {

                        JOptionPane.showMessageDialog(null, "COMPRA EFETUADA COM SUCESSO!");

                    } else {

                        JOptionPane.showMessageDialog(null, "A COMPRA NÃO FOI EFETUADA. VOCÊ NÃO TEM CACHE SUFICIENTES");
                    }
                    
                    break;

                }

                case 5: {

                    String op2;

                    JOptionPane.showMessageDialog(null, " Escolha o acessório que deseja comprar: "
                            + "pulseira \n"
                            + "relógio \n"
                            + "óculos \n"
                            + "chapéu \n");

                    op2 = JOptionPane.showInputDialog("Entre com sua opção:");

                    c.Comprar_acessorio(op2);

                    if (c.Comprar_acessorio(op2) == true) {

                        JOptionPane.showMessageDialog(null, "A COMPRA DO ACESSÓRIO FOI EFETUADA COM SUCESSO.");
                    } else {

                        JOptionPane.showMessageDialog(null, "A COMPRA NÃO FOI EFETUADA COM SUCESSO, POIS VOCÊ NÃO TEM CASH SUFICIENTES");
                    }
                    
                    break;

                }
            

                case 6: {

                    String op3;

                    JOptionPane.showInputDialog(null, "Escolha o sapato que deseja comprar:"
                            + "tenis \n"
                            + "bota \n"
                            + "sandália \n"
                            + "cuturno \n");

                    op3 = JOptionPane.showInputDialog("Entre com sua opção:");
                    
                    c.comprar_sapato(op3);
                    
                    if (c.comprar_sapato(op3) == true) {
                        
                        JOptionPane.showMessageDialog(null, "A COMPRA DO SAPATO FOI BEM SUCEDIDA");
                    }
                    
                    else {
                        JOptionPane.showMessageDialog(null, "A COMPRA DO SAPATO FOI MAL SUCEDIDA");
                    }

                }

                case 7: {

                    //game de dados
                    String numero_informado;
                    String goldapostar;

                    JOptionPane.showMessageDialog(null, "Olá, bem - vindo ao jogo de dados. Os números disponíveis para apostas são esses:"
                            + "2 \n"
                            + "3 \n"
                            + "4 \n"
                            + "5 \n"
                            + "6 \n"
                            + "7 \n"
                            + "8 \n"
                            + "9 \n"
                            + "10 \n"
                            + "11 \n"
                            + "12 \n");

                    numero_informado = JOptionPane.showInputDialog("Entre com a opção desejada:");
                    goldapostar = JOptionPane.showInputDialog("Informe o número de golds que seja apostar");

                    JogoDados x = new JogoDados();

                    int soma = x.JogoDados(Integer.parseInt(numero_informado), Integer.parseInt(goldapostar));

                    if (x.getgoldapostar() > 0) {

                        JOptionPane.showMessageDialog(null, "a soma dos números sorteados foi:" + soma);
                        int ganhou = x.getgoldapostar();
                        

                    } else {

                        JOptionPane.showMessageDialog(null, "você não tem golds suficientes para jogar.");
                    }

                    break;
                }

                case 8: {

                    //game da roleta
                    String goldapostar = null;
                    String numero_informado = null;
//
//
                    String opcao = JOptionPane.showInputDialog("Digite a modalidade requisitada para ganhar golds:"
                            + "1"
                            + "2"
                            + "3");
                    // 1 - apostar em um único número
                    // 2 - apostar em uma sequencia maior de numeros
                    // 3 - apostar em uma sequencia bem maior de numeros

                    switch (opcao) {

                        case "1": {

                            JogoRoleta a = new JogoRoleta();

                            a.Caso1(goldapostar, numero_informado);

//                            numero_informado = JOptionPane.showInputDialog("Informe o único número que deseja apostar:");
//                            goldapostar = JOptionPane.showInputDialog("Informe a quantidade de golds que deseja apostar:");

                            if (a.getnumero_informado(op) == a.getnumsorteio(op)) {

                                JOptionPane.showMessageDialog(null, "Você ganhou!");

                            } else {

                                JOptionPane.showMessageDialog(null, "Você perdeu!");

                            }

                            //chamar método do caso 1
                            break;
                        }

                        case "2": {

                            JogoRoleta a = new JogoRoleta();

                            a.Caso2(goldapostar, numero_informado);

//                            numero_informado = JOptionPane.showInputDialog("Informe o único número que deseja apostar:");
//                            goldapostar = JOptionPane.showInputDialog("Informe a quantidade de golds que deseja apostar:");

                            //chamar método do caso2
                            break;
                        }

                        case "3": {

                            JogoRoleta a = new JogoRoleta();

                            a.Caso3(goldapostar, numero_informado);

                            //chamar método do caso3
                            break;
                        }

                    }

//                    numero_informado = JOptionPane.showInputDialog("Entre com o número desejado:");
//                    goldapostar = JOptionPane.showInputDialog("Informe o número de golds que seja apostar");
                    break;

                }

                case 9: {

                    JOptionPane.showMessageDialog(null, "VOCÊ DECIDIU SAIR! OBRIGADO E VOLTE SEMPRE! :D");

                }

                default: {

                    JOptionPane.showInputDialog("Opção Inválida");
                }
                
                
                

            }

        }

    }

}
