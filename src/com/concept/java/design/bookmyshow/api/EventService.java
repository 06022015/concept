package com.concept.java.design.bookmyshow.api;

import com.concept.java.design.bookmyshow.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/11/17
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EventService {
    
    void save(Event event);

    List<Event>  getAllEvents();

    List<Event>  getEventsByType();
    
    Event getEventInfo(Long id);
    
    List<Event> getEvents(Map<String, String> filterParam);

    List<EventLocationShow> getCityEventLocation(Map<String,String> filterParam, String cityName);
    
    List<Review> getEventReview(Long eventId);

    List<Review> getEventReviewByCategory(Long eventId, String category);
    
    List<EventShowTime> getEventLocationShowTime(Long eventId, Long locationId);
    
    List<EventLocationShow>  getEventShowTime(Long eventId);

    List<String> getAvailableSeat(Long eventId, Long locationId, Long showTimeId);

    List<String> validateSelectedSeat(Long eventId, Long locationId, Long showTimeId, List<String> seats);

    boolean checkSeatAvailability(Long eventId, Long locationId, Long showTimeId);
    
    List<EventPrice> getEventPrice(Long eventId, Long locationId, Long showTimeId);

}
