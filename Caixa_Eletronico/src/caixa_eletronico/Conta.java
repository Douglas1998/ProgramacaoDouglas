package caixa_eletronico;

public class Conta {

    private Cliente correntista;
    private Gerente infogerente;
    private String agencia;
    private Double saldo;
    private Boolean ativo;
    private String numeroconta;

    //CRIA-SE UM MÉTODO (get) PARA TORNAR PUBLICO AS VARIAVEIS QUE O BANCO DEVE SABER, NO CASO ATIVO NÃO É
    //agora: sout (c.getAgencia());
    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public Gerente getInfogerente() {
        return infogerente;
    }

    public void setInfogerente(Gerente infogerente) {
        this.infogerente = infogerente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }
    

    public Conta() {
        agencia = null;
        numeroconta = null;
        this.correntista = new Cliente();        
       this.infogerente = new Gerente(); 
        
             
        

        saldo = null;
        ativo = false;

    }

    //construtor: é o método construdor da classe
    // com isso pode-se atribuir nas classes;
    public void abrir(String agencia, String numero, String nome) {
        this.agencia = agencia;
        this.numeroConta = numero;
        this.nomeCorrentista = nome;
        this.ativo = true;
        this.saldo = 0.0;

    }

    public Boolean fecharConta() {

        Boolean retorno;
        if (saldo == 0.0) {
            ativo = false;
            retorno = true;

        } else {
            retorno = false;
        }
        return retorno;
    }

    public Boolean depositar(Double valor) {
        if (ativo == true) {
            saldo = saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public Boolean sacar(Double valor) {
        if (ativo == true && valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public Double retornarSaldo() {
        return saldo;
    }
}
