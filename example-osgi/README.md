## Temporary notes

- There are plenty of OSGi platforms
- Installed Apache Karaf which is a runner that sits on top of Apache Felix (OSS version of OSGi)
  - Downloaded the latest Karaf Runtime as `.tar.gz` (`.zip` only works for Windows)
  - https://karaf.apache.org/download.html 
  - Decompressed and then ran `bin/karaf` or `bin/karaf clean` to start it up
    - `clean` also removes the `data/` directory
- `mvn clean install -DskipTests` in `example-osgi` module to build and install the project within the local Maven repository
- `mvn clean package -DskipTests` in `example-osgi` module to build the package locally and check the `META-INF/MANIFEST.MF` file within the JAR package `target/example-osgi-3.9.0.jar`
- From the Karaf CLI, after running the previous `mvn clean install`, we can install the bundle with:
  - `bundle:install mvn:com.algolia/example-osgi/3.9.0`
  - `bundle:list` / `bundle:list` / `bundle:uninstall` are useful commands

## Blocked
- `bundle:install` works
- `bundle:start` does not work

## References

- https://github.com/algolia/algoliasearch-client-java-2/pull/697/files
- https://karaf.apache.org/manual/latest/#_directory_structure
- https://michaelrice.com/2015/04/the-simplest-osgi-karaf-hello-world-demo-i-could-come-up-with/
- https://www.baeldung.com/osgi
- https://stackoverflow.com/questions/8352710/osgi-missing-requirement-error
- https://github.com/Dynatrace/Dynatrace-AppMon-Server-REST-Java-SDK/issues/1