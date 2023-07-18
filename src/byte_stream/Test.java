package byte_stream;

import java.io.*;

public class Test {

    public static void main(String []args) throws IOException, ClassNotFoundException {

        /*   FileOutputStream and FileInputStream   */

        FileOutputStream output = new FileOutputStream("test.txt",false);
        // if we pass true A new data will be appended to the end of the file.
        // if we pass false the new data overwrite the data in the file.
        String data ="Hello From FileOutputStream and FileInputStream\nIt is FAROOQ";
        byte []arr = data.getBytes();
        output.write(arr); // write byte to the file
        output.close();
        FileInputStream input = new FileInputStream("test.txt");
        int i = input.read(); // read the first byte
        while(i!=-1) {
            System.out.print((char)i);
            i=input.read(); // read the next file
        }
        input.close();



        /*   ByteArrayOutputStream  and ByteArrayInputStream    */

//        // ByteArrayOutputStream
//        ByteArrayOutputStream output = new ByteArrayOutputStream();
//        String data ="Hello From ByteArrayOutputStream and ByteArrayInputStream\nIt is FAROOQ";
//        byte []arr = data.getBytes();
//        output.write(arr); // write data on the output stream
//        //  Retrieves data from the output stream in string format
//        String streamData = output.toString();
//        System.out.println("Output Stream: "+streamData);
//        output.close();
//        // ByteArrayInputStream
//        byte []array = {1,2,3,4};
//        ByteArrayInputStream input = new ByteArrayInputStream(array);
//        for(int i=0;i<array.length;i++) {
//            int bytes = input.read();
//            System.out.print(bytes+", ");
//        }
//        input.close();



        /*   ObjectOutputStream and ObjectInputStream    */

//        FileOutputStream file = new FileOutputStream("file.txt");
//        ObjectOutputStream output = new ObjectOutputStream(file);
//        // Writing to the file using ObjectOutputStream
//        int data1 = 23;
//        String data2 = "Hello";
//        output.writeInt(data1);
//        output.writeObject(data2);
//        // Read From File
//        FileInputStream fileStream = new FileInputStream("file.txt");
//        ObjectInputStream objStream = new ObjectInputStream(fileStream);
//        System.out.println("Integer data :" + objStream.readInt());
//        System.out.println("String data: " + objStream.readObject());
//        output.close();
//        objStream.close();


    }
}
