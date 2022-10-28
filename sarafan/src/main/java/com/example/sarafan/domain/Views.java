package com.example.sarafan.domain;

public final class Views {
    public interface Id {}

    public interface IdText extends Id {}

    public interface FullComment extends IdText {}

    public interface FullMessage extends IdText {}

    public interface FullProfile extends IdText {}
}
