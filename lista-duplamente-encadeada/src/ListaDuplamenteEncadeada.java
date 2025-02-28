public class ListaDuplamenteEncadeada {

    private NoDuplo cabeca;
    private NoDuplo rabo;

    public ListaDuplamenteEncadeada() {
        cabeca = null;
        rabo = null;
    }

    public void adicionar(int valor) {
        NoDuplo novoNo = new NoDuplo(null, valor); // Cria o novo nó

        if (cabeca == null) {  // Lista está vazia
            cabeca = novoNo;
            rabo = cabeca;  // O "rabo" também será o primeiro nó
        } else {
            rabo.setProximo(novoNo);  // O antigo "rabo" aponta para o novo nó
            novoNo.setAnterior(rabo);  // O novo nó aponta para o antigo "rabo"
            rabo = novoNo;  // Agora o "rabo" é o novo nó
        }
    }

    public void print() {
        NoDuplo noDuplo = cabeca;
        while (noDuplo != null) {
            System.out.println(noDuplo.getValor());
            noDuplo = noDuplo.getProximo();
        }
    }
    public void printReverse(){
        NoDuplo noDuplo = rabo;
        while(noDuplo != null){
            System.out.println(noDuplo.getValor());
            noDuplo = noDuplo.getAnterior();
        }
    }
}
