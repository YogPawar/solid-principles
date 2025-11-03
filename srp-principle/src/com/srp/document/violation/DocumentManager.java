package com.srp.document.violation;

public class DocumentManager {

  public void createDocument(String content) {
    System.out.println("Document created with content : " + content);

  }

  public void exportToPdf(String document) {
    System.out.println("Exporting document into pdf");
  }

}
