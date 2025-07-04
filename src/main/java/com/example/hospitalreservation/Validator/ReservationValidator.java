package com.example.hospitalreservation.Validator;

import java.time.LocalTime;

public class ReservationValidator {
    private static final LocalTime START = LocalTime.of(9, 0);
    private static final LocalTime END = LocalTime.of(17, 0);

    public static boolean is(LocalTime time) {
        return !time.isBefore(START) && !time.isAfter(END.minusSeconds(1));
    }

}