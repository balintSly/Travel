package travel.persistence;

import travel.domain.Destination;
import travel.domain.Review;
import travel.domain.Trip;
import travel.domain.User;

import java.util.List;

public class FileDataStore implements DataStore {
    private String basePath;
    private List<Destination> destinations;
    private List<User> users;
    private List<Trip> trips;
    private List<Review> reviews;

    public FileDataStore(String basePath) {
        this.basePath = basePath;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void saveData() {

    }

    @Override
    public List<Destination> getDestinations() {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public List<Trip> getTrips() {
        return null;
    }

    @Override
    public List<Review> getReviews() {
        return null;
    }
}
