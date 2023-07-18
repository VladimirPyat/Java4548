package oop_HW6.work2;
//очевидно тут нарушен принцип разделения интерфейсов
//к тому же была совсем нехорошая ситуация, когда при попытке создания экземпляра класса мы получали ошибку
//старый интерфейс я не удалил. я так понимаю, что по концепции java все что один раз сделано уже не должно удаляться )

public class AccountReportGenerator implements ReportGeneratorJson {


    @Override
    public String generateJson() {
        String report = "";
        // todo Logic
        return report;
    }
}
