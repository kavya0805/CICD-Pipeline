node{
    
    stage('git checkout'){
        git credentialsId 'github-creds', url 'https://github.com/kavya0805/CICD-Pipeline.git'
        
    }
    stage('maven clean'){
       def mavenHome = tool name 'maven3', type 'maven'
       def mavenCMD = "${mavenHome}/bin/mvn"
       sh "${mavenCMD} clean"
    }
    stage('maven build/test/package'){
       def mavenHome = tool name 'maven3', type 'maven'
       def mavenCMD = "${mavenHome}/bin/mvn"
       sh "${mavenCMD} package"
    }
    stage('docker image build'){
       sh 'docker build -t kavikarthic/cicd:4.0 .'
    }
    stage('docker image push') {
        withCredentials([string(credentialsId 'docker-password', variable 'dockerHubPwd')]){
            sh docker login -u kavikarthic -p ${dockerHubPwd}
        }
        sh 'docker push kavikarthic/cicd:4.0'
    }
    stage('docker image pull') {
        sh 'docker pull kavikarthic/cicd:4.0'
    }
    stage('docker run container') {
        sh 'docker run -d -p 9091 kavikarthic/cicd:4.0'
    }
    
}