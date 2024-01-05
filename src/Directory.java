import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Directory {
    private final String path;

    public Directory() {
        this.path = "C:\\GoEasy";
    }

    public void createDirectory(){
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public void writeToFile(String fileName, String content, boolean append) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path + "\\" + fileName, append));
            writer.write(content);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPath() {
        return path;
    }
}
