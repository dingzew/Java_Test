import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class TranferCSV {
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("test.txt", true);
        try {
            // Document d = new Document("https://enr-apps.as.cmu.edu/assets/SOC/sched_layout_spring.htm");
            Document d = Jsoup.connect("https://enr-apps.as.cmu.edu/assets/SOC/sched_layout_spring.htm").get();
            Elements rows = d.getElementsByTag("tr");
            System.out.println(rows.size());
            for (Element row : rows) {
                Elements cells = row.getElementsByTag("td");
                for (Element cell : cells) {
                    writer.write(cell.text().concat(";"));
                }
                writer.write("\n");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
