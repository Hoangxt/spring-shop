package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tokens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token", length = 255)
    private String token;

    // ALTER TABLE tokens ADD COLUMN refresh_token VARCHAR(255) DEFAULT '';
    @Column(name = "refresh_token", length = 255)
    private String refreshToken;

    @Column(name = "token_type", length = 50)
    private String tokenType;

    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

    // ALTER TABLE tokens ADD COLUMN refresh_expiration_date DATETIME DEFAULT CURRENT_TIMESTAMP;
    @Column(name = "refresh_expiration_date")
    private LocalDateTime refreshExpirationDate;

    // ALTER TABLE tokens ADD COLUMN is_mobile TINYINT(1);
    @Column(name = "is_mobile", columnDefinition = "TINYINT(1)")
    private boolean isMobile;

    private boolean revoked;

    private boolean expired;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
