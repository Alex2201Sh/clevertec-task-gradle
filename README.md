1.Install Gradle

2.Assemble custom jar utils-1.3.5.jar.
It should be compatible with java 8.
The manifest file should contain the name and version of your jar.
The jar should contain class StringUtils with method
boolean isPositiveNumber(String str).
Use Apache Commons Lang 3.10 library to implement this method. Write one any unit test for our StringUtils.isPositiveNumber(String str) using JUnit 5.+.

[completed tasks №1-3](https://github.com/Alex2201Sh/clevertec-task-gradle/tree/master/utils)

3.Create a project multi-project with two subprojects core and api. The core subproject should contain class Utils with method boolean isAllPositiveNumbers(String... str).
Use utils-1.3.5.jar from the previous task to implement this method. The api subproject should contain class App with
the main method.
Call Utils.isAllPositiveNumbers("12", "79") from the main method of api subproject.

[completed task №3](https://github.com/Alex2201Sh/clevertec-task-gradle/tree/master/multi-project)


Дополнительно:
* Сделать gradle плагин, который также опубликовать и подключить к проекту.
//TODO:realize 
* Как пример функциональности плагина - тестирование и формирование отчета.
//TODO:realize


* Перевести тестовое задание на Gradle(если использовали Maven или др.)

[originally made with Gradle](https://github.com/Alex2201Sh/clevertec)