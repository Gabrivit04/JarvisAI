package ai;

public class NLPProcessor {

    public String extractIntent(String input) {
        input = input.toLowerCase();
        if (input.contains("meteo")) return "weather";
        if (input.contains("apri") || input.contains("apre")) return "open_file";
        if (input.contains("ricordami") || input.contains("promemoria")) return "reminder";
        if (input.contains("ciao") || input.contains("salve")) return "greeting";
        return "unknown";
    }
}
