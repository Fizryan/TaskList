package tasklist;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeamManager {
    private static final String TEAM_FILE_PREFIX = "team_";

    // Fungsi untuk menambahkan anggota ke dalam tim
    public static void addTeamMember(String teamName, String memberName) {
        File teamFile = new File(TEAM_FILE_PREFIX + teamName + ".dat");

        // Membaca anggota tim yang ada
        List<String> members = new ArrayList<>();
        if (teamFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(teamFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    members.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Menambahkan anggota baru jika belum ada
        if (!members.contains(memberName)) {
            members.add(memberName);
        } else {
            System.out.println("Member already exists in the team.");
        }

        // Menyimpan kembali anggota tim ke file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(teamFile))) {
            for (String member : members) {
                writer.write(member);
                writer.newLine();
            }
            System.out.println("Team member added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Membuat antarmuka pengguna untuk menambahkan anggota tim
    public static void showTeamManagerUI() {
        JFrame frame = new JFrame("Team Manager");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel teamNameLabel = new JLabel("Team Name:");
        JTextField teamNameField = new JTextField();
        JLabel memberNameLabel = new JLabel("Member Name:");
        JTextField memberNameField = new JTextField();

        panel.add(teamNameLabel);
        panel.add(teamNameField);
        panel.add(memberNameLabel);
        panel.add(memberNameField);

        JButton addButton = new JButton("Add Member");
        addButton.addActionListener(e -> {
            String teamName = teamNameField.getText().trim();
            String memberName = memberNameField.getText().trim();

            if (teamName.isEmpty() || memberName.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in both fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                addTeamMember(teamName, memberName);
                JOptionPane.showMessageDialog(frame, "Member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                teamNameField.setText("");
                memberNameField.setText("");
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.add(addButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // Fungsi untuk membaca anggota tim
    public static List<String> getTeamMembers(String teamName) {
        File teamFile = new File(TEAM_FILE_PREFIX + teamName + ".dat");
        List<String> members = new ArrayList<>();

        if (teamFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(teamFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    members.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return members;
    }

    // Main method untuk menguji UI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TeamManager::showTeamManagerUI);
    }
}
