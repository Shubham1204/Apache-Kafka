# Apache-Kafka

1. Get the Apache kafka
https://www.apache.org/dyn/closer.cgi?path=/kafka/2.8.0/kafka_2.13-2.8.0.tgz


2. Log directory for kafka
Go to the downloaded folder of kakfa and open server.properties.
"D:\Softwares\kafka\kafka_2.13-2.8.0\config\server.properties"


Search for following key to change the logs directory.
log.dirs=D:/Softwares/kafka/kafka-logs


3. Log directory for zookeeper
"D:\Softwares\kafka\kafka_2.13-2.8.0\config\zookeeper.properties"
dataDir="D:/Softwares/kafka/zookerper-logs


3. Invoke the instance of zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties


4. Invoke the instance of kafka
.\bin\windows\kafka-server-start.bat .\config\server.properties


5. Create topic (can have name of your choice)


.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic chatbot
