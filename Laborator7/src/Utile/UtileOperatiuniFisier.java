package Utile;

import java.io.*;

public class UtileOperatiuniFisier {

    public static void afisareInFisier(String numeFisier, String continut){
        try {
            FileWriter fileWriter = new FileWriter(numeFisier);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(continut);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }


    public static void citireInFisier(String numeFisier, String continut) throws IOException {
        File file = new File(numeFisier);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String entry = bufferedReader.readLine();
            while(entry != null){
                System.out.println(entry);
                entry = bufferedReader.readLine();
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            fileReader.close();
        }
    }

}
