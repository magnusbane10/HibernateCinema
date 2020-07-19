package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "ticketCategories")
public class TicketCategory {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int ticketCategoryId;
    private String type;
    private int price;

    @OneToMany (mappedBy = "ticketCategory")
    private Set<Ticket> tickets = new HashSet<Ticket>();

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketCategories{" +
                "ticketCategory=" + ticketCategoryId +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
