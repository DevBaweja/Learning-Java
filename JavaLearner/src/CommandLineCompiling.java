
public class CommandLineCompiling {

	public static void main(String[] args) {
		
	// Firstly we have to do to .java files directory
		
//	-d option: It is used to store the output to different directory. 
//	If we don’t use this option then the class file will be created in the src directory.
//	But it’s a good practice to keep source and class files separately. 
//	After -d option we provide the location of the directory in which class files should be stored.
	
	// javac stand for java compiler
	// javac A.java
	// it will compile these files in same directory
		
	// to compile in different directory use -d flag
	// javac -d ../bin A.java
	// when in default package 
		
	
	// Packages
	// Donot write package nor import anything as it is compiler thing 
		
		// javac -d ../../bin/pack1 Class1.java 
		// is compiled in src/pack1 into bin/pack1 
		
		// javac -d ../../bin/pack2 -cp ../../bin/pack1 MainClass.java
		// is compiled in src/pack2 into bin/pack2 with help of bin/pack1 class files 
		// in this case MainClass uses pack1 class file with help of class path ie cp 
		
		// java -cp ../../bin/pack1; NonSub
		// is used to run NonSub with run time linking of bin/pack1 class files
	
	}
}
