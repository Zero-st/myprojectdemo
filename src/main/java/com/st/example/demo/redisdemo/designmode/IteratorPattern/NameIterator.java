package com.st.example.demo.redisdemo.designmode.IteratorPattern;

public class NameIterator  implements MyIterator{
    String [] args;
    int index =0;

    public NameIterator(String[] params_args) {
        this.args = params_args;
    }

    public NameIterator() {

    }

    @Override
    public boolean hasNext() {

        if(index<args.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if(index<args.length){
            return  args[index++];
        }
         return  args;
    }
}
