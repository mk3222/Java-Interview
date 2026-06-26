import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class DocxWordExtractor {
    public static void main(String[] args) throws Exception {
        File docxFile = new File("C:\\Users\\adminp1\\Desktop\\Docs\\Mohammad Karim - Resume_081825.docx");
        ZipFile zipFile = new ZipFile(docxFile);

        ZipEntry entry = zipFile.getEntry("word/document.xml");
        InputStream stream = zipFile.getInputStream(entry);

        // Parse XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(stream);

        // Extract text
        NodeList nodes = doc.getElementsByTagName("w:t");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nodes.getLength(); i++) {
            sb.append(nodes.item(i).getTextContent()).append(" ");
        }

        zipFile.close();

        // Split into words
        String[] words = sb.toString().trim().split("\\s+");
        System.out.println("Total words: " + words.length);

        // Optional: print words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
