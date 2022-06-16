/*
local variables should be declared and an initial value should be
assigned before the first use.
*/

package com.bridgelabz;

public class LocalVariable {
    public void pupAge(){
        int age = 0;        //age is a local variable and initial value assigned = 0.
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }
    public static void main(String args[]){
        LocalVariable test = new LocalVariable();
        test.pupAge();
    }
}
