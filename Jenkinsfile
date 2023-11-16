pipeline {
    agent any

    tools {
        jdk '19'
    }

    stages {
        stage('Build') {
            steps{
                echo 'Building Code'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing JUnit'
                sh './gradlew test'
            }
            post {
                always {
                    junit ' build/test-results/test/**/*.xml'
                }
            }
        }
    }
}
