import java.io.BufferedReader;
import java.io.FileReader;

public class PR8 {
    public static void main(String[] args) {
        String path = "F:\\JAVA\\" + args[0];
        System.out.println(path);
        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String cureentLine = reader.readLine();
            while (cureentLine != null) {
                lines++;
                String[] wordArray = cureentLine.split(" ");
                words += wordArray.length;

                for (int i = 0; i < wordArray.length; i++) {
                    characters += wordArray[i].length();
                }

                cureentLine = reader.readLine();
            }

            System.out.println("Characters : " + characters);
            System.out.println("Words : " + words);
            System.out.println("Lines : " + lines);
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}