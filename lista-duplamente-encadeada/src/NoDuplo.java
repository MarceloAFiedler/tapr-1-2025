public class NoDuplo {
    private NoDuplo anterior;
    private NoDuplo proximo;
    private int valor;

    public NoDuplo(NoDuplo anterior, int valor) {
        this.anterior = anterior;
        this.valor = valor;
        this.proximo = null;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Verifica se o nó tem próximo
    public boolean temProximo() {
        return proximo != null;
    }
}
