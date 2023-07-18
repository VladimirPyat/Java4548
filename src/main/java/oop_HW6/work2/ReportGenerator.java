package oop_HW6.work2;

public interface ReportGenerator extends ReportGeneratorXml, ReportGeneratorJson {
    String generateXml();
    String generateJson();
}
