package dio.exceptions;

import javax.swing.*;
import java.io.*;

public class personalizada {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        printFile(fileName);
        System.out.println("\nCom exception ou não, o programa continua...");

    }

    public static void printFile(String fileName) {

        try {
            BufferedReader br = readFile(fileName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossibleToOpenFileException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado. Por favor, entre em contato com o suporte. " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static BufferedReader readFile(String fileName) throws ImpossibleToOpenFileException {
        File file = new File(fileName);
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new ImpossibleToOpenFileException(file.getName(), file.getPath());
        }
    }

}

class ImpossibleToOpenFileException extends Exception {

    private String fileName;
    private String directory;

    public ImpossibleToOpenFileException(String fileName, String directory) {
        super("O arquivo " + fileName + " não foi encontrado no diretório " + directory);
        this.fileName = fileName;
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "ImpossibleToOpenFileException{" +
                "fileName='" + fileName + '\'' +
                ", directory='" + directory + '\'' +
                '}';
    }
}
