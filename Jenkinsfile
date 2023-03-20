pipeline {
    agent any

    stages {
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
        stage('Docker image push to dockerhub') {
            steps {
                script{
                    docker.withRegistry('','Tarun Docker Hub'){
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
        stage('Ansible pull image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }

    }
}
