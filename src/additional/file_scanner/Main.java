package additional.file_scanner;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        File file;
        boolean corrupted;

        do {

            System.out.println("Введите адрес директории");
            String path = scanner.nextLine();
            file = new File(path);
            corrupted = !file.exists() || !file.isDirectory();

            if (corrupted) {
                System.out.println("Ввели несуществующий адрес или не адрес директории");
            }


        } while (corrupted);


        FileScanner fileScanner = new FileScanner();


        System.out.println(fileScanner.getCount(file));

    }
}
