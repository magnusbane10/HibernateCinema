package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "seats")
public class Seat {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int seatId;
    private int row;
    private int number;

    @ManyToMany (mappedBy = "seats")
    private Set<Reservation> reservations = new HashSet<Reservation>();

    @ManyToOne
    @JoinColumn (name = "roomId")
    private Room room;

    @OneToMany(mappedBy = "ticket")
    private Set<Ticket> tickets = new HashSet<Ticket>();

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatId=" + seatId +
                ", row=" + row +
                ", number=" + number +
                '}';
    }
}
