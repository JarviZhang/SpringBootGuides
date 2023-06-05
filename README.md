# SpringBootGuides
this is a repository to complete [Guides in Spring's official website](https://spring.io/guides#gettingStarted)

## [RestfulWebService](https://spring.io/guides/gs/rest-service/)

complete a simple RESTful web service by SpringBoot

[project code](RESTfulWebService/projectCode)

### Test

send http request
```http request
localhost:8080/greeting
```
return 
```json
{"id": 1, "content": "Hello, World!"}
```
send http request
```http request
localhost:8080/greeting?name=User
```
return 
```json
{"id":2,"content":"Hello, User!"}
```

## Consuming a RESTful Web Service
this guide is about how to consuming a RESTful Web Service

Spring provides a template class called `RestTemplet` that can consume a RESTful Web Service

**there are two modules in this guide**

the first module is called [quotes](RESTfulWebService/quoters)

this module is a simple SpringBoot project that can return quotes

there are three valid addresses
1. 
```http request
http://localhost:8080/api/random
```
randomly return a quotation
2.
```http request
http://localhost:8080/api
```
return all quotations
3.
```http request
http://localhost:8080/api/1
```
return the first quotation

the second module is called [projectCode2](RESTfulWebService/projectCode2)

this module uses `RestTemplet` to get a random quotation



