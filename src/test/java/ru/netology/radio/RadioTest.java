package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тесты на переключение громкости радио

    @Test
    public void shouldIncreaseCurrentVolumeAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expectedVolume = 6;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldIncreaseCurrentVolumeAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expectedVolume = 10;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolumeAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expectedVolume = 4;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolumeBelow() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldAboveSetCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expectedVolume = 0;
        int actualVolume = station.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldAboveSetCurrent() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldBelowSetCurrent() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldToNextStationAverage() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.next();

        int expectedStation = 5;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToNextStationAbove() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();

        int expectedStation = 0;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationAverage() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.prev();

        int expectedStation = 3;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationBelow() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();

        int expectedStation = 9;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldBelowSetCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expectedVolume = 0;
        int actualVolume = station.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }
}
