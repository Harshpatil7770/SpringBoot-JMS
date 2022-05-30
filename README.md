# SpringBoot-JMS
#### ActiveMQ - If you want to use just you need to add the two dependencies 1) activemq-broker 2) Spring Boot Starter ActiveMQ 
              Inside the application.properties file write the connection such as
              spring.activemq.broker-url=tcp://localhost:61616
              spring.activemq.user=admin
              spring.activemq.password=admin
              
              +++ url = localhost:8161/admin/queues.jsp
              
              +++ For sending 
              @JmsTemplate 
              
              +++ For Listening
              @Component == class level
              @JmsListener(destination="queue_name")
