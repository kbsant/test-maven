= Usage =

Generate structure using maven:

    mvn archetype:generate -DgroupId=com.ashikasoft -DartifactId=test-maven -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

Build an uberjar:

    mvn clean compile assembly:single
