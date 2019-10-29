<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.maxar.test.it-cloud</groupId>
  <artifactId>java-example-integration-test</artifactId>
  <packaging>jar</packaging>
  <version>0</version>
  <name>java-example-integration-test</name>
  <url>http://maven.apache.org</url>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <scm>
    <developerConnection>scm:git:ssh://github.digitalglobe.com/IT-CLOUD/java-example-integration-test/</developerConnection>
    <tag>0</tag>
  </scm>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-release-plugin</artifactId>
        <version>2.5.3</version>
        <configuration>
          <!--
            During release:perform, enable the "release" profile
           -->
          <releaseProfiles>release</releaseProfiles>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
