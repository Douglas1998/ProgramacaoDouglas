package caixa_eletronico;

import javax.swing.JOptionPane;

public class Caixa_Eletronico {
public static void main(String[] args) {
    
    int opcao = 0;
    Conta c = new Conta();
    
    
       
    while (opcao != 8){
        opcao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPERAÇÃO DESEJADA: \n"
                + "1 - CRIAR CONTA\n"
                + "2 - DEPOSITO\n"
                + "3 - SALDO\n"
                + "4 - SAQUE\n"
                + "5 - RESUMO DA CONTA\n"
                + "6 - ENCERRAR CONTA\n"
                + "7 - BANCO\n"
                + "8 - SAIR \n"));
    
        switch (opcao){
            
            case 1: {
                
                String nome, agencia, numero;
                nome = JOptionPane.showInputDialog("digite seu nome, coorentista");
                agencia = JOptionPane.showInputDialog("digite o número da sua agencia, correntista");
                numero = JOptionPane.showInputDialog("digite o numero da sua conta, correntista");
                
                
                c.abrir(agencia, numero, nome);
                
                JOptionPane.showMessageDialog(null,"Conta aberta com sucesso. Obrigado pela preferência!");
                            
                            
                   break;      
                
            }
            
            case 2:{
                      
                
                Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que você deseja depositar:"));   
                Boolean retorno = c.depositar(valor);
                
                if (retorno == true) {
                    
                    JOptionPane.showMessageDialog(null,"depósito concluído ;");
                }
                
                else  {
                    
                    JOptionPane.showInputDialog("depósito jnválido ");
                }
                
                                    
                    
           
           break;                       
                
                
                              
                
            }
            
            case 3:{
                
                Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                Boolean ret1 = c.sacar(valor1);
                
                if (ret1 == true) {
                    
                    JOptionPane.showMessageDialog(null,"Saque Concluído");
                    
                                        
                }
                
                else {
                    JOptionPane.showMessageDialog(null, "Operação sauqe não foi bem sucedida");
                }
                
            
                
                
                
                
            }
            
            case 4:{
                
                JOptionPane.showMessageDialog(null, c.retornarSaldo());
                
                
            }
            
            case 5:{
                
//               Boolean ret2 = c.ativo;
               
//               if (ret2 == true) {
                   
                   JOptionPane.showMessageDialog(null, "RESUMO DA CONTA /n" + "sua agencia é" +c.getAgencia()+ "seu nome é" +c.getnomeCorrentista()+ "o numero da sua conta é" +c.getnumeroConta()) ;
                   
                   
//               }
//               
////               else {
////                   
//                   JOptionPane.showMessageDialog(null, "Sua conta não está aberta. Procure nossa agência para abir");
//               }
               
                
            }
            
           case 6:{
                
                Boolean ret3 = c.fecharConta();
                
                if (ret3 == true) {
                    
                    JOptionPane.showMessageDialog(null, "Sr/Sra" +c.getnomeCorrentista()+ "sua conta foi fechada.");
                }
                
                else {
                    
                    JOptionPane.showMessageDialog(null, "Sr/Sra" +c.getnomeCorrentista()+ "sua conta não foi fechada");
                    
                }
            }
                case 7: {
                    
                    
                    
                
                
            }
                
                case 8: {
                    
                  JOptionPane.showMessageDialog(null, "VOCÊ DECIDIU SAIR! VOLTE SEMPRE!");

                    
                    
                }
                
                
            }
            
            
        }
    }
    
}


