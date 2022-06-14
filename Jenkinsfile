node {
    //stage ('Test & Build Artifact') {
    //    sh 'chmod +x gradlew'
    //    sh './gradlew clean build'
    //}
    //stage('SonarQube analysis') {
    //    sh 'chmod +x gradlew'
    //    withSonarQubeEnv() {
    //        sh './gradlew sonarqube'
    //    }
    //}
    //stage("Quality Gate"){
    //    timeout(time: 1, unit: 'HOURS') {
    //        def qualityGate = waitForQualityGate()
    //        if (qualityGate.status != 'OK') {
    //            error "Pipeline aborted - quality gate failure: ${qg.status}"
    //        }
    //    }
    //}
    stage ('Build docker image') {
        sh 'docker build --build-arg JAR_FILE=build/libs/*.jar -t jenkins/test-ci-cd .'
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