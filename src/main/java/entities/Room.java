package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int roomId;
    private int number;
    private int maxSeats;
    private String location;

    @OneToMany(mappedBy = "room")
    private Set<Schedule> schedules = new HashSet<Schedule>();

    @OneToMany(mappedBy = "room")
    private Set<Seat> seats = new HashSet<Seat>();


    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", number=" + number +
                ", maxSeats=" + maxSeats +
                ", location='" + location + '\'' +
                '}';
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
