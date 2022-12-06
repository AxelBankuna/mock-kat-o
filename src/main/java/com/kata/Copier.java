package com.kata;

public class Copier implements ISource, IDestination {

    public String source;
    public String destination;

    public Copier(String source) {
        this.source = source;
        this.destination = "";
    }

    @Override
    public void writeChar(char c) {
        this.destination += c + "";
    }

    @Override
    public char readChar() {
        char buffer = this.source.charAt(0);
        this.source = this.source.substring(1);
        return buffer;
    }

    public void copy() {
        for (int i = 0; i < this.source.length() && this.source.charAt(0) != '\n'; i++) {
            this.writeChar(this.readChar());
        }
    }
}
