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
                bat 'javac Calci.java CalciTest.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'java -cp . org.junit.runner.JUnitCore CalciTest'
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
