package dummy;

public class Sender {
    Transmitter transmitter;

    public Sender(Transmitter transmitter) {
        this.transmitter = transmitter;
    }

    public void sum(int a, int b) {
        transmitter.data(a + b);
    }
}
