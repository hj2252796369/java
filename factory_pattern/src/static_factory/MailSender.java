package static_factory;

class MailSender implements Sender {
   @Override
   public void sender() {
       System.out.println("This is MailSender");
   }
}
