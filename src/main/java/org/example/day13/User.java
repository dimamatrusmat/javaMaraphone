package org.example.day13;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscibe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscibed(User user) {

        for (User user1 : subscriptions) {
            if (user1 == user) {
                return true;
            }
        }

        return false;
    }

    public boolean isFriend(User user) {
        boolean isFriend = false;

        if (this.isSubscibed(user) == user.isSubscibed(this)) {
            isFriend = true;
        }

        return isFriend;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage (this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
