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
     * Contructor for Team class with the name parameter.
     *
     * @param name
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
    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getId() {
        return id.get();
    }

    public void setId(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public int getPoints() {
        return points.get();
    }

    public void setPoints(int value) {
        points.set(value);
    }

    public IntegerProperty pointsProperty() {
        return points;
    }

    public int getGoalsScored() {
        return goalsScored.get();
    }

    public void setGoalsScored(int value) {
        goalsScored.set(value);
    }

    public IntegerProperty goalsScoredProperty() {
        return goalsScored;
    }

    public int getGoalsRecieved() {
        return goalsRecieved.get();
    }

    public void setGoalsRecieved(int value) {
        goalsRecieved.set(value);
    }

    public IntegerProperty goalsRecievedProperty() {
        return goalsRecieved;
    }

    public int getMatchesPlayed() {
        return matchesPlayed.get();
    }

    public void setMatchesPlayed(int value) {
        matchesPlayed.set(value);
    }

    public IntegerProperty matchesPlayedProperty() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins.get();
    }

    public void setWins(int value) {
        wins.set(value);
    }

    public IntegerProperty winsProperty() {
        return wins;
    }

    public int getDraws() {
        return draws.get();
    }

    public void setDraws(int value) {
        draws.set(value);
    }

    public IntegerProperty drawsProperty() {
        return draws;
    }

    public int getLosses() {
        return losses.get();
    }

    public void setLosses(int value) {
        losses.set(value);
    }

    public IntegerProperty lossesProperty() {
        return losses;
    }

}
