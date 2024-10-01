# RabbitQM
I am following this [video tutorial](https://www.youtube.com/watch?v=TvxhuAUJGUg&list=PLGRDMO4rOGcMh2fAMOnwuBMDa8PxiKWoN&ab_channel=JavaGuides).

We will go thorough: 
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






## Experiment 1: Installation
