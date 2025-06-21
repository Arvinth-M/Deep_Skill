public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        System.out.println("Document Type: " + wordDoc.getType());
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        System.out.println("Document Type: " + pdfDoc.getType());
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        System.out.println();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        System.out.println("Document Type: " + excelDoc.getType());
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
