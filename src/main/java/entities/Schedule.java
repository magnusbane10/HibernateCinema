package entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int scheduleId;
    private Date startTime;

    @ManyToOne
    @JoinColumn (name = "movieId")
    private Movie movie;

    @ManyToOne
    @JoinColumn (name = "roomId")
    private Room room;

    @OneToMany(mappedBy = "schedule")
    private Set<Reservation> reservations = new HashSet<Reservation>();

    @Override
    public String toString() {
        return "Schedule{" +
                "schedulesId=" + scheduleId +
                ", startTime=" + startTime +
                '}';
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
