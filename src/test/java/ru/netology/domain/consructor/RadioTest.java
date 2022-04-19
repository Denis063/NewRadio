package ru.netology.domain.consructor;

import org.junit.jupiter.api.Test;
import ru.netology.domain.constructor.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldRadioChannelNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(1);
        assertEquals(1, radio.getCurrentRadioChannel());
    }

    @Test   // Тест переключения следующего радиоканала
    public void shouldNextRadioChannel() {
        Radio radio = new Radio(
                5,
                20);
        radio.setCurrentRadioChannel(5);
        radio.nextCurrentRadioChannel();
        assertEquals(6, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения предыдущего радиоканала
    public void shouldPrevRadioChannel() {
        Radio radio = new Radio(
                4,
                10);
        radio.setCurrentRadioChannel(4);
        radio.prevCurrentRadioChannel();
        assertEquals(3, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения радиоканала с 9 на 0
    public void shouldNextMaxRadioChannel() {
        Radio radio = new Radio(
                9,
                12);
        radio.setCurrentRadioChannel(9);
        radio.nextCurrentRadioChannel();
        assertEquals(0, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения радиоканала с 0 на 9
    public void shouldPrevMinRadioChannel() {
        Radio radio = new Radio(
                0,
                12);
        radio.setCurrentRadioChannel(0);
        radio.prevCurrentRadioChannel();
        assertEquals(9, radio.getCurrentRadioChannel());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMaxRadioChannel() {
        Radio radio = new Radio(
                9,
                15);
        radio.setCurrentRadioChannel(10);
        assertEquals(9, radio.getCurrentRadioChannel());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMinRadioChannel() {
        Radio radio = new Radio(
                0,
                7);
        radio.setCurrentRadioChannel(-1);
        assertEquals(0, radio.getCurrentRadioChannel());
    }

    @Test
    void shoulVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test // Тест увеличения громкости звука (+)
    public void shouldNextVolume() {
        Radio radio = new Radio(
                10,
                5);
        radio.nextCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test // Тест уменьшения громкости звука (-)
    public void shoulPrevVolume() {
        Radio radio = new Radio(
                5,
                6);
        radio.prevCurrentVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test // Тест max громкость звука
    public void shouldMaxVolume() {
        Radio radio = new Radio(
                1,
                78);
        radio.setMaxVolume(100);
        assertEquals(78, radio.getCurrentVolume());
    }

    @Test // Тест min громкость звука
    public void shouldMinVolume() {
        Radio radio = new Radio(
                3,
                43);
        radio.setMinVolume(0);
        assertEquals(43, radio.getCurrentVolume());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMaxVolume() {
        Radio radio = new Radio(
                5,
                69);
        radio.setCurrentVolume(101);
        radio.nextCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test // Тест граничных значений
    public void shouldBoundaryMinVolume() {
        Radio radio = new Radio(
                7,
                45);
        radio.setCurrentVolume(-1);
        radio.prevCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}