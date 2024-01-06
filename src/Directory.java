import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Directory {
    private String path;

    public Directory(String subdirectory) {
        this.path = "C:\\GoEasy\\" + subdirectory;
    }

    public void createDirectory(){
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs();
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

    public String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path + "\\" + fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public String getPath() {
        return path;
    }
}
