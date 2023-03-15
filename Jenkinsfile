pipeline {
    agent any

    stages {
        stage('Github Pull') {
            steps {
                git branch: 'main', credentialsId: 'GitHub', url: 'https://github.com/Octopops2442/TarunScientific_Calculator.git'
            }
        }
        stage('Maven build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker build') {
            steps{
                script {
                    imageName=docker.build("octopops24/calc:latest")
                }
            }
        }
        stage('Docker push img') {
            steps {
                script{
                    docker.withRegistry('','DockerHub'){
                    imageName.push()
                    }
                }
            }
        }
        stage("Delete docker image"){
            steps{
                sh "docker rmi octopops24/calc"
            }
        }
//         stage('Ansible pull image') {
//             steps {
//                 ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
//             }
//         }

    }
}
