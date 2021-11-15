package com.unilabs.sampleschedule.enums;

import com.unilabs.sampleschedule.model.entity.DayOfWeek;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DayOfWeekEnum {
    SEGUNDA(1L, "SEGUNDA"),
    TERCA(2L, "TERÇA"),
    QUARTA(3L, "QUARTA"),
    QUINTA(4L, "QUINTA"),
    SEXTA(5L, "SEXTA");

    private final Long value;
    private final String description;

    public static DayOfWeekEnum toEnum(String day) {
        for (DayOfWeekEnum dayOfWeekEnum : DayOfWeekEnum.values()) {
            if(dayOfWeekEnum.getDescription().equalsIgnoreCase(day)) {
                return dayOfWeekEnum;
            }
        }
        throw new IllegalArgumentException("Erro ao realizar conversão do enum");
    }
}
