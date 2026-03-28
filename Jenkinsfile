pipeline {
    agent any
    stages {
        stage('Run Java Program') {
            steps {
                bat '"C:\\Program Files\\Java\\jdk-21.0.10\\bin\\javac.exe" Factorial.java'
                bat '"C:\\Program Files\\Java\\jdk-21.0.10\\bin\\java.exe" Factorial'
            }
        }
    }
}
