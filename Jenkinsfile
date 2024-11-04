pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git url: 'git@github.com:BhavanaSB-13/practise', branch: 'main'
            }
        }
        // stage('Build') {
        //     steps {
        //         echo 'Building the application...'
        //         bat 'mvn clean compile'
        //     }
        // }
        // stage('Test') {
        //     steps {
        //         echo 'Running tests...'
        //         // Run Maven to execute tests
        //         bat 'mvn test'
        //     }
        // }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Here you can add deployment steps
                echo 'Deployment step not implemented.'
            }
        }
    }
    post {
        always {
            // Archive test results
            echo 'Build finished'
        }
    }
}
