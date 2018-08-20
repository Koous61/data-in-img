package util.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class TextIO {
    public static String read(String path) throws IOException {
        return Files.lines(Paths.get(path)).collect(Collectors.joining("\n"));
    }

    public static void save(String text, String path) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(path);

        out.append(text);
        out.flush();
    }

}
