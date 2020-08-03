# sample-spring-cloud-contract
Sample Project with Spring Cloud Contract

## SetUp
### Provider
generate test
```
cd spring-cloud-contract-server
mvn clean spring-cloud-contract:generateTests
```

run application
```
cd spring-cloud-contract-server
mvn spring-boot:run
```
### Consumer
```
cd spring-cloud-contract-client
mvn spring-boot:run
```
