# spring-boot-rpf-ms
## experience-svc

- [x] set experience-svc to root's pom.xml module.
- [x] expose all actuator endpoints.
- [x] [generate build informations](https://docs.spring.io/spring-boot/how-to/build.html)
  - [x] delete target folder, package the microservice and rerun the application for changes. ``http:localhost:8081/actuator/info``
- [x] set configuration properties only for the fields we required in git.properties