package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class RandomUtils {// no inhertance

    private RandomUtils() {// no object creation

    }

    protected static String readJsonAndgetAsString(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

}
