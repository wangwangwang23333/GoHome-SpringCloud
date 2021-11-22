package cn.edu.tongji.gohome.login.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * HostEntity: JPA 自动生成
 *
 * @author 卓正一
 * @since  2021/11/19 6:47 PM
 */
@Entity
@Table(name = "host", schema = "GoHome", catalog = "")
public class HostEntity {
    private int hostId;
    private Timestamp hostCreateTime;
    private String hostResidentId;
    private String hostRealName;
    private int hostScore;
    private int hostState;

    @Id
    @Column(name = "host_id")
    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    @Basic
    @Column(name = "host_create_time")
    public Timestamp getHostCreateTime() {
        return hostCreateTime;
    }

    public void setHostCreateTime(Timestamp hostCreateTime) {
        this.hostCreateTime = hostCreateTime;
    }

    @Basic
    @Column(name = "host_resident_id")
    public String getHostResidentId() {
        return hostResidentId;
    }

    public void setHostResidentId(String hostResidentId) {
        this.hostResidentId = hostResidentId;
    }

    @Basic
    @Column(name = "host_real_name")
    public String getHostRealName() {
        return hostRealName;
    }

    public void setHostRealName(String hostRealName) {
        this.hostRealName = hostRealName;
    }

    @Basic
    @Column(name = "host_score")
    public int getHostScore() {
        return hostScore;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    @Basic
    @Column(name = "host_state")
    public int getHostState() {
        return hostState;
    }

    public void setHostState(int hostState) {
        this.hostState = hostState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HostEntity that = (HostEntity) o;
        return hostId == that.hostId && hostScore == that.hostScore && hostState == that.hostState && Objects.equals(hostCreateTime, that.hostCreateTime) && Objects.equals(hostResidentId, that.hostResidentId) && Objects.equals(hostRealName, that.hostRealName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostCreateTime, hostResidentId, hostRealName, hostScore, hostState);
    }
}