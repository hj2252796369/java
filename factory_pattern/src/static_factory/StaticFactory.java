package static_factory;

class StaticFactory {

    public static Sender getMailSender(){
        return new MailSender();
    }
    public static Sender getSmsSender(){
        return new SmsSender();
    }
}
