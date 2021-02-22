# EFS-Video

Este projeto teve por objetivo servir de laboratório para o estudo de novas tecnologias, que até então não havia tido contato ou contato superficial. Foi mais um passo no processo de aprendizagem contínua.

O objetivo deste projeto foi o conhecimento e correta execução das tecnologias descritas abaixo e a integração entre elas com a arquitetura de microsserviços. Foi implementada comunicação síncrona e assíncrona entre os microsserviços. O foco foi em suas configurações e corretas execuções. Testes automatizados não foram abordados em nenhum microsserviço. 

Para maiores detalhes e informações sobre a arquitetura e execuções dos microsserviços favor entrar em contato nos canais descritos abaixo.

### Autor

Elisson Francisco da Silva
- email: elissonfs@gmail.com
- cel: (12) 997477873
- linkedIn: https://www.linkedin.com/in/elissonfs/
- github: https://github.com/elissonfs13

## Tecnologias Utilizadas

- Java versão 11
- Spring Boot versão 2.3.6
- Spring Boot Actuator
- Spring Boot Admin versão 2.3.1
- Spring Cloud Netflix: Service Discovery (Eureka Server), Circuit Breaker (Hystrix), Intelligent Routing (Zuul) e Client Side Load Balancing (Ribbon)
- Spring Cloud Open Feign
- Mongo DB: CRUD simples 
- Apache Kafka: String Serializer/Deserializer e Avro Serializer/Deserializer
- Apache Spark: Core e SQL (Join entre arquivos .csv)
- Spring WebFlux: Programação reativa para exibição de vídeos locais
- Spring Batch: Escrita em arquivo .csv em lote
- H2 Database
- Python versão 3: Kafka Consumer e manipulação de arquivos de áudio/vídeo
- Docker e docker-compose
