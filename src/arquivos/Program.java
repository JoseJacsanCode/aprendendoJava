package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("/home/jjacsan/Workspaces/workspace-java/in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}

/* 
O arquivo é lido de acordo 
com as pastas do Linux.
*/ 