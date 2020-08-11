package com.atguigu.activemq.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @Classname JmsProduce
 * @Description TODO
 * @Date 2020/6/3 8:42
 * @Created by Administrator
 */
public class JmsProduce {

    public static final String ACTIVEMQ_URL = "tcp://192.168.1.9:61616";
    public static final String QUEUE_NAME = "jdbc01";

    public static void main(String[] args) throws JMSException {
        //1、创建连接工厂，按照给定的url地址，采用默认用户名和密码
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        //2、通过工厂连接，获得链接connection,并启动访问
        Connection connection = activeMQConnectionFactory.createConnection();
        connection.start();
        //3、创建会话session
        //两个参数，第一个事务，第二个签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //4、创建目的地destination(具体是队列还是topic)
        Queue queue = session.createQueue(QUEUE_NAME);
        //5、创建消息生产者
        MessageProducer messageProducer = session.createProducer(queue);
        messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);
        //6、通过使用消息生产者messageproducer生产3条消息发送到MQ的队列里面
        for (int i = 1; i <= 3; i++) {
            //7、创建消息
            TextMessage textMessage = session.createTextMessage("messageListener--" + i);//字符串
            //8、通过messageproducer发送给mq
            messageProducer.send(textMessage);
        }
        //9、关闭资源
        messageProducer.close();
        connection.close();

        System.out.println("*****消息发布到MQ完成*****");
    }
}
