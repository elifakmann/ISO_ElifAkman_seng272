package model;

import java.util.ArrayList;

public class Scenario {

    private String scenarioName;
    private ModeType modeType;
    private QualityType qualityType;
    private ArrayList<Dimension> dimensions;

    public Scenario(String scenarioName,
                    ModeType modeType,
                    QualityType qualityType) {

        this.scenarioName = scenarioName;
        this.modeType = modeType;
        this.qualityType = qualityType;
        this.dimensions = new ArrayList<>();
    }

    public void addDimension(Dimension dimension) {
        dimensions.add(dimension);
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public ModeType getModeType() {
        return modeType;
    }

    public QualityType getQualityType() {
        return qualityType;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }
}