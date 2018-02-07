pipeline {
    agent any

    stages {
        stage ('Run Stage') {
            steps {
                withMaven(maven : 'maven_3_5_2') {
                    echo 'It is running'
                }
            }
        }

        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'maven_3_5_2') {
                    sh 'mvn clean compile'
                }
            }
        }
    }
}