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
    jar -c -v -f machines.jar -e App . 
    //run the jar file
    java -jar machines.jar

    //run the programme without compiling
    java -cp target App
    
# Overriding and Overloading
    Override used when child class contains the same method as parent class
    requires @Override functionname()

    Overloading can be used in any class -> same method/function name but differentiated by parameters/arguments being passed in

# Interface
    Interface are like common methods between the child/parent classes
    Child classes extends parents
    Writing the functions in parent classes into a separate interface
    Main.java -> IMain.java (where the interfaces methods resides)
    Just contains
        public void function(arguments passing in);
        Generate them automatically
        In the child classes