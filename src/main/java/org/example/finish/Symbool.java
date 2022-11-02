package org.example.finish;

import com.vdurmont.emoji.EmojiParser;

public enum Symbool {
    SHIP("⛴", "Попал"), EMPTY("⬜", "Мимо"),
    OBD("🌊", "Мимо но близко"), KICK("✨", "Ты уже стрелял сюда");

    private String emj;
    private String text;

    private Boolean visible;
    private Symbool (String s, String text) {
        this.emj = s;
        this.text = text;
        this.visible = false;
    }

    public void toVisible() {
        visible = true;
    }

    public String getText() {
        return text;
    }
    public String getEmj() {
        if (visible) {
            return EmojiParser.parseToUnicode(emj);
        } else {
            return EMPTY.emj;
        }


    }
}
