package com.iotek;

public class test {
    public static void main(String[] args) {
        A aa = new A();
        aa.setName("tom");
        A bb = aa;
        System.out.println(aa.getName());
        bb.setName("000");
        System.out.println(bb.getName());
        System.out.println(000000);
    }
}