package home_work_6.run;

import home_work_6.utils.RegExSearch;
import home_work_6.utils.WordsCollector;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_7 {

    public static RegExSearch regExSearch = new RegExSearch();
    public static Consumer<String> speaker = System.out::println;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean notCorrupted;
        boolean toStop;
        do {
            toStop = true;

            speakWithUser("Введите адрес директории, из которой будут считываться файлы", speaker);
            File directoryToSearch = new File(scanner.next());
            notCorrupted = directoryToSearch.exists() && directoryToSearch.isDirectory();
            if (notCorrupted) {

                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/home_work_6/result.txt"))) {

                    fillWithBooks(new File("src/home_work_6/Война и мир_книга.txt"),
                            new File(directoryToSearch.getPath()));
                    File[] toNavigate = formArrayOfTextFilesInDirectory(directoryToSearch);


                    getCommand(scanner, toNavigate, bufferedWriter);


                } catch (IOException e) {
                    speakWithUser("Произошла ошибка ввода - вывода данных: " + e.getMessage(), speaker);
                    toStop = false;
                }

            } else {
                speakWithUser("Адрес не указывает на директорию", speaker);
                toStop = false;
            }


        } while (!toStop);

    }

    /**
     * Принимает команды от пользователя о том, в каком файле искать слово
     * @param scanner
     * @param toNavigate
     * @param bufferedWriter
     * @throws IOException
     */
    private static void getCommand(Scanner scanner, File[] toNavigate, BufferedWriter bufferedWriter) throws IOException {
        int command;
        System.out.println(getMessageOfDirectoryContents(toNavigate));

        do {

            speakWithUser("Введите номер файла для поиска или 0 для выхода из программы", speaker);
            try {
                command = scanner.nextInt();
                if (command < 0 || command > toNavigate.length) {
                    speakWithUser("Введено значение в неверном диапазоне", speaker);
                    command = -1;
                } else if (command != 0) {
                    makeSearch(scanner, toNavigate[command - 1], bufferedWriter);
                } else {
                    speakWithUser("Прекращаю работу программы", speaker);
                }


            } catch (Exception e) {
                speakWithUser("Введены неверные данные", speaker);
                command = -1;
                if (scanner.hasNext()) {
                    scanner.next();
                }

            }


        } while (command != 0);

    }

    /**
     * Запрашивает у пользователя, какое слово будем искать в переданном файле, и записивает результат в toWrite
     * @param scanner
     * @param toRead  файл, в котором будем искать слово
     * @param toWrite результаты поиска по мере их накопления
     * @throws IOException
     */
    public static void makeSearch(Scanner scanner, File toRead, BufferedWriter toWrite) throws IOException {


        boolean toStop;

        do {

            speakWithUser("Ведется поиск в файле " + toRead.getName() + ". Введите слово для поиска:", speaker);
            String search = scanner.next();

            String text = WordsCollector.getStringOfWorldsFromFile(toRead);
            long count = regExSearch.search(text, search);
            toWrite.write(toRead.getName() + " - " + search + " - " + count + "\n");
            toWrite.flush();

            speakWithUser("Данные сохранены. Введите 0 для выхода из поиска по данному файлу" +
                    " или любое другое значение для продолжения поиска по данному файлу", speaker);

            toStop = scanner.next().equals("0");


        } while (!toStop);


    }

    /**
     * Выводит сообщение пользовователю указанным в программе методом
     * @param message        сообщение, выводимое пользователем
     * @param stringConsumer то, каким образом пользователю будет выводиться сообщение
     */
    public static void speakWithUser(String message, Consumer<String> stringConsumer) {
        stringConsumer.accept(message);
    }

    /**
     * Формирует строку о том, какие файлы содержатся в веденном массиве файлов, с их нумерацией
     * , начиная с 1
     * @param files массив файлов для вывода строки
     * @return
     */
    public static String getMessageOfDirectoryContents(File[] files) {

        StringBuilder sb = new StringBuilder("В директории находятся следующие файлы:\n");


        int length = files.length;
        for (int i = 0; i < length; i++) {
            sb.append(i + 1).append(" -> ").append(files[i].getName()).append("\n");

        }

        return sb.toString();

    }

    /**
     * Возвращает массив из текстовых файлов (.txt) их переданнной директории, отсортированных по наименованию
     * Сортировка идет лексикографически, если оба файла имеют одинаковое наименование, но разную цифру на конце,
     * то сортирует по данной цифре по возрастанию
     * Если в директории нет файлов формата .txt, возвращает null
     * @param directory - директория для анализа состава текстовых файлов
     * @return
     */
    public static File[] formArrayOfTextFilesInDirectory(File directory) {
        File[] allTextFiles = directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });

        if (allTextFiles == null) {
            return null;
        }
        Arrays.sort(allTextFiles, (o1, o2) -> {
            Pattern pattern = Pattern.compile("(.+?)(\\d+)");
            Matcher m1 = pattern.matcher(o1.getName());
            Matcher m2 = pattern.matcher(o2.getName());
            if (m1.find() && m2.find() && m1.group(1).equals(m2.group(1)))
                return Integer.parseInt(m1.group(2)) - Integer.parseInt(m2.group(2));


            return o1.getName().compareTo(o2.getName());
        });
        return allTextFiles;

    }

    /**
     * Возвращает количество строк в переданном файле
     * @param toRead
     * @return
     * @throws IOException
     */
    public static int getCountOfLinesInBook(File toRead) throws IOException {

        int countOfLines = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(toRead))) {
            String read;
            while ((read = bufferedReader.readLine()) != null) {
                countOfLines++;
            }
        }
        return countOfLines;

    }

    /**
     * Делит переданный файл toRead на 100 равных (последняя часть чуть больше) частей, и заполняет ими
     * переданный файл toFill
     * @param toRead
     * @param toFill
     * @throws IOException
     */
    public static void fillWithBooks(File toRead, File toFill) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(toRead))) {

            int countOfLines = getCountOfLinesInBook(toRead);


            for (int i = 0; i < 100; i++) {

                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                        (toFill.getPath() + "/VIM_TOM_" + (i + 1) + ".txt"))) {


                    int countToFill = countOfLines / 100;

                    String read;

                    for (int j = 0; j < countToFill && (read = bufferedReader.readLine()) != null; j++) {

                        bufferedWriter.write(read + "\r\n");
                        if (i == 99) {
                            j = 0;
                        }

                    }


                }
            }

        }


    }
}
