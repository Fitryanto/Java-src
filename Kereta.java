public class Kereta extends Transportasi {
    public Kereta() {
        ruteBehaviour = new RelKereta();
    }

    public void display() {
        System.out.println("Moda Transportasi: Kereta");
    }

}
