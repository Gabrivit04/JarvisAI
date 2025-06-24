package utils;

import java.io.File;

public class CommandHandler {

    public void execute(String intent, String input) {
        switch (intent) {
            case "weather" -> System.out.println("Jarvis: A Milano ci sono 24°C, cielo sereno ☀️");
            case "open_file" -> openFile(input);
            case "reminder" -> System.out.println("Jarvis: Promemoria impostato per oggi alle 18. ⏰");
            case "greeting" -> System.out.println("Jarvis: Ciao! Come posso aiutarti?");
            default -> System.out.println("Jarvis: Mi dispiace, non ho capito il comando.");
        }
    }

    private void openFile(String input) {
        try {
            String fileName = input.substring(input.indexOf("apri") + 5).trim();
            File file = new File(fileName);
            if (file.exists()) {
                java.awt.Desktop.getDesktop().open(file);
                System.out.println("Jarvis: Ho aperto il file \"" + fileName + "\".");
            } else {
                System.out.println("Jarvis: Il file \"" + fileName + "\" non esiste.");
            }
        } catch (Exception e) {
            System.out.println("Jarvis: Errore durante l'apertura del file.");
        }
    }
}
