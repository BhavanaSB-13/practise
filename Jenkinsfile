pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/BhavanaSB-13/practise.git', branch: 'main'
            }
        }
        stage('Compile') {
            steps {
                echo 'Building the application...'
                bat 'javac Calculator.java CalciTest.java'
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
