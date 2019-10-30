package simple_factory;

/**
 * 普通工厂模式
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Sender s = simpleFactory.produce("sms");
        s.sender();
    }
}
