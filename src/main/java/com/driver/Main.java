package com.driver;

public class Main {
    int a  = 0;
    public static class A {
        public A() {
        }

        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public B() {
        }

        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
  public static void main(String args[]) {
      B b = new B();
      System.out.println(b.meth());
  }
}