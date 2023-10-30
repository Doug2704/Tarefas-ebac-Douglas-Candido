public class Carro<T> {
    private T marca;

    public Carro(T marca) {
        this.marca = marca;
    }

    public T getMarca() {
        return marca;
    }

    public void setMarca(T marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro da marca: " + marca;
    }
}
