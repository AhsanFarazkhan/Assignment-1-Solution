package StudyMaterialManagement;

public class StudyMaterial {
    private int materialId;
    private String title;
    private String description;
    private String fileType;
    private String fileUrl;
    private String uploadDate;
    private int fileSize;
    private int uploaderId;

    // Constructor, getters, and setters
    public StudyMaterial(int materialId, String title, String description, String fileType, String fileUrl, String uploadDate, int fileSize, int uploaderId) {
        this.materialId = materialId;
        this.title = title;
        this.description = description;
        this.fileType = fileType;
        this.fileUrl = fileUrl;
        this.uploadDate = uploadDate;
        this.fileSize = fileSize;
        this.uploaderId = uploaderId;
    }

    // Getters and setters
    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // ... (Getters and setters for other attributes)
}