package com.alibi.tasktracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class TaskStateDto {

    Long id;

    String name;

    Long ordinal;

    @JsonProperty("created_at")
    Instant createdAt;
}