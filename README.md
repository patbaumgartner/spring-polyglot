# Welcome to _Spring Polyglot_

[![CI](https://github.com/patbaumgartner/spring-polyglot/actions/workflows/ci.yml/badge.svg)](https://github.com/patbaumgartner/spring-polyglot/actions/workflows/ci.yml)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.6-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Spring Framework](https://img.shields.io/badge/Spring%20Framework-7.0.7-brightgreen.svg)](https://spring.io/projects/spring-framework)
[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://adoptium.net/)

This repository is a collection of "just for fun" _composed annotations_
for use with the [Spring Framework][].

The goal of this project is to demonstrate the power of _composed annotations_
and the use of `@AliasFor` for overriding attributes in meta-annotations by
_translating_ common Spring annotations into different languages. In this
context, the term _polyglot_ therefore refers to spoken languages, not
programming languages.

And who knows...? Perhaps some of these translated annotations will someday
make it into the Spring Framework.

----

# Languages Represented

The following languages currently have one or more translated annotations
that have been submitted to this project.

- German: see [DeutscheIntegrationsTests][]
- Hipster: see [HipsterTests][]
- Japanese: see [JapaneseIntegrationTests][] and [SushiTests][]
- Polish: see [PolskieTestyIntegracijne][]

----

# Examples

## German

For example, the following is what an integration test in Spring can look
like when `@ContextConfiguration` is translated into German. Yes, this
test actually runs: see [DeutscheIntegrationsTests][] for details.

```java
@Kontextkonfiguration(
 Konfigurationsklassen = { LokaleTestkonfiguration.class },
 XmlDateienOderGroovySkripte = { /* keine */ },
 RessourcenErben = falsch,
 Initialisierungsprogramme = { /* keine */ },
 InitialisierungsprogrammeErben = falsch,
 Ladeprogramm = AnnotationConfigContextLoader.class,
 Name = "In diesem Fall spielt der Name keine Rolle."
)
public final class DeutscheIntegrationsTests {

 @AutomatischVerdrahtet(erforderlich = jawohl)
 private String Nachricht;

 @Test
 public void nachrichtPrüfen() {
  esWirdErwartetDass(Nachricht, istGleich("Alles in Ordnung"));
 }

 @Konfiguration
 static class LokaleTestkonfiguration {

  @Bohne
  String Nachricht() {
   return "Alles in Ordnung";
  }
 }

}
```

## Hipster

Yes, this test actually runs: see [HipsterTests][] for details.

```java
@ExtendWith(SpringExtension.class)
@Konfigz(klassez = Konfig.class, listenToYoParents = false, whoDat = "Not I said the fly")
public class HipsterTests {

 @Autowired
 String message;

 @Test
 public void checkItOut() {
  assertEquals("Keepin' it real!", message);
 }

}
```

----

# Contributing

Feel free to contribute your own translated annotations by submitting
[pull requests][] to this repository.

## Contributor License Agreement

Although the `spring-polyglot` project is currently just for demonstration purposes,
there is a slight chance that annotations from this project will eventually be
incorporated into official Spring projects. In order to have your pull requests
accepted, we therefore ask that you sign the [Contributor License Agreement][] and
document that you have done so in the commit message or comments of your pull request.

## License

The Spring Polyglot project is released under version 2.0 of the [Apache License][].

# See Also

- [Spring Annotation Programming Model][]: official wiki page from the Spring team
- [Spring Composed][]: a collection of "serious" _composed annotations_
for use with the [Spring Framework][]

----

# Building from Source

Spring Polyglot uses a [Gradle][]-based build system. In the instructions
below, `./gradlew` is invoked from the root of the project and serves as
a cross-platform, self-contained bootstrap mechanism for the build.

## Prerequisites

- [Git][]
- [JDK 17][JDK17] or later
- [Spring Framework][] 7.x (managed by Spring Boot 4.x)

Annotations in the `spring-polyglot` project rely on `@AliasFor`, which has
been part of the Spring Framework since 4.2. The current build targets
Spring Framework 7 and Spring Boot 4 and requires JDK 17+.

Make sure that your `JAVA_HOME` environment variable points to a JDK 17 (or
newer) installation.

## Compile and Test

Build all artifacts and run all tests:

```bash
./gradlew build
```

Run only the tests:

```bash
./gradlew test
```

## Publish to local Maven repository

```bash
./gradlew publishToMavenLocal
```

----

[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
[Gradle]: https://gradle.org
[Git]: https://help.github.com/set-up-git-redirect
[JDK17]: https://adoptium.net/
[Spring Framework]: https://spring.io/projects/spring-framework
[Spring Annotation Programming Model]: https://github.com/spring-projects/spring-framework/wiki/Spring-Annotation-Programming-Model
[Spring Composed]: https://github.com/sbrannen/spring-composed
[pull requests]: https://help.github.com/send-pull-requests
[Contributor License Agreement]: https://github.com/spring-projects/spring-framework/blob/main/CONTRIBUTING.md#sign-the-contributor-license-agreement

[HipsterTests]: src/test/java/org/springframework/polyglot/hipster/HipsterTests.java
[DeutscheIntegrationsTests]: src/test/java/org/springframework/polyglot/de/DeutscheIntegrationsTests.java
[JapaneseIntegrationTests]: src/test/java/org/springframework/polyglot/ja/JapaneseIntegrationTests.java
[SushiTests]: src/test/java/org/springframework/polyglot/ja/SushiTests.java
[PolskieTestyIntegracijne]: src/test/java/org/springframework/polyglot/pl/PolskieTestyIntegracijne.java
