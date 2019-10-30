package simple_factory;

import sun.management.snmp.util.SnmpCachedData;

class SimpleFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }
        return null;
    }
}
