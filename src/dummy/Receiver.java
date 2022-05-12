package dummy;

public class Receiver{
    static Transmitter transmitter = new Transmitter() {
        @Override
        public void data(int a) {
            System.out.println(a);
        }

    };

    public static void  main(String[] args) {

        Sender sender = new Sender(transmitter);
        sender.sum(10, 15);
        BlocksTest blocksTest = new BlocksTest();

        /*
          //Other way of using interface
               Sender s = new Sender(new Transmitter() {
            @Override
            public void data(int a) {

            }

            @Override
            public boolean isReceived(boolean b) {
                return false;
            }
        });

          */


    }


}
