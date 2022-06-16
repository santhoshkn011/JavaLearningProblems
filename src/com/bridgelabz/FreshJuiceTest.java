package com.bridgelabz;

class FreshJuice {

    /*Enums restrict a variable to have one of only a few predefined values. The
    values in this enumerated list are called enums. */
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;

    /* Enums can be declared as their own or inside a class. Methods, variables, constructors can be defined inside
enums as well. */
}

public class FreshJuiceTest {
    public static void main(String args[]){
        FreshJuice juice = new FreshJuice(); //creating object juice
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);
    }
}
