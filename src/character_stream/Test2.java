package character_stream;

import java.io.*;

public class Test2 {

    public static void main (String []args) throws IOException {

        /*   BufferedWriter and BufferedReader   */

        FileWriter fileWriter = new FileWriter("test.txt");
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
        bufferWriter.write("Hello From BufferedWriter and BufferedReader\nThis Is FAROOQ");
        bufferWriter.close();
        // Read From File
        FileReader fileReader = new FileReader("test.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);
        char []array=new char[100];
        bufferReader.read(array);
        System.out.println(array);
        bufferReader.close();



        /*   OutputStreamWriter and InputStreamReader   */

//        FileOutputStream fileOutput = new FileOutputStream("test.txt");
//        OutputStreamWriter output = new OutputStreamWriter(fileOutput);
//        output.write("Hello From OutputStreamWriter and InputStreamReader\nThis is FAROOQ");
//        output.close();
//        // Read From File
//        FileInputStream fileInput = new FileInputStream("test.txt");
//        InputStreamReader input = new InputStreamReader(fileInput);
//        char []array = new char[100];
//        input.read(array);
//        System.out.println(array);
//        input.close();



        /*   FileWriter and FileWriter    */

//        FileWriter output = new FileWriter("test.txt");
//        output.write("Hello From FileWriter and FileWriter\nThis Is FAROOQ");
//        output.close();
//        // Read From File
//        FileReader input = new FileReader("test.txt");
//        char []array = new char[100];
//        input.read(array);
//        System.out.println(array);
//        input.close();



        /*   StringWriter and StringReader   */

//        StringWriter output = new StringWriter();
//        output.write("Hello From StringWriter and StringReader\nThis Is FAROOQ");
//        System.out.println("Data In The StringWriter: "+output);
//        output.close();
//        // Read String
//        String data = "Hello From StringWriter and StringReader\nThis Is FAROOQ";
//        StringReader input = new StringReader(data);
//        char []array=new char[100];
//        input.read(array);
//        System.out.println("Data read from the string:");
//        System.out.println(array);
//        input.close();
    }
}
