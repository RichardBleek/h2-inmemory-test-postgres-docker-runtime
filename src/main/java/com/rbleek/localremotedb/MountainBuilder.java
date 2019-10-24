package com.rbleek.localremotedb;

public final class MountainBuilder {
    public String name;
    public Long height;

    private MountainBuilder() {
    }

    public static MountainBuilder aMountain() {
        return new MountainBuilder();
    }

    public MountainBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public MountainBuilder withHeight(Long height) {
        this.height = height;
        return this;
    }

    public Mountain build() {
        Mountain mountain = new Mountain();
        mountain.setName(name);
        mountain.setHeight(height);
        return mountain;
    }
}
