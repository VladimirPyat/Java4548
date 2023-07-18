package oop_HW6.work1;
//в исходном варианте нарушен принцип инверсии зависимостей. одна фигура наследуется от другой
//добавил абстрактный класс, все наследования от него. вся логика осталась та же.

abstract class Tetragon {
    protected int height;
    protected int width;

    abstract void setHeight(int height);
    abstract void setWidth(int width);



}
