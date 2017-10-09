package fr.p10.miage.rps.model;

public class RockPaperScissors {

    public RockPaperScissors() {


    }

    public Result play(RPSEnum p1, RPSEnum p2) {

        if(p1.equals(p2))
            return Result.TIE;
        else if((p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.SCISSORS)))
            return Result.LOST;
        else
        return Result.WIN;
    }
}
