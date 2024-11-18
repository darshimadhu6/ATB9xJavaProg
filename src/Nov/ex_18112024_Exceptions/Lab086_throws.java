package Nov.ex_18112024_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab086_throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f = new FileInputStream("c://abc.txt");
    }
}
