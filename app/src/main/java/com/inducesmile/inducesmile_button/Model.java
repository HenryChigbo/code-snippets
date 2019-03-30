package com.inducesmile.inducesmile_button;

public class Model {

    private String text;
    private boolean isChecked;

    public Model() {
    }

    public Model(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
