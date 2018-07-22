#!groovy
#/ A Course 2018
#/ Continuous Integration
#/ Trevor Fry

node
{
   stage("Checkout")
   {
      echo('Checking out repo!')
      checkout scm
   }

   stage("Build")
   {
      sh('java -version')
   }
}