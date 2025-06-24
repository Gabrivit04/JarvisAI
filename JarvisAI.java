package core;

import ai.NLPProcessor;
import utils.CommandHandler;

import java.util.Scanner;

public class JarvisAI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NLPProcessor nlp = new NLPProcessor();
        CommandHandler handler = new CommandHandler();

        System.out.println("JarvisAI pronto. Come posso aiutarti?");

        while (true) {
            System.out.print("\nUser: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("Jarvis: Arrivederci 👋");
                break;
            }

            String intent = nlp.extractIntent(input);
            handler.execute(intent, input);
        }

        scanner.close();
    }
}
