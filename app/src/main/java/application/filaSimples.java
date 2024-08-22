package application;

public class filaSimples {
    private Integer[] elementos;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public filaSimples(int capacidade) {
        this.capacidade = capacidade;
        elementos = new Integer[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enqueeu(Integer elemento) {
        if(tamanho == capacidade) 
        {
            throw new IllegalStateException(
                "A fila está lotada"
            );
        }
        fim = (fim + 1);
        elementos[fim] = elemento;
        tamanho++;
    }
    // organizar a fila

    public Integer dequeve() {
        if(tamanho == 0)
        {
            throw new IllegalStateException(
                "A fila não tem ninguém"
            );
        }
        int elementoRemovido = elementos[inicio];
        elementos[inicio] = 0;
        inicio++;
        tamanho--;

            return elementoRemovido;
    }
    // desogarnizar a fila
}