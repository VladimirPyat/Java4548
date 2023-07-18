package oop_HW6.Work3;

// тут был нарушен принцип единственной ответственности, ну и отчасти открытости/закрытости в части
// выделил отдельный класс GreetType, куда перенес возможные варианты приветствий.
// плюс получилось более гибкое решение. если добавить в GreetType метод add - моно добавлять приветствия не меняя кода


public class Greeter {
    public String greeting;
    private String formality;
    private GreetType greetType;
    private String defaultFormality="Hello.";

    public Greeter(String formality) {
        greetType = new GreetType();
        this.formality = formality;
        this.greeting = greetType.getValue(defaultFormality);
    }

    public void setFormality(String newFormality) {
        this.formality = newFormality;
    }

    public String getGreeting(String formality) {
        this.greeting = greetType.hasValue(formality) ? greetType.getValue(formality) : greetType.getValue(defaultFormality);
        return greeting;
    }
}



