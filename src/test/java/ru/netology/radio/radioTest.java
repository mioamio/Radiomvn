package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class radioTest {

    @Test
    public void shouldIncreaseCurrentVolumeAverage() {
        radio radio = new radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expectedVolume = 6;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldIncreaseCurrentVolumeAbove() {
        radio radio = new radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expectedVolume = 10;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolumeAverage() {
        radio radio = new radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expectedVolume = 4;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolumeBelow() {
        radio radio = new radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldAboveSetCurrent() {
        radio radio = new radio();
        radio.setCurrentVolume(11);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldBelowSetCurrent() {
        radio radio = new radio();
        radio.setCurrentVolume(-1);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }


    @Test
    public void shouldToNextStationAverage() {
        radio station = new radio();
        station.setCurrentStation(4);
        station.next();

        int expectedStation = 5;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToNextStationAbove() {
        radio station = new radio();
        station.setCurrentStation(9);
        station.next();

        int expectedStation = 0;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationAverage() {
        radio station = new radio();
        station.setCurrentStation(4);
        station.prev();

        int expectedStation = 3;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationBelow() {
        radio station = new radio();
        station.setCurrentStation(0);
        station.prev();

        int expectedStation = 9;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldAboveSetCurrentStation() {
        radio station = new radio();
        station.setCurrentStation(10);

        int expectedVolume = 0;
        int actualVolume = station.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldBelowSetCurrentStation() {
        radio station = new radio();
        station.setCurrentStation(-1);

        int expectedVolume = 0;
        int actualVolume = station.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }
}
