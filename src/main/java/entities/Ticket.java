package entities;

import javax.persistence.*;

@Entity
@Table (name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;


    @ManyToOne
    @JoinColumn (name = "seatId")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn (name = "categoryId")
    private TicketCategory ticketCategory;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                '}';
    }
}
