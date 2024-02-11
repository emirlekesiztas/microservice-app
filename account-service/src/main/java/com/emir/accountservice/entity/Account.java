package com.emir.accountservice.entity;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table(value = "accounts")
public class Account implements Serializable{

    @PrimaryKey
    private String id = UUID.randomUUID().toString();
    @Column(value = "username")
    private String userName;
    @Column(value = "email")
    private String email;
    @Column(value = "passwd")
    private String passwd;
    @Column(value = "create_date")
    private Date createdAt;
    @Column(value = "is_active")
    private Boolean active;
}
