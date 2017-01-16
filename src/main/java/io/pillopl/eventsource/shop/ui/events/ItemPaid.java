package io.pillopl.eventsource.shop.ui.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPaid implements Event {

    public static final String TYPE = "item.paid";

    private UUID uuid;
    private Instant when;
    private Integer version;

    @Override
    public Integer version() {
        return version;
    }
    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public Instant when() {
        return when;
    }

    @Override
    public UUID uuid() {
        return uuid;
    }
}
