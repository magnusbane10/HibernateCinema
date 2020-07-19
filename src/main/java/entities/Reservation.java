package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationId;
    private int isPaid;

    @ManyToOne
    @JoinColumn (name = "scheduleId")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToMany
    @JoinTable (name = "reservation_seat",
            joinColumns = {@JoinColumn (name = "reservationId")},
            inverseJoinColumns = {@JoinColumn (name = "seatId")})
    private Set<Seat> seats = new HashSet<Seat>();

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", isPaid=" + isPaid +
                '}';
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(int isPaid) {
        this.isPaid = isPaid;
    }
}
