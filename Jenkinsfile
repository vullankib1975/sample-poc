pipeline {
    // run on jenkins nodes tha has java 8 label
    agent { label 'java11' }
    // global env variables
    environment {
        EMAIL_RECIPIENTS = 'mahmoud.romeh@test.com'
    }
  
  stages {
    stage("build) {
          
          steps{
            
            script{
                    echo 'Pulling...' + env.BRANCH_NAME
                    def mvnHome = tool 'Maven 3.5.2'
              echo 'building jar file'
              sh "'${mvnHome}/bin/mvn' -Dintegration-tests.skip=true  clean package"
            }
          }
          }
  
  }
}
