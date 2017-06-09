package ar.edu.ub.testing2017;

import ar.edu.ub.testing2017.ConsoleWarriors.CCWPlayer;
import ar.edu.ub.testing2017.ConsoleWarriors.CCWTournament;
import ar.edu.ub.testing2017.ConsoleWarriors.CConsoleWarriorBot;

public class CMain
{
    private CMain()
    {
    }

    private void consoleWarriorsTournament()
    {
        CCWTournament t = new CCWTournament(100);
        t.addPlayer(new CCWPlayer("Greiner", new CConsoleWarriorBot(t.maxAbility())));
        t.addPlayer(new CCWPlayer("Aguilera", new CConsoleWarriorBot("Optimus", t.maxAbility())));
        t.play();
    }

    public static void main(String[] args)
    {
        CMain app = new CMain();
        app.consoleWarriorsTournament();
    }
}
