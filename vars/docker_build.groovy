def call(string imageTag, string dockerHubuser){
    sh "docker build -t ${dockerHubuser}/$(projectname}:${image tag} ."
}
    
 
