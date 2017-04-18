package ch19.ex01.codec;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    @Override
    public String toString() {
        char chStart = name().charAt(0);
        String lower = name().substring(1,name().length()-1);
        char chEnd = name().charAt(name().length()-1);
        return chStart+lower.toLowerCase()+chEnd;
    }
}
