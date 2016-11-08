package com.github.gomi.protobuf;

import java.io.IOException;

public class Main {

    public static void main(final String[] args) {
        final UserOuterClass.User user = UserOuterClass.User.newBuilder()
                .setId("1")
                .setName("Kikuko Inoue")
                .setAge(17)
                .build();
        byteArray(user);
    }

    private static void byteArray(final UserOuterClass.User user) {
        byte[] b = user.toByteArray();
        try {
            final UserOuterClass.User u = UserOuterClass.User.parseFrom(b);
            System.out.println("user: " + u);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

}
