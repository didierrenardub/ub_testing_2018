package ar.edu.ub.testing2017;

public class CCWPlayer
{
    public CCWPlayer(String playerName, CConsoleWarrior warrior)
    {
        this.m_playerName = playerName;
        this.m_warrior = warrior;
    }
    
    public CConsoleWarrior warrior()
    {
        return this.m_warrior;
    }
    
    public String playerName()
    {
        return this.m_playerName;
    }
    
    public int points()
    {
        return this.m_points;
    }
    
    public void win(int points)
    {
        this.m_points += points;
    }
    
    public void draw()
    {
        this.m_points += 1;
    }
    
    private String m_playerName;
    private CConsoleWarrior m_warrior;
    private int m_points;
}
