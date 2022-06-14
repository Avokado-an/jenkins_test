node {
    stage ('Test & Build Artifact') {
        sh 'chmod +x gradlew'
        sh './gradlew clean build'
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