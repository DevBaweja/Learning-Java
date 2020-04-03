package Misc;

public class Misc {

	@SuppressWarnings("unused") // this is used to suppress warning
	public static void main(String[] args) {

		// OOPS ::
		// Encapsulation
		// Data Abstraction
		// Polymorphism
		// Inheritance

		int f = 12; // Decimal 0-9
		int g = 012; // Hexadecimal 0-7
		int k = 0xface; // Octaldecimal 0-f

		// char is 16-bit Unicode character
		// char varies from 0-65535

		// '' use only single character dont use multiple charcter value it is itself an
		// error

		char c = '\u1243'; // unicode expression
		// unicode value varies from '\u0000' to '\uffff'

		// you cannot implement an interface in interface
		// ie it can be said we construct interface first

		// Every decimal value is implicit double in nature
		// so we need to explicit define it to float by using f or F
		// float f = 23.12;

		float h = 23.12f;
		float a = (float) 23.12D;

		double d = 23.12f;

		// but in case of double we dont have to worry about typecasting

		// there is no signed and unsigned in java unlike c/c++

		// goto is reserved word( words which cannot be identifiers ) but it cannot be
		// classified as keyword (words that are used in syntax)

		int[] dog[];
		// form matrix

		// int arr[5]; it will give error in java as it is static memory allocation
		// in c/c++ this is supported but in java due to dynamic memory allocation it is
		// not supported
		// in java to declare static array
		int arr[] = { 1, 2, 3, 4, 5 };

		// there is never nesting of comment to uncomment an comment /* /*uncomment*/ */

		// Interface

		// variables are public static final
		// functions are public abstract
		// these conditions cannot be changed

		// (1/0) Exception
		// (1.0/0) Infinity

		// strictfp
		// strictfp is a modifier in the Java programming language that restricts
		// floating-point calculations to ensure portability. The strictfp command was
		// introduced into Java with the Java virtual machine (JVM)

		// there is no default value of local varibales
		// A null reference may be used to access static variables or methods without creating object NULL reference ie just an references
		// there is no structure and union in java
		// java is not acronym it is just an name
		// James Gosling is founder of java
		// simula is first oops language
		// Abstraction hides complexcity . Abstraction is related to both encapsulation and data hiding
		// Implicit Security
		// Java compiler converts the Java code into byte code (.class file) and these
		// byte codes are then run by Java Virtual Machine (JVM) . When this byte
		// codes are executed , the JVM can take care of the security. (Bytecode)
		// To provide explicit security SSL,JAAS,Cryptography

	}
}
