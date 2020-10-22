package org.example;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        CA ca = new CA();
        ca.test();
    }

}
class CA{
    boolean i;
    public void test(){
        System.out.println(i);
    }
}
