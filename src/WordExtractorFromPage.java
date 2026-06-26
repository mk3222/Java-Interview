import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

void main() throws Exception {
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
    IO.println("Total words: " + words.length);

    // Optional: print words
    for (String word : words) {
        IO.println(word);
    }
}
