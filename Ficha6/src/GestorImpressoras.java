import java.util.*;

public class GestorImpressoras {
    Map<String,Impressora> mapaImpressoras;

    PriorityQueue<Impressora> pqt = new PriorityQueue<>(new Comparator<Impressora>() {
        @Override
        public int compare(Impressora o1, Impressora o2) {
            if(o1.getNTrabalhos() - o2.getNTrabalhos()==0)
                return o1.proximoTrabalho().getNumPaginas()-o2.proximoTrabalho().getNumPaginas();

            return o1.getNTrabalhos() - o2.getNTrabalhos();
        }
    });
    public GestorImpressoras() {
        this.mapaImpressoras = new HashMap<>();
    }

    public Set<String> getNomesImpressoras(){
        return mapaImpressoras.keySet();
    }

    public void acrescentaImpressora(Impressora i){
        if(i!=null)
            mapaImpressoras.put(i.getNome(),i);
    }

    public void removeImpressora(String nome){
        if(nome!=null)
            mapaImpressoras.remove(nome);
    }

    public void enviaTrabalho(String i,Trabalhos t){
        mapaImpressoras.get(i).adicionaTrabalho(t);
    }
    public void imprimeTrabalho(Trabalhos t){
        pqt.poll().adicionaTrabalho(t);
    }
    public boolean existeImpressora(String nome){
        if(nome != null)
            return mapaImpressoras.containsKey(nome);

        return false;
    }

}
