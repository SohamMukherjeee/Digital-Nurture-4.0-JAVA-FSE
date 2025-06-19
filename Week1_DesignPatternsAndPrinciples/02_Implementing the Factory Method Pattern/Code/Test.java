public class Test {
    public static void main(String[] args) {
        System.out.println("----------Implementation of Factory Method----------");
        
        DocumentFactory wordFactory=new WordDocumentFactory();
        DocumentDefine WORD=wordFactory.createDocument();
        WORD.open();
        WORD.close();

        System.out.println("----------------------------------------------------");
        DocumentFactory pdfFactory=new PdfDocument_Factory();
        DocumentDefine PDF=pdfFactory.createDocument();
        PDF.open();
        PDF.close();  

        System.out.println("----------------------------------------------------");
        DocumentFactory excelFactory=new PdfDocument_Factory();
        DocumentDefine EXCEL=excelFactory.createDocument();
        EXCEL.open();
        EXCEL.close();  

    }

}
