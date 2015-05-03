package cassino;

public class JogoRoleta {

    private final int numero_informado;
    private final int goldapostar;
    private int numsorteio;
    private Boolean teste;

    public int getnumero_informado(int numero_informado) {

        return this.numero_informado;
    }

    public int getgoldapostar(int goldapostar) {

        return this.goldapostar;
    }

    public Boolean teste(Boolean teste) {

        return this.teste;
    }

    public int getnumsorteio(int numsorteio) {

        return this.numsorteio;
    }

    JogoRoleta() {

        numero_informado = 0;
        goldapostar = 0;

    }

    public Boolean Caso1(String goldapostar, String numero_informado) {
        
        

        numsorteio = (int) (Math.random() * 36);

        teste = numero_informado.equals(numsorteio);
        return teste;
        
        
    }

    public Boolean Caso2(String goldapostar, String numero_informado) {
        numsorteio = (int) (Math.random() * 36);

        teste = numero_informado.equals(numsorteio);
        return teste;
    }

    public Boolean Caso3(String goldapostar, String numero_informado) {
        numsorteio = (int) (Math.random() * 36);

        teste = numero_informado.equals(numero_informado);
        return teste;
    }

}
