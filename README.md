# Mawen Wrapper

Install maven wrapper:

```console
mvn -N io.takari:maven:wrapper -Dmaven=3.6.3
```
The option -N means –non-recursive so that the wrapper will only be applied to the main project of the current directory, not in any submodules.

The option -Dmaven specify maven version