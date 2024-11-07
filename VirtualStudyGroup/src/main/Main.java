package main;

import GroupManagement.Group;
import SharingManagement.SharingAction;
import StudyMaterialManagement.StudyMaterial;
import UserManagement.User;

public class Main {
    public static void main(String[] args) {
        // Simulate user login
        User alice = new User(1, "Alice", "password", "alice@example.com");

        // Simulate group selection
        Group mathGroup = new Group(1, "Math Exam Prep", "Group for preparing for the math exam.");

        // Simulate study material selection
        StudyMaterial notes = new StudyMaterial(
                1, "Math Notes", "Chapter 1-5 notes", "pdf",
                "/path/to/notes.pdf", "2024-11-07", 1, alice.getUserId());

        // Share the study material
        SharingAction.shareMaterial(alice, mathGroup, notes);
    }
}