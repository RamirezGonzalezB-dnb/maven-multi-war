# Overview

This is a fork of https://github.com/manish-in-java/maven-multi-war to show a bug in IntelliJ IDEA where multi-module
Tomcat run configurations are not deployed correctly.

The project works as follows: Module Y has a Spring controller that is wired to a Spring service in Module X. When
the `/` endpoint is hit, the server should return "Hello".

However, for some reason relating to WAR deployment, this example doesn't work.

## To use

1. Using the included run configuration, create a new Tomcat application server configuration with the home directory set
   to a normal Tomcat/Catalina installation, and the base directory set to the `tomcat` folder of this project
   (which contains a `server.xml`).
2. Build and run using the run configuration (not using the Maven `integration-test` target).
3. Attempt to connect to http://localhost:9077/
4. Notice how instead of getting "Hello", you just get a 404.

# License
This sample application and its associated source code in its entirety is being made
available under the following licensing terms.

    Copyright (C) 2015

    Permission is hereby granted, free of charge, to any person obtaining a copy of
    this software and associated documentation files (the "Software"), to deal in the
    Software without restriction, including without limitation the rights to use, copy,
    modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
    and to permit persons to whom the Software is furnished to do so, subject to the
    following conditions:

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
    INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
    PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
    HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
    CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
    OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
