package question1;

import java.io.DataInputStream;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) throws IOException {
        DataInputStream br = new DataInputStream(System.in);
        System.out.println("enter string");
        String s = br.readLine();
        System.out.println("Welcome," + " " + s + "!");

    }
}
