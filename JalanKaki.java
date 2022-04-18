public class JalanKaki extends Transportasi {
    public JalanKaki() {
        ruteBehaviour = new JlnKecil();
    }

    @Override
    public void display() {
        System.out.println("Moda Transportasi: Jalan Kaki");
    }
}
