package ar.edu.ub.testing2017;

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
