# GWT 2.8.1 JsInterop Sample

A small example on how to use the JsInterop functionality in GWT 2.8.

To compile the project use Maven, also ready to use with IntelliJ.
```
mvn clean package
```

To run Spring Boot to serve the JavaScript files start Spring Boot main class.
```
de.jakobjarosch.test.server.DemoGwtSpringbootApplication
```

To get a live recompile on any source changes use super dev mode.
```
mvn gwt:run-codeserver -P development
```

To try the webapp go here.
```
http://localhost:9015/jsinterop/index.html
```