package url;

import java.io.File;

public class Main {
    public static void main(String[] args){
        String link = "https://eportal.pwr.edu.pl/pluginfile.php/780555/mod_resource/content/1/Ogniwa.dat";
        File out = new File("C:\\Users\\Jarek\\Desktop\\ogniwa.dat");
        new Thread(new Download(link, out)).start();
    }

}
