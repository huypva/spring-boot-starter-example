The example project for StringBoot service

<div align="center">
    <img src="./assets/images/spring_boot_icon.png"/>
</div>

## Getting Started

## Project structure
```
.
├── spring-boot-starter
│   ├── src/main/resources/META-INF
|   |   ├── spring.factories
|   ├── pom.xml
|   
├── spring-boot-sample
|   ├── src/main/resources
|   |   ├── application.yml
|   ├── pom.xml
|
└── README.md
```

## Build & install project

```shell script
$ ./mvnw clean install
...
```

### Start sample project

```shell script
$ cd spring-boot-sample
$ ../mvnw spring-boot:run
```

Log start
```text
2021-10-26 11:03:54.852  INFO 4789 --- [           main] i.c.springbootstarter.Application        : No active profile set, falling back to default profiles: default
2021-10-26 11:03:55.185  INFO 4789 --- [           main] i.c.springbootstarter.Application        : Started Application in 0.58 seconds (JVM running for 0.839)
Do sample: Sample Value

```

## Contribute

## Reference
