@Library('JenkinsSharedLibraries') _
pipeline{
  agent any 
  tools {
    maven 'maven3.9.1'
  }
  stages{
    stage('git pull'){
      steps{
        sh "echo start of prod-shared project"
      git 'https://github.com/Lovalaunice/maven-web-application'
        }
      }
    stage("Build"){
    steps{
        sh "echo code build report ok"
       // common("Build")
    }
  }
  stage("Execute SonarQube Report"){
       steps{
           sh "echo code report ok"
          //common("SonarQube Report")
    }
    }
    stage("upload Artifacts Into Nexus"){
      steps{
        sh "echo artifacts uploaded"
        // common("upload into Nexus")
