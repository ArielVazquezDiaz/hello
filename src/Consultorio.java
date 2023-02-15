public class Consultorio {
    private String name;
    private String type;
    private boolean scale;
    private boolean OfficialDocumentation;
    private boolean MedicalRecords;

    public boolean getMedicalRecords() {
        return MedicalRecords;
    }
    public void setMedicalRecords() {
        this.MedicalRecords = MedicalRecords;
    }
    public boolean getOfficialDocumentation() {
        return OfficialDocumentation;
    }
    public void setOfficialDocumentation() {
        this.OfficialDocumentation = OfficialDocumentation;
    }
    public boolean getScale() {
        return scale;
    }
    public void setScale() {
        this.scale = scale;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
