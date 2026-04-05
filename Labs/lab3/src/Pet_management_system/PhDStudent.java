package Pet_management_system;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    protected boolean canTakePet(Animal pet) {
        return !(pet instanceof Dog);
    }

    @Override
    public String getOccupation() {
        return "PhD Student in " + getMajor() + ", research: " + researchTopic;
    }
}
