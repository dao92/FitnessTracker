package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.Date;

@ToString
@NoArgsConstructor
@Getter
@Table(name = "health_metrics")
@Entity
// TODO: Define the Event entity with appropriate fields and annotations
public class HealthMetrics {

    @Id
    private Long id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private int height;

    @Column(name = "heart_rate")
    private int heartRate;
}
