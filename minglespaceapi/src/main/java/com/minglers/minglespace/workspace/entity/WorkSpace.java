package com.minglers.minglespace.workspace.entity;

import com.minglers.minglespace.common.entity.Image;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "workspace")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class WorkSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String wsdesc;

    @ColumnDefault("false")
    private boolean delflag;

    private LocalDateTime deletedAt;

    private Long deletedByUserId;

    @OneToMany(mappedBy = "workSpace", fetch = FetchType.LAZY)
    private List<WSMember> workSpaceList;

    public void changeName(String name) {
        this.name = name;
    }
    public void changeWsdesc(String wsdesc) {
        this.wsdesc = wsdesc;
    }
    public void changeDelflag(boolean delflag) {
        this.delflag = delflag;
    }
    public void changeDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
    public void changeDeletedByUserId(Long deletedByUserId) {
        this.deletedByUserId = deletedByUserId;
    }
}