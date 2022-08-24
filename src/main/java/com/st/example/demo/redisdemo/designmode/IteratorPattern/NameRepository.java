package com.st.example.demo.redisdemo.designmode.IteratorPattern;

public class NameRepository  implements Container{


    @Override
    public MyIterator getIterator(String []  agrs) {
        return new NameIterator( agrs);
    }



}
