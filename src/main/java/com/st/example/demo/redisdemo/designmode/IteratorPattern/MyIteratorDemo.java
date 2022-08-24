package com.st.example.demo.redisdemo.designmode.IteratorPattern;

public class MyIteratorDemo {


    public static void main(String[] args) {
         String names[] = {"Robert" , "John" ,"Julie" , "Lora"};


        NameIterator nameIterator = new NameIterator(names);


        boolean b = nameIterator.hasNext();
        System.out.println(b);

        while (nameIterator.hasNext()){
            System.out.println(nameIterator.next());
        }



    }


}
