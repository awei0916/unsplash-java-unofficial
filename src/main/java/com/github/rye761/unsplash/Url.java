package com.github.rye761.unsplash;

public class Url {
    public final String raw;
    public final String full;
    public final String regular;
    public final String small;
    public final String medium;
    public final String large;
    public final String thumb;
    public final String custom;
    
    public Url(String raw,
            String full,
            String regular,
            String small,
            String medium,
            String large,
            String thumb,
            String custom) {
        this.raw = raw;
        this.full = full;
        this.regular = regular;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.thumb = thumb;
        this.custom = custom;
    }
}
