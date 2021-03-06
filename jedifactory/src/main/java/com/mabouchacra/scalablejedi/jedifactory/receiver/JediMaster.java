package com.mabouchacra.scalablejedi.jedifactory.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by marc on 19/04/17.
 */
@Component
public class JediMaster {

    @RabbitListener(queues = {"jedi-queue"}, containerFactory = "myRabbitListenerContainerFactory")
    public void defend(String message) throws InterruptedException {

        System.out.println("Message received : " + message);

        Thread.currentThread().join(2000);
    }
}
