# RabbitQM
I am following this [video tutorial](https://www.youtube.com/watch?v=TvxhuAUJGUg&list=PLGRDMO4rOGcMh2fAMOnwuBMDa8PxiKWoN&ab_channel=JavaGuides)
by Java Guides on [YouTube](https://www.youtube.com/).
---
The toturial will go thorough: 
1. **Core concepts of RabbitMQ**, such as 
   - Producer
   - Consumer
   - Queue
   - Exchange
   - Binding
   - Routing Key
   - Message


2. **RabbitMQ architecture**:
   
    `Producer >> Message >> RabbitMQ Message Broker >> Message >> Consumer`

    Here the producer send a message to the RabbitMQ Message Broker who in turn send a message to the Consumer.


3. **How to integrate RabbitMQ in a SpringBoot project**, using the Spring AMQP (Advanced Message Queuing Protocol) library. 
RabbitMQ uses Spring AMQP for messaging protocols.
4. **How to connect a springboot application to a RabbitMQ server**. 
5. **How to configure all the RabbitMQ components in a SpringBoot application.** 
6. **How to use a message (of type string) for communication between the producer and consumer** using RabbitMQ Broker in a 
SpringBoot application. 
7. **How to use a message (of type JSON) for communication between the producer and consumer** using RabbitMQ Broker in a 
SpringBoot project.
8. **How to create a multiple queue in a RabbitMQ architecture** and also create multiple consumers who'll subscribe to 
multiple queues.

### What is Message Queuing?
Message queuing allows applications to communicate by sending messages to each other. The message queue provides 
temporary message storage when the destination program is busy or not connected. A message queue if made up of a 
producer, a broker, and a consumer. A message queue provides an asynchronous communication between applications. Both 
a producer and a consumer can be different applications. 

### What is RabbitMQ?
RabbitMQ is a message queue software (message broker/queue manager) that acts as an intermediary platform where 
different applications can send and receive messages. RabbitMQ originally implemented the Advanced Message Queuing 
Protocol (AMQP), but now it also supports several other API protocols such as STOMP, MQTT, and HTTP. 

The producer is an application that sends messages to the RabbitMQ broker and Consumer is an application that reads 
messages from the RabbitMQ broker.

> Use of RabbitMQ in Microservices
> 
> RabbitMQ is one of the simplest freely available options for implementing messaging queues in microservice architecture. 

### Core Concepts 
`Producer` - The producer is an application that sends messages. It does not send messages directly to the consumer, 
but only to the RabbitMQ broker.

`Consumer` - The consumer is an application that reads messages from the RabbitMQ Broker

`Queue` -   The queue is a buffer/storage in a RabbitMQ broker that stores messages. The messages are put into a queue by 
            a producer and read from it by a consumer. Once a message is read, it is consumed and removed from the queue. A message 
            can thus only be processes once.

`Message` - Information that is sent from the producer to a consumer through RabbitMQ.

`Exchange` - Acts as an intermediary between the producer and a queue. Instead of sending messages directly to a queue, 
             a producer can send them to an exchange instead. The exchanges then sends the messages to one or more 
             queues following a specified set of rules. The producer do not need to know the queues that eventually 
             receive those messages. 

`Routing Key` - The routing key is a key that the exchanges look at to decide how to route the message to queues, like 
                an address for the messages.

`Binding` - A binding is a link between a queue and an exchange.


## Experiment 1: Installation
