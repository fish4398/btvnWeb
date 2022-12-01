package QLTuyenSinh;

public class NormalStudent {
    private float englishScore;
    private float entryTestScore;

    public NormalStudent(float englishScore, float entryTestScore) {
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public float getEnglishScore() {
        return this.englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return this.entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                '}';
    }
}
