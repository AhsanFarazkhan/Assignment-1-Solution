package GroupManagement;

public class Group {
    private int groupId;
    private String groupName;
    private String description;

    // Constructor, getters, and setters
    public Group(int groupId, String groupName, String description) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.description = description;
    }

    // Getters and setters
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    // ... (Getters and setters for other attributes)
}