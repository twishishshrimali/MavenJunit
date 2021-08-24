node {
  stage('SCM Chekout'){
  git 'https://github.com/twishishshrimali/MavenJunit'
  }
  stage('Compile-Package'){
  //get maven home path 
  def mvnhome = tool name: 'maven-3', type: 'maven'
  sh "${mvnhome}/bin/mvn package"
  }
  stage('SonarQube Analysis') {
  def mvnhome = tool name: 'maven-3', type: 'maven'
  withSonarQubeEnv('SonarScanner') {
  sh "${mvnHome}/bin/mvn sonar:sonar"
  }
}
}
