# spring-boot-rpf-ms
## experience-svc

- [x] set experience-svc to root's pom.xml module.

### 1. Add got-commit-id-maven-plugin
- [x] expose all actuator endpoints.
- [x] [generate build informations](https://docs.spring.io/spring-boot/how-to/build.html)
  - [x] delete target folder, package the microservice and rerun the application for changes. ``http:localhost:8081/actuator/info``
- [x] set configuration properties only for the fields we required in git.properties

### 2. Add [springdoc.openapi](https://springdoc.org/)
- [x] add dependency into pom.xml ``http://localhost:8081/swagger-ui/index.html``

### 3. Add [rest-assured](https://github.com/rest-assured/rest-assured/wiki/GettingStarted#maven--gradle-users)
- [x] add dependency into pom.xml 

### 4. Add [spotless-maven-plugin](https://github.com/diffplug/spotless/blob/main/plugin-maven/README.md#maven-pom)
- [x] add dependency into pom.xml 
  - package the service ``./mvnw clean package``
  - when formatting error is found ``./mvnw spotless:apply``

### 5. Add docker-compose file
- [x] add /deployment/docker-compose/infra.yml

### 6. update application.properties
- [x] add datasource configuration

### 7. add [github workflow actions](https://docs.github.com/en/actions/writing-workflows/workflow-syntax-for-github-actions)
- [x] added .github/workflows/experience-svc.yml

### 8. add [Taskfile.yml file](https://taskfile.dev/)
- [x] added Taskfile.yml to automatic frequently used commands.

| Task Name     | What it does                                      |
|:--------------|:--------------------------------------------------|
| default       | Runs `task test`                                  |
| test          | Depends on `format`, then runs `mvn clean verify` |
| format        | Runs `spotless:apply` (code formatter)            |
| build         | Runs `mvn verify`                                 |
| start_infra   | `docker compose up -d` with your infra file       |
| stop_infra    | Stops and removes your infra                      |
| restart_infra | Stops, sleeps, then starts infra again            |
| sleep         | Waits for a duration (default 5s)                 |

