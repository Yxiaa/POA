package fr.p10.miage.rps.model;

import java.util.HashMap;
import java.util.Map;

public enum RPSEnum {

    ROCK(1), PAPER(2), SCISSORS(3);

    private int legNo;

    private static Map<Integer, RPSEnum> map = new HashMap<Integer, RPSEnum>();

    static {
        for (RPSEnum legEnum : RPSEnum.values()) {
            map.put(legEnum.legNo, legEnum);
        }
    }

    private RPSEnum(final int leg) { legNo = leg; }

    public static RPSEnum valueOf(int legNo) {
        return map.get(legNo);
    }

}
