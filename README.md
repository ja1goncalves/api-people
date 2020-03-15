# API PEOPLE

## Description
This project were build in SO Linux Ubuntu 18.04 with JAVA 11, Spring Boot 2.5 Framework and MongoDB 4.

## Getting Started

### Install Java 11

```
sudo apt update
sudo apt install default-jre
sudo apt install default-jdk
sudo apt install openjdk-11-jdk
sudo apt install openjdk-11-jre
sudo nano /etc/environment
```
Write in file:
``JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/bin/"``

Finish with:
```
echo $JAVA_HOME
```

### Install MongoDB

```
sudo apt update
sudo apt install -y mongodb
sudo systemctl status mongodb
```
The configuration of database are in ``src/main/resources/application.properties`` with two possibilities, one server on-line and other in localhost.

## Run Application
Run file ``src/main/java/com/people/apipeople/ApiRestPeopleApplication.java``.

## Application Routes
After run application, access in ``http://localhost:8080/swagger-ui.html`` for see the application routes, models and others details.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/maven-plugin/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-security)
* [Spring Data Reactive MongoDB](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
