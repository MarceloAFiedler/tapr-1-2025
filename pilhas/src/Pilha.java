public class Pilha {
    private int[] pilha;
    private int topo;
    private int tamanho;

    public Pilha(int tamanho){
        this.tamanho = tamanho;
        pilha = new int[tamanho];
        topo = -1;
    }

    public boolean isFull(){
        return topo == tamanho - 1;
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public void push(int elemento){
        if(isFull()){
            System.out.println("Pilha cheia!" + elemento);
        } else {
            pilha[++topo] = elemento;
            System.out.println("Elemento " + elemento + " entrou na pilha");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Pilha ta vazia");
            return -1;
        } else {
            int elementoRemovido = pilha [topo--];
            return elementoRemovido;
        }
    }

    public int top(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            return pilha[topo];
        }
    }
}
