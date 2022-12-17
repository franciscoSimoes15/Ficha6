public class Trabalhos {
    String nomeFicheiro;
    int pInicial,pFinal;

    public Trabalhos(String nomeFicheiro, int pInicial, int pFinal) {
        this.nomeFicheiro = nomeFicheiro;
        this.pInicial = pInicial;
        this.pFinal = pFinal;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public void setNomeFicheiro(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public int getpInicial() {
        return pInicial;
    }

    public void setpInicial(int pInicial) {
        this.pInicial = pInicial;
    }

    public int getpFinal() {
        return pFinal;
    }

    public void setpFinal(int pFinal) {
        this.pFinal = pFinal;
    }

    public int getNumPaginas() {
        return pFinal-pInicial;
    }
}
