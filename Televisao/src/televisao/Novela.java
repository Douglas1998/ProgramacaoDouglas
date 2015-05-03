package televisao;

public class Novela {

    private String titulo;
    private int periodo_duracao;
    private int data_primeirocap;
    private int data_segundocap;
    private double horario_exibicao;
    private String autor;
    private String emissora;
    private double pontuacao_ibope;
    private Boolean cenas_violencia;
    private Boolean cenas_sexo;
    private Boolean cenas_drogas;

//se apresenta cenas de violência (SIM/Não), sexo(Sim/Não) e drogas(Sim/Não).
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPeriodo_duracao() {
        return periodo_duracao;
    }

    public void setPeriodo_duracao(int periodo_duracao) {
        this.periodo_duracao = periodo_duracao;
    }

    public int getData_primeirocap() {
        return data_primeirocap;
    }

    public void setData_primeirocap(int data_primeirocap) {
        this.data_primeirocap = data_primeirocap;
    }

    public int getData_segundocap() {
        return data_segundocap;
    }

    public void setData_segundocap(int data_segundocap) {
        this.data_segundocap = data_segundocap;
    }

    public double getHorario_exibicao() {
        return horario_exibicao;
    }

    public void setHorario_exibicao(double horario_exibicao) {
        this.horario_exibicao = horario_exibicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public double getPontuacao_ibope() {
        return pontuacao_ibope;
    }

    public void setPontuacao_ibope(double pontuacao_ibope) {
        this.pontuacao_ibope = pontuacao_ibope;
    }

    public Boolean isCenas_violencia() {
        return cenas_violencia;
    }

    public void setCenas_violencia(Boolean cenas_violencia) {
        this.cenas_violencia = cenas_violencia;
    }

    public Boolean isCenas_sexo() {
        return cenas_sexo;
    }

    public void setCenas_sexo(Boolean cenas_sexo) {
        this.cenas_sexo = cenas_sexo;
    }

    public Boolean isCenas_drogas() {
        return cenas_drogas;
    }

    public void setCenas_drogas(Boolean cenas_drogas) {
        this.cenas_drogas = cenas_drogas;
    }

    public Novela() {

        titulo = null;
        periodo_duracao = 0;
        data_primeirocap = 0;
        data_segundocap = 0;
        horario_exibicao = 0;
        autor = null;
        emissora = null;
        pontuacao_ibope = 0;
        cenas_sexo = false;
        cenas_drogas = false;
        cenas_violencia = false;

    }

    //TROCAR TIPO DO MÉTODO PARA INT
    public String obterClassificação() {

        String retorno;

        if (cenas_sexo == false && cenas_sexo == false && cenas_violencia == false) {

            retorno = "LIVRE";

        } else if (cenas_violencia == true && cenas_drogas == false && cenas_sexo == false) {

            retorno = "14 ";
        } else if (cenas_drogas == true && cenas_violencia == true && cenas_sexo == true || cenas_sexo == false) {

            retorno = "16";
        } else if (cenas_drogas == true && cenas_violencia == true && cenas_sexo == true) {

            retorno = "18";
        }
        return null;

    }

    public double mediaPessoa() {

        this.pontuacao_ibope = this.pontuacao_ibope / 1000;

        return this.pontuacao_ibope;

    }

//    return retorno;
}
