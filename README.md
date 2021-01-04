# micronaut-101

The main goal of this project is to compare Spring Boot v/s Micronaut.

### Parameters to test on

- [Start-up time](#start-up-time)
- Development effort
- Learning curve
- Ecosystem

#### Start-up time

1. Running the Hello World application
   
   `mvn -Pcentral clean package spring-boot:run`
   
   `mvn -Pcentral clean package mn:run`

Spring Boot (with Tomcat) | Spring Boot (with Jetty) | Spring Boot (with Undertow) | Micronaut (Netty)
| :---: | :---: | :---: | :---: |
1.384s | 1.235 s | 1.304 s | 799ms
1.198 s | 2.257 s | 1.344 s | 892ms
1.181 s | 1.409 s | 1.432 s | 763ms
1.197 s | 1.306 s | 1.36 s | 754ms
1.186 s | 1.241 s | 1.385 s | 852ms


### Should we use?

??

### References

1. https://micronaut.io/blog/2020-04-28-performance-comparison-spring-boot-micronaut.html
2. https://reinkrul.nl/blog/springboot/micronaut/2019/05/30/migrating-springboot-to-micronaut-is-it-worth-it.html

