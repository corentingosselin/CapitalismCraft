package fr.cocoraid.capitalismcraft.wanted;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WantedPlayer {

    private List<UUID> acceptedBy = new ArrayList<>();
    private List<UUID> banned = new ArrayList<>();
    private int price;
    private long start;
    private long end;
    private UUID wantedUUID;
    private UUID wanterUUID;
    private int id;
    private int day;


    public WantedPlayer(int id,UUID wanterUUID, UUID wantedUUID, long start, int day, int price) {
        this.price = price;
        this.start = start;
        this.end =  start + (day * 1000 * 60 * 60 * 24);;
        this.wantedUUID = wantedUUID;
        this.wanterUUID = wanterUUID;
        this.id = id;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setAcceptedBy(List<UUID> acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public void setBanned(List<UUID> banned) {
        this.banned = banned;
    }

    public List<UUID> getBanned() {
        return banned;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDayLeft() {
        return day;
    }

    public UUID getWantedUUID() {
        return wantedUUID;
    }

    public UUID getWanterUUID() {
        return wanterUUID;
    }

    public long getStart() {
        return start;
    }

    public int getPrice() {
        return price;
    }

    public List<UUID> getAcceptedBy() {
        return acceptedBy;
    }

    public long getEnd() {
        return end;
    }
}

