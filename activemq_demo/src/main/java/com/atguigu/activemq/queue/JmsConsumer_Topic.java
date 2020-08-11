package com.atguigu.activemq.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * @Classname JmsConsumer
 * @Description TODO
 * @Date 2020/6/3 14:18
 * @Created by Administrator
 */
public class JmsConsumer_Topic {

    public static final String ACTIVEMQ_URL = "tcp://192.168.1.9:61616";
    public static final String TOPIC_NAME = "topic-atguigu";

    public static void main(String[] args) throws JMSException, IOException {

        System.out.println("这里是3号消费者");
        //1、船舰连接工厂，按照给定的url地址，采用默认用户名和密码
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        //2、通过连接工厂，获得连接connection并启动访问
        Connection connection = activeMQConnectionFactory.createConnection();
        connection.start();
        //3、创建会话session
        //两个参数，第一个叫事务第二个叫签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //4、创建目的地（具体是队列还是主题topic）
        Topic topic = session.createTopic(TOPIC_NAME);
        //5、创建消费者
        MessageConsumer messageConsumer = session.createConsumer(topic);

        messageConsumer.setMessageListener((message) -> {
            if (null != message && message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                try {
                    System.out.println("*****消费者接收到Topic消息*****:" + textMessage.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
        System.in.read();
        messageConsumer.close();
        session.close();
        connection.close();

    }
}
