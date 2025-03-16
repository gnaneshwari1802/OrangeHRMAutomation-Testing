# OrangeHRM
Author: Dalbert Onyebuchi

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.

### Maven Cheat codes
    https://www.digitalocean.com/community/tutorials/maven-commands-options-cheat-sheet

###  1. Clean the files and directories generated by Maven during its build
    # The Maven Clean Plugin, as the name implies, attempts to clean the files and directories generated by Maven during its build. 
    # While there are plugins that generate additional files, the Clean Plugin assumes that these files are generated inside the target directory.
```mvn clean ```
```mvn clean package```

    The `mvn build` command is commonly used in Apache Maven, a popular build automation and dependency management tool for Java projects. 
    When you run `mvn build`, it triggers the default build lifecycle of Maven, which consists of a series of phases and goals. 
    During the build process, Maven reads the project's configuration file (`pom.xml`) and performs various tasks such as compiling source code, 
    running tests, packaging the application, and managing dependencies. 
    These tasks are organized into different phases, such as `compile`, `test`, `package`, `install`, and `deploy`, among others.
    The `mvn build` command typically executes all the phases in the default lifecycle up to the `package` phase. 
    This means that Maven compiles the source code, runs unit tests, and packages the application into a distributable format (such as a JAR or WAR file). 
    However, it does not install or deploy the packaged artifact.
    By default, Maven uses the `pom.xml` file in the current directory to determine the project's configuration and dependencies. 
    It relies on convention over configuration, meaning that it follows a predefined project structure and naming conventions to simplify the build process.
    It's important to note that `mvn build` is not the exact syntax of the command. 
    The correct Maven command is `mvn clean package` to clean the previous build artifacts and then execute the build process up to the `package` phase.

### 2. Compile all plugins in your pom.xml file
```mvn compile ```

### 3. To run tests.
```mvn test ```

    # Run all the unit test classes.
    $ mvn test

    # Run a single test class.
    $ mvn -Dtest=TestApp1 test

    # Run multiple test classes.
    $ mvn -Dtest=TestApp1,TestApp2 test
    
    # Run a single test method from a test class.
    $ mvn -Dtest=TestApp1#methodname test
    
    # Run all test methods that match pattern 'testHello*' from a test class.
    $ mvn -Dtest=TestApp1#testHello* test
    
    # Run all test methods match pattern 'testHello*' and 'testMagic*' from a test class.
    $ mvn -Dtest=TestApp1#testHello*+testMagic* test

<img width="40%" alt='OrangeHRM' src='https://raw.githubusercontent.com/wiki/orangehrm/orangehrm/logos/logo.svg#gh-light-mode-only'/><img width="40%" alt='OrangeHRM' src='https://raw.githubusercontent.com/wiki/orangehrm/orangehrm/logos/logo_dark_mode.svg#gh-dark-mode-only'/>

[![Docker Pulls](https://img.shields.io/docker/pulls/orangehrm/orangehrm.svg)](https://hub.docker.com/r/orangehrm/orangehrm) [![SourceForge Downloads](https://img.shields.io/sourceforge/dm/orangehrm.svg)](https://sourceforge.net/projects/orangehrm/) [![SourceForge Downloads](https://img.shields.io/sourceforge/dt/orangehrm.svg)](https://sourceforge.net/projects/orangehrm/)

# OrangeHRM Starter Application

OrangeHRM is a comprehensive Human Resource Management (HRM) System that captures all the essential functionalities required for any enterprise. Copyright (C) 2006 OrangeHRM Inc., http://www.orangehrm.com/

OrangeHRM is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.

OrangeHRM is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

## Getting started

- Download the latest version of OrangeHRM Starter [here](https://sourceforge.net/projects/orangehrm/files/latest/download).

- Prerequisites and environment set up for installing OrangeHRM Starter:
  - [Install on Linux](https://starterhelp.orangehrm.com/hc/en-us/articles/6187572000540-Prerequisites-for-installing-OrangeHRM-Starter-in-Linux)
  - [Install on Windows](https://starterhelp.orangehrm.com/hc/en-us/articles/6187576427804-Prerequisites-for-installing-OrangeHRM-Starter-in-Windows)

- Install OrangeHRM using the web installer:
  - [OrangeHRM Starter Installation Guide](https://starterhelp.orangehrm.com/hc/en-us/articles/5295915003666-OrangeHRM-Starter-Installation-Guide)
  - [OrangeHRM Starter Upgrade Guide](https://starterhelp.orangehrm.com/hc/en-us/articles/6937346912402-OrangeHRM-Starter-Upgrade-Guide-For-5x-versions-)

- For further information on how to use the product please refer to the User Guides, Tutorial videos, and FAQs available on [Help Portal](https://starterhelp.orangehrm.com)

## OrangeHRM Mobile App

<a href="https://play.google.com/store/apps/details?id=com.orangehrm.opensource" target="_blank">
<img height="54" alt='Get it on Google Play'
    src='https://raw.githubusercontent.com/wiki/orangehrm/orangehrm/mobile/play_store_cropped_en_US_2022_08_04.png'/>
</a>
<a href="https://apps.apple.com/us/app/orangehrm/id1527247547" target="_blank">
<img height="54" alt='Download on the App Store'
    src='https://raw.githubusercontent.com/wiki/orangehrm/orangehrm/mobile/app_store_en_US.svg'/>
</a>

## Resources

### Demo
Live demo is available at : https://opensource-demo.orangehrmlive.com

### Releases
Sourceforge : https://sourceforge.net/p/orangehrm

### Website
https://www.orangehrm.com/

## Help & Support
Submit your help requests through [OrangeHRM Help Portal](https://starterhelp.orangehrm.com/hc/en-us/requests/new) or Email to [ossupport@orangehrm.com](mailto:ossupport@orangehrm.com)

## License 
GNU General Public License

