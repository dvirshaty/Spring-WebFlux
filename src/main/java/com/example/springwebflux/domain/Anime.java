package com.example.springwebflux.domain;

import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("anime")
public class Anime {

    @Id
    private Integer id;


    @NotNull
    @NotEmpty(message = "name can't be empty")
    private String name;
}
