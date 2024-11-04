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
                bat 'javac Calculator.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'java -cp . org.junit.runner.JUnitCore CalciTest.java'
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
