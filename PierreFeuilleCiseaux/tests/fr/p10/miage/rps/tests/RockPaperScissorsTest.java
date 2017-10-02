package fr.p10.miage.rps.tests;

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

    @Test
    public void testPlay() throws Exception {
    }

    @Parameters ({ "PAPER" ,"PAPER" })
    @Test
    void testWinPlay(String p1, String p2) {

        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);

    }

}