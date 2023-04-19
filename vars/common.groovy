@Library('LandmarkSS-sharedlibs') _
pipeline{
  agent any 
  tools {
    maven 'maven3.9.1'
  }
  stages{
    stage('git pull'){
      steps{
        sh "echo start of project"
        git "https://github.com/lovalaunice/maven-web-application"
        }
      }
    }
}
