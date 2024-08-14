import java.lang.reflect.ClassFileFormatVersion;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.String;
    public class Demo {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter project name");
            String projectName = sc.nextLine();
            String path = "C:\\Users\\lodhi\\OneDrive\\Desktop\\";
            File project = new File(path + projectName);
            project.mkdir();
            File flHTML = new File(path+projectName+"\\index.html");
            flHTML.createNewFile();
            FileWriter fwHTML = new FileWriter(flHTML);
            fwHTML.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Document</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                    "</head>\n" +
                    "\n" +
                    "<body>\n" +
                    "  <script src=\"script.js\"></script>\n" +
                    "</body>\n" +
                    "\n" +
                    "</html>");
            fwHTML.close();
            File flCSS = new File(path + projectName +"\\style.css");
            flCSS.createNewFile();
            FileWriter fwCSS = new FileWriter(flCSS);
            fwCSS.write("*{\n" +
                    "    margin: 0%;\n" +
                    "    padding: 0%;\n" +
                    "\n" +
                    "}\n" +
                    "html,body{\n" +
                    "    height: 100%;\n" +
                    "    width: 100%;\n" +
                    "}");
            fwCSS.close();
            File flJS  = new File(path+projectName+"\\script.js");
            flJS.createNewFile();
        }
    }
}
