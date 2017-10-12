package fr.p10.miage.rps.model;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() throws Exception {
        rps = null;
    }

    @Parameters ({ "paper" ,"rock" })
    @Test
    void testWinPlay(String p1, String p2) {

        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);

    }

    @Parameters ({ "paper" ,"paper" })
    @Test
    void testTiePlay(String p1, String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters ({ "paper" ,"scissors" })
    @Test
    void testLostPlay(String p1, String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @DataProvider(name="winData")
    public Object [][] createWinData() {
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS, RPSEnum.PAPER},
                {RPSEnum.PAPER, RPSEnum.ROCK}
        };
    }

    @DataProvider(name="lostData")
    public Object [][] createLostData() {
        return new Object[][] {
                {RPSEnum.PAPER, RPSEnum.SCISSORS},
                {RPSEnum.ROCK, RPSEnum.PAPER},
                {RPSEnum.SCISSORS, RPSEnum.ROCK}
        };
    }

    @DataProvider(name="tieData")
    public Object [][] createTieData() {
        return new Object[][] {
                {RPSEnum.PAPER, RPSEnum.PAPER},
                {RPSEnum.ROCK, RPSEnum.ROCK},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS}
        };
    }



    @Test(dataProvider = "winData")
    void testWinPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1, p2), Result.WIN);
    }

    @Test(dataProvider = "tieData")
    void testTiePlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1, p2), Result.TIE);
    }

    @Test(dataProvider = "lostData")
    void testLostPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1, p2), Result.LOST);
    }

}