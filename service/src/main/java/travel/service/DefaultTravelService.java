package travel.service;

import travel.domain.*;
import travel.persistence.DataStore;

import java.time.LocalDate;
import java.util.List;

public class DefaultTravelService implements TravelService {
    private User loggedInUser;
    private DataStore dataStore;

    public DefaultTravelService(DataStore dataStore) {
        this.dataStore=dataStore;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    @Override
    public User authenticateUser(Credentials credentials) {
        return null;
    }

    @Override
    public Statistics getStatistics() {
        return null;
    }

    @Override
    public List<Destination> getDestinations() {
        return null;
    }

    @Override
    public List<Review> getReviews(long attractionId) {
        return null;
    }

    @Override
    public void createAttraction(long destinationId, Attraction attraction) {

    }

    @Override
    public List<Trip> getTrips(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public void createTrip(Trip trip) {

    }
}
