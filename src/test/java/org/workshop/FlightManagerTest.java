package org.workshop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FlightManagerTest {

    @Test
    public void should_provide_available_seats() throws Exception {
        //given
        FlightManager manager = new FlightManager();
        manager.addFlight("AA101", 10);

        //when
        int seats = manager.getAvailableSeats("AA101");

        //then
        assertEquals(10, seats);
    }

    @Test
    public void should_fail_when_flight_not_found() throws Exception {
    }
}