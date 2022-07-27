package com.example.gametime.firebase;

import com.example.gametime.model.Event;
import com.example.gametime.model.Venue;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Specifies all methods needed for admin interaction
 * @author Nathan Wong
 */
public abstract class FirebaseAdminBehavior extends FirebaseCustomerBehavior {
    public FirebaseAdminBehavior(FirebaseDatabase db) {
        super(db);
    }

    public abstract void addVenue(Venue venue) throws GTFirebaseException;
    public abstract void removeVenue(Venue venue);
    public abstract void removeEvent(Venue venue, Event event);
}