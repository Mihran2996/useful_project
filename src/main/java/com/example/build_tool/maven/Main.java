package com.example.build_tool.maven;

public class Main {

    //https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html

    //******************************************************************************************************************
    //CLEAN

    //The clean command removes the previous build
    //It removes the target package that contains the jar files
    //******************************************************************************************************************

    //******************************************************************************************************************
    //VALIDATE

    //The project is correct and all necessary information is available
    //******************************************************************************************************************

    //******************************************************************************************************************
    //COMPILE

    //Compiles code from SomeClass.java to SomeClass.class and store in the` classes package of target.
    //******************************************************************************************************************

    //******************************************************************************************************************
    //TEST

    //The test compiled source code using a suitable unit testing framework.
    //******************************************************************************************************************

    //******************************************************************************************************************
    //PACKAGE

    //Creates the jar file from compiled code and store it in the` lib package of target
    //******************************************************************************************************************

    //******************************************************************************************************************
    //VERIFY

    //Run any checks on results of integration tests to ensure quality criteria are met
    //******************************************************************************************************************

    //******************************************************************************************************************
    //INSTALL

    //Install the package into the local repository, for use as a dependency in other projects locally
    //******************************************************************************************************************

    //******************************************************************************************************************
    //DEPLOY

    //Done in the build environment
    //copies the final package to the remote repository for sharing with other developers and projects.
    //******************************************************************************************************************

    //******************************************************************************************************************
    //POM XML

    //<groupID>...<groupDd/>       : Here is mentioned name of Company
    //<artifactID>...<artifactID/> : Here is mentioned name of Project
    //******************************************************************************************************************

    //******************************************************************************************************************
    //LIFE-CIRCLE

    //VALIDATE - Validates if the project structure is correct
    //COMPILE - It compiles the source code and stores in the target/classes as .class fail(it is byte code)
    //TEST - it runs the unit test
    //INTEGRATION-TEST - It runs the integration test for the project
    //VERIFY - It runs any check on results of integration test to ensure quality criteria are met
    //INSTALLS - It installs the packaged code to the local maven repository
    //DEPLOY - IT copies the packaged code to the remote repository
    //******************************************************************************************************************

    //******************************************************************************************************************
    //REPOSITORIES

    //LOCAL-REPOSITORY   : it's located in the ` C:/Users/USER_NAME/.m2 this directory is created when performs some maven command
    //CENTRAL-REPOSITORY : it's located in the  http://repo.maven.apache.org/maven2
    //REMOTE-REPOSITORY  : it's our own repository, for our company
    //******************************************************************************************************************

}
