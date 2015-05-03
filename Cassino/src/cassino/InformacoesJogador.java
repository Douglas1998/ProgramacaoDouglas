package cassino;

import javax.swing.JOptionPane;

public class InformacoesJogador {

    private String nome;
    private String login;
    private String senha;
    private double cash;
    private double gold;
    private boolean jogando;
    private String roupa;
    private String acessorio;
    private String sapato;
    private String confirma;
    private Boolean ativa;

    public String getnome(String nome) {

        return this.nome;
    }

    public String getlogin(String login) {

        return this.login;
    }

    public String getsenha(String senha) {

        return this.senha;
    }

    public double getcash(String cash) {

        return this.cash;
    }

    public double getgold(String gold) {

        return this.gold;
    }

    public String getroupa(String roupa) {

        return this.roupa;
    }

    public String getacessorio(String acessorio) {

        return this.acessorio;
    }

    public String sapato(String sapato) {

        return this.sapato;
    }

//    public String isjogando (String jogando) {
//        
//        
//    }
//    
    InformacoesJogador() {

        nome = null;
        login = null;
        senha = null;
        cash = 0;
        gold = 0;
        jogando = false;
        roupa = null;
        acessorio = null;
        sapato = null;
        confirma = null;

    }

    Boolean realizarCadastro(String nome, String login, String senha, String confirma) {

        if (confirma.equals(senha)) {

            this.nome = nome;
            this.login = login;
            this.senha = senha;
            this.confirma = senha;
            this.jogando = false;
            this.gold = 50;
            this.cash = 0;
            this.roupa = "calca e camisa";
            this.acessorio = "relogio do camelo";
            this.sapato = "chinelo rider";

            return true;

        } else {
            return false;
        }

    }

    Boolean Entrar(String login, String senha) {

        Boolean retorno = false;
        
        
        
        
        if (this.login != null && this.senha != null) {

            if (login.equals(this.login) && senha.equals(this.senha)) {

                jogando = true;

                retorno = true;
            } else {
                retorno = false;

            }

        }

        return retorno;

    }

    Boolean Inserir_cash(String numerocartao, float valor) {

        Boolean retorno1 = false;

        if (jogando == true) {

            if (numerocartao.length() == 16) {

                this.cash = cash + valor;
                retorno1 = true;
            } else {
                retorno1 = false;
            }

        }
        return retorno1;

    }

    Boolean Comprar_roupa(String op1) {

        switch (op1) {

            case "terno": {

                if (cash >= 40) {

                    cash = cash - 40;
                    roupa = roupa + "terno";

                } else {
                    return false;
                }

                break;

            }

            case "smoking": {

                if (cash >= 45) {

                    cash = cash - 45;
                    roupa = roupa + "smoking";
                } else {

                    return false;
                }

            }

            case "vestidorosa": {

                if (cash >= 35) {

                    cash = cash - 35;

                    roupa = roupa + "vestidorosa";
                } else {

                    return false;
                }

                break;

            }

            case "tubinhodourado": {

                if (cash >= 55) {

                    cash = cash - 45;

                    roupa = roupa + "tubinhodourado";

                    break;
                }
            }

            default: {

                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA. TENTE NOVAMENTE!");
            }

        }
        return null;

    }

    Boolean Comprar_acessorio(String op2) {

        switch (op2) {

            case "pulseira": {

                if (cash >= 10) {

                    cash = cash - 10;
                    acessorio = acessorio + "pulseira";
                } else {

                    return false;
                }

                break;

            }

            case "relógio": {

                if (cash >= 20) {

                    cash = cash - 20;
                    acessorio = acessorio + "relogio";
                } else {

                    return false;
                }
                break;

            }

            case "óculos": {

                if (cash >= 30) {

                    cash = cash - 30;

                    acessorio = acessorio + "oculos";

                } else {

                    return false;
                }

            }

            case "chapéu": {

                if (cash >= 40) {

                    cash = cash - 40;

                    acessorio = acessorio + "chapéu";
                }

                break;
            }

        }
        return null;

    }
    
    Boolean comprar_sapato (String op3) {
        
        switch (op3) {
            
            
            case "tenis" : {
                
                if (cash >= 10) {
                    
                    cash = cash - 10;
                    
                    sapato = sapato +"tenis";
                    
                }
            }
            
            case "bota" : {
                
                if (cash >= 20) {
                    
                    cash = cash - 20;
                    
                    sapato = sapato + "bota";
                }
            }
            
            case "sandalia" : {
                
                if (cash >= 30) {
                    
                    cash = cash - 30;
                    
                    sapato = sapato + "sandalia";
                }
            }
            
            case "cuturno" : {
                
                if (cash >= 40) {
                    
                    cash = cash - 40;
                    
                    sapato = sapato + "cuturno";
                }
            }
        }
        return null;

}





}

