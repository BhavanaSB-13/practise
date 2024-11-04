pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/BhavanaSB-13/practise.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
         }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                echo 'Deployment step not implemented.'
            }
        }
    }
    post {
        always {
            echo 'Build finished'
        }
    }
}
