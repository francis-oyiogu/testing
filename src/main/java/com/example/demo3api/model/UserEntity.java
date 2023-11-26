package com.example.demo3api.model;

import com.example.demo3api.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity extends BaseModel{

     @Column(nullable = false)
     String name;
     String email;
     @Enumerated(EnumType.STRING)
     Gender gender;
     String password;

}
