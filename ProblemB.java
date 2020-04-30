import java.io.*;
import java.util.Scanner;

public class ProblemB {

        public static void main(String args[]) throws Exception {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


                    String line;
                    while((line = in.readLine()) != null ){
                        System.out.println(line.toLowerCase().contains("problem") ? "yes" : "no"); //remember how to do this in the future

                    }
                    in.close();
                }
            }




