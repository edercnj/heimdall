package com.br.pantheon.heimdall.entity;

public interface Door {

    void open();

    void close();

    boolean lock(Key key);

    boolean unlock(Key key);
}
