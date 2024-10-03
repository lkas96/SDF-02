# Create and connect to repo
echo "# SDF-02" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/lkas96/SDF-02.git
git push -u origin main

# Constructors / Getter / Setters
    Can be created automatically using VSCode
    Provided the parameters/variables has been set
    Right click > Source Actions > Select constructors/getter/setters

# Compiling multiple java files in different directory
    javac -d target --source-path . ./*.java object/*.java (list all the java files locations)

    //change directory to destination folder (target)
    jar -c -v -f machines.jar -e target/App . 
    java -jar machines.jar
    