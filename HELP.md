# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.5/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.3.5/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.3.5/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

### Technology References

[Spring Boot](https://spring.io/projects/spring-boot)
https://www.youtube.com/watch?v=zTAHY0SLQAg&list=PLBBog2r6uMCRzaJqr-uUC8gakwSxkPSBh&index=2
Spring Boot is an open-source Java framework that helps developers create web applications and microservices faster and easier.

The following are the key features of Spring Boot,
    * Dependency Injection
    * Auto Configuration - Web Controller - @Controller, Web Services - @RestController, @RequestMapping; Hibernate(ORM) -  @Table, @Column
    * Embedded Tomcat server (Applications can be hosted on it)
    * Easy creation of REST API (end points) - @RestController and @RequestMapping(/endPoint)
    * Microservice Based Architecture

[SQL](https://www.w3schools.com/sql/sql_intro.asp)
https://www.w3schools.com/sql/sql_syntax.asp
https://www.programiz.com/sql/online-compiler/

[Thymeleaf](https://www.thymeleaf.org/index.html)
Thymeleaf is a modern server-side Java template engine for both web and standalone environments.

[Boot Strap](https://getbootstrap.com/docs/5.3/getting-started/introduction/)
Bootstrap is a powerful, feature-packed frontend toolkit to get production ready HTML templates

[Font Awesome](https://fontawesome.com/)
Font Awesome is an icon/image library toolkit to download awesome icons/images

