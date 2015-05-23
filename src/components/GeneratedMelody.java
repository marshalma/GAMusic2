package components;

import components.Duration;
import components.Note;

import java.util.List;

/*
 * GAMusic
 */
public class GeneratedMelody {
    private double fitnessValue;
    private List<Note> melody;
    private List<Duration> noteDurations;

    public GeneratedMelody(double fitnessValue, List<Note> melody, List<Duration> noteDurations) {
        this.fitnessValue = fitnessValue;
        this.melody = melody;
        this.noteDurations = noteDurations;
    }

    public double getFitnessValue() {
        return fitnessValue;
    }

    public List<Note> getMelody() {
        return melody;
    }

    public List<Duration> getNoteDurations() {
        return noteDurations;
    }
}
