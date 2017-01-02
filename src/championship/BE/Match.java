/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BE;

/**
 *
 * @author IAMLUX
 */
public class Match {

    private int homeTeamScore;
    private int guestTeamScore;
    private boolean isDraw;

    /**
     * All the getters and setters for the Match class.
     *
     */
    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getGuestTeamScore() {
        return guestTeamScore;
    }

    public void setGuestTeamScore(int guestTeamScore) {
        this.guestTeamScore = guestTeamScore;
    }

    public boolean isIsDraw() {
        return isDraw;
    }
}
