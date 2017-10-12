package fr.p10.miage.rps.model;

public class RockPaperScissors {

    public RockPaperScissors() {


    }

    public Result play(RPSEnum p1, RPSEnum p2) {

        if(p1.equals(p2))
            return Result.TIE;
        else if((p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.SCISSORS))
                || (p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.PAPER))
                || (p1.equals(RPSEnum.SCISSORS) && p2.equals(RPSEnum.ROCK)))
            return Result.LOST;
        else
        return Result.WIN;
    }

    Result play(Player p1, Player p2) {

        for (int i = 0; i<Player.MOUVEMENT; i++)
        {

            Result res = this.play(p1.getNextMove(), p2.getNextMove());

            if(res.equals(Result.TIE))
            {
                p1.setScore(p1.getScore()+1);
                p2.setScore(p2.getScore()+1);
            }
            else if(res.equals(Result.WIN))
                p1.setScore(p1.getScore()+1);
            else
                p2.setScore(p2.getScore()+1);

        }

        if(p1.getScore()>p2.getScore())
            return Result.WIN;
        if(p1.getScore()==p2.getScore())
            return Result.TIE;
        else
            return Result.LOST;
    }

}
