package ru.model;

import javax.persistence.*;

@Entity
@Table(name = "completed_test")
public class CompletedTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "id_test")
    private long idCompletedTest;

    @Column(name = "id_user")
    private long idCompletedUser;

    @Column(name = "percent")
    private double percent;

    public CompletedTest() {
    }

    public CompletedTest(long idCompletedTest, long idCompletedUser, double percent) {
        this.idCompletedTest = idCompletedTest;
        this.idCompletedUser = idCompletedUser;
        this.percent = percent;
    }

    public long getIdCompletedTest() {
        return idCompletedTest;
    }

    public void setIdCompletedTest(long idCompletedTest) {
        this.idCompletedTest = idCompletedTest;
    }

    public long getIdCompletedUser() {
        return idCompletedUser;
    }

    public void setIdCompletedUser(long idCompletedUser) {
        this.idCompletedUser = idCompletedUser;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
