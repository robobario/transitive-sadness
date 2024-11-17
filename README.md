checking odd troubles that come with marking a transitive compile dependency as a `test` scoped dependency

- project-c depends on guava at compile
- project-b depends on project-c at compile and guava at test, has a class OtherStringUtil with a main calling a method in project-c that uses guava
- project-a depends on project-b at compile, has a class UseIt with a main method calling a method in project-b that calls to a method in project-c that uses guava

The oddity:
- project-a ends up with a compile dependency on guava transitively, `mvn exec:java -Dexec.mainClass=UseIt -pl :project-a` succeeds
- project-b does not have guava available at runtime, `mvn exec:java -Dexec.mainClass=OtherStringUtil -pl :project-b` fails with a ClassNotFound (fails in IDE too)

In our project the assembly plugin on project-b does include guava.
