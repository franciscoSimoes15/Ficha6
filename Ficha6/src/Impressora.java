import java.util.Comparator;
import java.util.PriorityQueue;

public class Impressora {
    String nome,porto,marca,modelo,driver,versao;

    PriorityQueue<Trabalhos> pqt = new PriorityQueue<>(new Comparator<Trabalhos>() {
        @Override
        public int compare(Trabalhos o1, Trabalhos o2) {
            return o1.getNumPaginas() - o2.getNumPaginas();
        }
    });

    public Impressora(String nome, String porto, String marca, String modelo, String driver, String versao) {
        this.nome = nome;
        this.porto = porto;
        this.marca = marca;
        this.modelo = modelo;
        this.driver = driver;
        this.versao = versao;
    }
    public int getNTrabalhos(){
        return pqt.size();
    }
    public boolean temProximoTrabalho(){
        return !pqt.isEmpty();
    }
    public Trabalhos proximoTrabalho(){
        return pqt.poll(); // pega próximo e remove, element() pega próximo mas não remove
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorto() {
        return porto;
    }

    public void setPorto(String porto) {
        this.porto = porto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionaTrabalho(Trabalhos t) {
        if (t!=null)
            return pqt.add(t);
        return false;
    }
}
