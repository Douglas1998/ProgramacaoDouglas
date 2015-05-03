package cassino;

public class JogoDados {

    private final int numero_informado;
    private int goldapostar;
    

    public int getnumero_informado() {

        return this.numero_informado;
    }

    public int getgoldapostar() {

        return this.goldapostar;
    }

    JogoDados() {

        numero_informado = 0;
        goldapostar = 0;

    }

    public int JogoDados(int numero_informado, int goldapostar) {

        int numero_sorteado1;
        int numero_sorteado2;
        int soma;

        numero_sorteado1 = (int) (Math.random() * 12);
        numero_sorteado2 = (int) (Math.random() * 12);
        
        
        
        
        soma = (numero_sorteado1 + numero_sorteado2);     
        
        
        
                    
            if (numero_informado == soma) {

            this.goldapostar = goldapostar * 12;

            return soma;

        } else if (soma == numero_informado - 1 || soma == numero_informado + 1) {

            this.goldapostar = goldapostar * 5;

            return soma;

        } else {

            this.goldapostar = goldapostar - goldapostar;

            return soma;

        }

            
        }

        
    }
    
    


