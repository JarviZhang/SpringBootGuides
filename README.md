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







