package com.HackerRank;

public abstract class Abstract {
    abstract void display();
}
class Book extends Abstract{
    @Override
    void display(){
        System.out.println("This is a book");
    }
}
