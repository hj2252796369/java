package static_factory;

/**
 * 静态工厂模式
 */
public class Test  {
    public static void main(String[] args) {
        Sender sender = StaticFactory.getMailSender();
        sender.sender();
    }
}
