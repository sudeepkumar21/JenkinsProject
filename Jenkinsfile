
pipeline{
    agent any
    
    tools{
        maven 'localmaven'
    }
    triggers{
        cron('H 06 * * *')
    }
    stages{
        stage("code checkout"){
            steps{
                bat "echo hello"
            }
        }
         stage("code build"){
            steps{
                bat "mvn clean"
            }
        }
         stage("unit test"){
            steps{
                bat "mvn test"
            }
        }
    }
    post{
        success{
            bat "echo success"
        }
    }
}
