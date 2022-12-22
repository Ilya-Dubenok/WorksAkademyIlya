package additional.file_scanner;

import java.io.File;

public class FileScanner {


    public DataContainer getCount(File file) {

        DataContainer dataContainer = new DataContainer();

        dataContainer.increaseCounterOfDirectories();

        if (file.isHidden()) {
            dataContainer.increaseCounterOfHiddenObjects();
        }

        File[] allData = file.listFiles();
        if (allData != null) {

            for (File singleFile : allData) {

                if (singleFile.isDirectory()) {

                    DataContainer dataContainer1 = getCount(singleFile);
                    dataContainer.mergeData(dataContainer1);

                } else {

                    if (singleFile.getName().endsWith(".txt")) {
                        dataContainer.increaseCounterOfTextFiles();
                    }

                    if (singleFile.isHidden()) {
                        dataContainer.increaseCounterOfHiddenObjects();
                    }

                    if (singleFile.isFile()) {
                        dataContainer.increaseCounterOfFiles();

                    }


                }


            }
        }

        return dataContainer;

    }


    class DataContainer {

        private int counterOfDirectories;
        private int counterOfFiles;
        private int counterOfHiddenObjects;
        private int counterOfTextFiles;


        public void increaseCounterOfDirectories() {
            this.counterOfDirectories++;
        }

        public void increaseCounterOfFiles() {
            this.counterOfFiles++;
        }

        public void increaseCounterOfHiddenObjects() {
            this.counterOfHiddenObjects++;
        }

        public void increaseCounterOfTextFiles() {
            this.counterOfTextFiles++;
        }


        public int getCounterOfDirectories() {
            return counterOfDirectories;
        }

        public int getCounterOfFiles() {
            return counterOfFiles;
        }

        public int getCounterOfHiddenObjects() {
            return counterOfHiddenObjects;
        }

        public int getCounterOfTextFiles() {
            return counterOfTextFiles;
        }

        public void mergeData(DataContainer dataContainer) {
            this.counterOfFiles += dataContainer.getCounterOfFiles();
            this.counterOfHiddenObjects += dataContainer.getCounterOfHiddenObjects();
            this.counterOfTextFiles+= dataContainer.getCounterOfTextFiles();
            this.counterOfDirectories += dataContainer.getCounterOfDirectories();



        }


        @Override
        public String toString() {
            return "Итого: " +
                    "директорий = " + counterOfDirectories +
                    ", файлов = " + counterOfFiles +
                    ", скрытых объектов = " + counterOfHiddenObjects +
                    ", текстовых файлов = " + counterOfTextFiles;
        }
    }


}
