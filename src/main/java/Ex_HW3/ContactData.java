package Ex_HW3;


public class ContactData {

/**
 * Этот класс содержит данные контактов и метод создания контакта из подготовленных данных в noteWriter
  */

    private String firstName;
    private String lastName;
    private String patronName;
    private String birthDay;
    private String phoneNumber;
    private char sexIndex;

    public ContactData(String firstName, String lastName, String patronName, String birthDay, String phoneNumber, char sexIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronName = patronName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.sexIndex = sexIndex;
    }

    public ContactData (NoteWriter noteWriter) {            //данные в noteWriter уже проверены. просто переписываем из массива в нужные поля
        this.firstName = noteWriter.getSplitData()[1];
        this.lastName = noteWriter.getSplitData()[0];
        this.patronName = noteWriter.getSplitData()[2];
        this.birthDay = noteWriter.getSplitData()[3];
        this.phoneNumber = noteWriter.getSplitData()[4];
        this.sexIndex = noteWriter.getSplitData()[5].charAt(0);

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronName() {
        return patronName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public char getSexIndex() {
        return sexIndex;
    }

    @Override
    public String toString() {
        return
                '<' + lastName + '>' +
                '<' + firstName + '>' +
                '<' + patronName + '>' +
                '<' + birthDay + '>' +
                '<' + phoneNumber + '>' +
                '<' + sexIndex + '>';
    }
}
