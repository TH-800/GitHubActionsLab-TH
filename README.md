for multi-platform its job is to do one thing and that is to make a text file for each platform Windows,Unix and MacOS and then append the system info (windows systeminfo in cmd prompt and for unix its uname -a) and then print out the contents of the systeminfo text file into the command prompt console or bash shell

for Dependent-jobs its job was to build a java via in a simululation then run all the tests and finally compile the java file

i had to suffer as i wanted to compile and run all the java tests in a file but it failed everytime and gave me an error saying cant find pom file so i ran some commands inside of the yaml files to find the root and the root was .: and i had no clue what it was then i found out i needed to setup java in order to have any java unix commands to run which were actions/checkout@v3 and

actions/setup-java@v3 with: distribution: 'temurin' java-version: '17' which fixed all the issues i had and it started running the commands

but other then that the commands i used in the yaml file were runs-on for setting what Operating system some of the commands will work on, and needs for when i need a sequential workflow order and do Env commands to set windows to command prompt or powershell count as an env command as im setting the environment for it to run on
