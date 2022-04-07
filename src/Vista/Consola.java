package Vista;
//Importar el paquete de scanner para entradas
import java.util.Scanner;

public class Consola {
    //Variable sc para llamar rapidamente al scanner
    private Scanner sc;

    //Constuctor
    public Consola(){
        sc = new Scanner(System.in);
    }

    //Metodo para mostrar un mensaje en consola, se debe enviar un String
    public void printMsg(String pMen) throws Exception{
			try {
        System.out.println(pMen);
			} catch (Exception e) {
				StackTraceElement[] stackTraceElements = e.getStackTrace();
				for (StackTraceElement stackTraceElement : stackTraceElements) {
					System.err.println(stackTraceElement.getClassName());
					System.err.println(stackTraceElement.getMethodName());
					System.err.println(stackTraceElement.getLineNumber());
					System.err.println(stackTraceElement.getFileName());
				}
				throw new Exception("Error al mostrar mensaje");
			}
    }

    //Metodo para leer enteros
    public int readInt(String pStr) throws Exception{
			try {

        System.out.println(pStr);
        int num = sc.nextInt();
        sc.nextLine();
        return num;
			} catch (Exception e) {
				StackTraceElement[] stackTraceElements = e.getStackTrace();
				for (StackTraceElement stackTraceElement : stackTraceElements) {
					System.err.println(stackTraceElement.getClassName());
					System.err.println(stackTraceElement.getMethodName());
					System.err.println(stackTraceElement.getLineNumber());
					System.err.println(stackTraceElement.getFileName());
				}
				throw new Exception("Error al leer entero");
			}
    }

    //Metodo para leer String
    public String readString(String pStr) throws Exception{
			try {

        System.out.println(pStr);
        String str = sc.nextLine();
        return str;
			} catch (Exception e) {
				StackTraceElement[] stackTraceElements = e.getStackTrace();
				for (StackTraceElement stackTraceElement : stackTraceElements) {
					System.err.println(stackTraceElement.getClassName());
					System.err.println(stackTraceElement.getMethodName());
					System.err.println(stackTraceElement.getLineNumber());
					System.err.println(stackTraceElement.getFileName());
				}
				throw new Exception("Error al leer String");
			}
    }

    //Metodo para leer Double
    public double readDouble(String pStr) throws Exception{
			try {
        System.out.println(pStr);
        double d = sc.nextDouble();
        sc.nextLine();
        return d;
			} catch (Exception e) {
				StackTraceElement[] stackTraceElements = e.getStackTrace();
				for (StackTraceElement stackTraceElement : stackTraceElements) {
					System.err.println(stackTraceElement.getClassName());
					System.err.println(stackTraceElement.getMethodName());
					System.err.println(stackTraceElement.getLineNumber());
					System.err.println(stackTraceElement.getFileName());
				}
				throw new Exception("Error al leer Double");
			}
    }
}