package simple_factory;

class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("This is SmsSender");
    }
}
