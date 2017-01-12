/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BE;

import java.io.Serializable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author IAMLUX
 */
public class Team implements Serializable {

    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final IntegerProperty points = new SimpleIntegerProperty();
    private final IntegerProperty goalsScored = new SimpleIntegerProperty();
    private final IntegerProperty goalsRecieved = new SimpleIntegerProperty();
    private final IntegerProperty matchesPlayed = new SimpleIntegerProperty();
    private final IntegerProperty wins = new SimpleIntegerProperty();
    private final IntegerProperty draws = new SimpleIntegerProperty();
    private final IntegerProperty losses = new SimpleIntegerProperty();

    /**
     * Contructor for Team class.
     *
     * @param name
     * @param points
     * @param goalsScored
     * @param goalsRecieved
     * @param matchesPlayed
     * @param wins
     * @param draws
     * @param losses
     */
    public Team(String name, int points, int goalsScored, int goalsRecieved, int matchesPlayed, int wins, int draws, int losses) {
        this.name.set(name);
        this.points.set(points);
        this.goalsScored.set(goalsScored);
        this.goalsRecieved.set(goalsRecieved);
        this.matchesPlayed.set(matchesPlayed);
        this.wins.set(wins);
        this.draws.set(draws);
        this.losses.set(losses);
    }

    /**
     * All the getters and setters for the Team class.
     *
     */
    //Get the Name.
    public String getName() {
        return name.get();
    }

    //Set the Name.
    public void setName(String value) {
        name.set(value);
    }

    //From String to StringProperty.
    public StringProperty nameProperty() {
        return name;
    }

    //Get the TeamID.
    public int getId() {
        return id.get();
    }

    //Sets the TeamID.
    public void setId(int value) {
        id.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty idProperty() {
        return id;
    }

    //Gets the Points.
    public int getPoints() {
        return points.get();
    }

    //Sets the Points.
    public void setPoints(int value) {
        points.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty pointsProperty() {
        return points;
    }

    //Gets the Goals Scored.
    public int getGoalsScored() {
        return goalsScored.get();
    }

    //Sets the Goals Scored.
    public void setGoalsScored(int value) {
        goalsScored.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty goalsScoredProperty() {
        return goalsScored;
    }

    //Gets the Goals Scored.
    public int getGoalsRecieved() {
        return goalsRecieved.get();
    }

    //Sets the Goals Recieved.
    public void setGoalsRecieved(int value) {
        goalsRecieved.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty goalsRecievedProperty() {
        return goalsRecieved;
    }

    //Gets the Matches Played.
    public int getMatchesPlayed() {
        return matchesPlayed.get();
    }

    //Sets the Matches Played.
    public void setMatchesPlayed(int value) {
        matchesPlayed.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty matchesPlayedProperty() {
        return matchesPlayed;
    }

    //Get the number of Wins.
    public int getWins() {
        return wins.get();
    }

    //Sets the number of Wins.
    public void setWins(int value) {
        wins.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty winsProperty() {
        return wins;
    }

    //Gets the number of Draws.
    public int getDraws() {
        return draws.get();
    }

    //Sets the number of Draws.
    public void setDraws(int value) {
        draws.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty drawsProperty() {
        return draws;
    }

    //Gets the number of Losses.
    public int getLosses() {
        return losses.get();
    }

    //Sets the number Losses.
    public void setLosses(int value) {
        losses.set(value);
    }

    //From Integer to IntegerProperty.
    public IntegerProperty lossesProperty() {
        return losses;
    }

}
