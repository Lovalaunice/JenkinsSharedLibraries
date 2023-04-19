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
        git "https://github.com/lovalaunice/maven-web-application"
        }
      }
    }
}
