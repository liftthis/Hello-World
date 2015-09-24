
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * <p> 
 * This Java application creates the HelloWorld java program
 * the standard output stream.  
 * </p>
 *
 * @creator Fred Martinez
 * @created 2015.09.12
 */

public class MakeHelloWorld {

	private static final String OUTPUT_FILE = "C:\\Users\\Public\\HelloWorld.java";
    public static void main(String[] args) {

        String content1 = "    System.out.println(";
        String content2 = "hello, world";
        String content3 = ")";
        String content4 = ";";

        try (PrintWriter outWriter = new PrintWriter( new BufferedWriter(new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE))))) {

            // Format the output
            outWriter.printf("%s\n","/*");
            outWriter.printf("%s\n","* This Java application prints the phrase hello, world to the");
            outWriter.printf("%s\n","* standard output stream. This code was program generated.");
            outWriter.printf("%s\n","* ");
            outWriter.printf("%s\n","* @creator Fred Martinez");
            outWriter.printf("%s\n","* @generated 2015.09.12");   
            outWriter.printf("%s\n","*/");
            outWriter.printf("%s\n"," ");
            outWriter.printf("%s\n","public class HelloWorld");
            outWriter.printf("%s\n","{");
            outWriter.printf("%s\n","  public static void main(String[] argv) ");
            outWriter.printf("%s\n","  {");
            outWriter.printf("%s\n", content1 + content2 + content3 + content4);
            outWriter.printf("%s\n","  }");
            outWriter.printf("%s\n","}");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
