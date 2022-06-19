node {
    stage ('Test & Build Artifact') {
        sh 'chmod +x gradlew'
        sh './gradlew clean build'
    }
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
    //stage ('Deploy') {
    //    //sh 'deploy adapters: [tomcat9(credentialsId: \'1c9e9926-96bb-4eea-9a83-9e5b57716743\', path: \'\', url: \'http://localhost:8080\')], contextPath: \'jenkins-test\', war: \'**/*.war\''
    //    deploy adapters: [tomcat10(credentialsId: '1c9e9926-96bb-4eea-9a83-9e5b57716743', path: '', url: 'http://localhost:8080')], contextPath: 'jenkins-test', war: '**/*.war'
    //}

    stage ('Build docker image') {
        steps {
            sh 'docker build --build-arg JAR_FILE=build/libs/*.jar -t jenkins/test-ci-cd .'
        }
    }
    //stage ('Deploy') {
    //    steps {
    //        sh 'docker run -p 8070:8070 jenkins/test-ci-cd'
    //    }
    //}
}