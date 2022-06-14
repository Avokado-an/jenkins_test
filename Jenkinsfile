pipeline {
    agent any

    triggers{
        githubPush()
    }

    environment {
        REMOTE_ADDRESS = "REPLACE_WITH_REMOTE_ADDRESS"
    }

    stages {
        stage ('Test & Build Artifact') {
            agent {
                any {
                    image 'openjdk:11'
                    args '-v "$PWD":/app'
                    reuseNode true
                }
            }
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
            }
        }
        stage('SonarQube analysis') {
            withSonarQubeEnv() {
              sh './gradlew sonarqube'
            }
        }
        //stage ('Build docker image') {
        //    steps {
        //        sh 'docker build --build-arg JAR_FILE=build/libs/*.jar -t jenkins/test-ci-cd .'
        //    }
        //}
        //stage ('Deploy') {
        //    steps {
        //        sh 'docker run -p 8070:8070 jenkins/test-ci-cd'
        //    }
        //}

    }
}