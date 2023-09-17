## Create an maven project
```cmd
mvn archetype:generate
```
press [Enter] for selecting the quickstart

In the project
add this to pom.xml for running maven in cmd

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.0.0</version>
            <executions>
                <execution>
                    <goals>
                        <goal>java</goal>
                    </goals>
                </execution>
            </executions>
            <configuration>
                 <mainClass>tdtu.java.lab01.App</mainClass> <!--  package name and Class Name  -->
            </configuration>
        </plugin>
    </plugins>
</build>
```
Compile to Target 
```cmd
mvn compile exec:java -D"exec.mainClass"="tdtu.java.lab01"
```
Run the target
```cmd
mvn exec:java -D"exec.mainClass"="java.tdtu.java.lab01"
```
Some docs write as -Dexec.main.Class