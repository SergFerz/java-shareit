package ru.practicum.shareit.booking.dto;

import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.model.User;

import java.time.LocalDate;

@Value
public class BookingDto {

    long id;
    LocalDate start;
    LocalDate end;
    Item item;
    User booker;
    @NonFinal
    @Setter
    String status;
}
