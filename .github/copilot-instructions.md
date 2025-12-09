# Copilot Instructions for JAVANEW

## Project Overview

This is a minimal Java project containing a single entry point (`HelloWorld.java`) that demonstrates basic Java compilation and execution. The project uses Maven-style directory structure (`src/main/java/`) but currently has no build configuration files.

## Directory Structure

- `src/main/java/` - Java source files
  - `HelloWorld.java` - Single entry point demonstrating basic Java functionality

## Building and Running

### Compilation
```bash
javac src/main/java/HelloWorld.java
```

### Execution
```bash
java -cp src/main/java HelloWorld
```

**Current State:** No Maven/Gradle setup. Compilation is manual using `javac`. When expanding the project, consider adding Maven (`pom.xml`) or Gradle (`build.gradle`) for dependency management and automated builds.

## Key Conventions

1. **Class Structure**: Currently follows a simple pattern with a `main` method as entry point
2. **Java Version**: Output displays Java version and vendor - future code should maintain compatibility awareness
3. **Package Structure**: Currently using default package; future classes should use proper package naming (e.g., `com.example.*`)

## Before Adding Features

- If adding dependencies: Set up Maven or Gradle build configuration
- If adding multiple classes: Organize under appropriate packages (not default package)
- If adding tests: Create `src/test/java/` directory and use JUnit
- If collaborating: Consider adding `.gitignore` to exclude compiled classes and build artifacts

## When Expanding This Project

Reference the Maven-style layout: `src/main/java/` for source, `src/test/java/` for tests, and create a `pom.xml` or `build.gradle` at the root when dependencies are needed.
