package ch19.ex12.coded;

import ch19.ex12.codeb.RoShambo;
import lib.utils.ICompetitor;
import lib.utils.Outcome;

import java.util.EnumMap;

import static lib.utils.Outcome.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public enum RoShamBo5 implements ICompetitor<RoShamBo5>{
    PAPER,SCISSORS, ROCK;
    static EnumMap<RoShamBo5,EnumMap<RoShamBo5,Outcome>> map = new EnumMap(RoShamBo5.class); // ключи взяли из Enum
    static {
        for (RoShamBo5 roShamBo5 : RoShamBo5.values()) {  // прогнать все элементы PAPER, SCISSORS, ROCK
            map.put(roShamBo5, new EnumMap<RoShamBo5, Outcome>(RoShamBo5.class));  // заполнить каждый компонент картой
        }
        initRow(PAPER, DRAW, LOSE, WIN);
        initRow(SCISSORS, WIN, DRAW, LOSE);
        initRow(ROCK, LOSE, WIN, DRAW);
    }
    private static void initRow(RoShamBo5 item, Outcome vPaper, Outcome vScissors, Outcome vRock) {
        EnumMap<RoShamBo5,Outcome> rMap = map.get(item); // получить карту выбора
        rMap.put(PAPER,vPaper);
        rMap.put(SCISSORS,vScissors);
        rMap.put(ROCK,vRock);
    }

    @Override
    public Outcome compete(RoShamBo5 item) { // двойная диспетчеризация
        return map.get(this).get(item); // вытаскиваем карту this и из нее значение для item
    }

    public static void check() {
        RoShambo.play(RoShamBo5.class,20);
    }
}
