package lecture.week9.robodog;

public class performance {
    @Override
    public String toString() {
        return "performance{" +
                "gender: '" + gender + '\'' +
                ", parental_level_of_education: '" + parental_level_of_education + '\'' +
                ", math_score: " + math_score +
                ", reading_score: " + reading_score +
                ", writing_score: " + writing_score +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getParental_level_of_education() {
        return parental_level_of_education;
    }

    public void setParental_level_of_education(String parental_level_of_education) {
        this.parental_level_of_education = parental_level_of_education;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public int getReading_score() {
        return reading_score;
    }

    public void setReading_score(int reading_score) {
        this.reading_score = reading_score;
    }

    public int getWriting_score() {
        return writing_score;
    }

    public void setWriting_score(int writing_score) {
        this.writing_score = writing_score;
    }

    public performance(String gender, String parental_level_of_education, int math_score, int reading_score, int writing_score) {
        this.gender = gender;
        this.parental_level_of_education = parental_level_of_education;
        this.math_score = math_score;
        this.reading_score = reading_score;
        this.writing_score = writing_score;
    }

    String gender;
    String parental_level_of_education;
    int math_score;
    int reading_score;
    int writing_score;
}
