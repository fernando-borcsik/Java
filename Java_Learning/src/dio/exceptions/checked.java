package dio.exceptions;

import javax.swing.*;
import java.io.*;

public class checked {
    public static void main(String[] args) {
        String fileName = "Taolus.txt";

        try {
            printFile(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir. " + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte. " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception, o programa continua...");
    }

    public static void printFile(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}
