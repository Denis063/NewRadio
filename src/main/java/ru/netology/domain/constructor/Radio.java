package ru.netology.domain.constructor;

public class Radio {
    private final int maxRadioChannel = 9; //Максимальный канал
    private final int minRadioChannel = 0; //Минимальный канал
    private int currentRadioChannel; //Текущее положение радиоканала
    private int minVolume = 0; //Минимальный уровень звука
    private int maxVolume = 100;  //Максимальный уровень звука
    private int currentVolume; //Текущее положение звука

    // All args constructor
    public Radio(int currentRadioChannel,
                 int currentVolume) {
        this.currentRadioChannel = currentRadioChannel;
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }

    public int getCurrentRadioChannel() {
        return currentRadioChannel;
    }

    public void setCurrentRadioChannel(int currentRadioChannel) {
        if (currentRadioChannel > maxRadioChannel) {
            return;
        }
        if (currentRadioChannel < minRadioChannel) {
            return;
        }
        this.currentRadioChannel = currentRadioChannel;
    }

    public void nextCurrentRadioChannel() {
        int currentRadioChannel = this.currentRadioChannel;
        if (currentRadioChannel >= maxRadioChannel) {
            this.currentRadioChannel = minRadioChannel;
        } else {
            this.currentRadioChannel = currentRadioChannel + 1;
        }
    }

    public void prevCurrentRadioChannel() {
        int currentRadioChannel = this.currentRadioChannel;
        if (currentRadioChannel <= minRadioChannel) {
            this.currentRadioChannel = maxRadioChannel;
        } else {
            this.currentRadioChannel = currentRadioChannel - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }

    public void nextCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}