package tasklist;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class TaskList extends javax.swing.JFrame {
    public TaskList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        AddTaskPopUp = new javax.swing.JPopupMenu();
        LoginBG = new javax.swing.JPanel();
        LoginBox = new javax.swing.JPanel();
        LoginWelcome = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JPanel();
        LgnUsernameTXT = new javax.swing.JLabel();
        LgnUsernameField = new javax.swing.JTextField();
        LgnPasswordTXT = new javax.swing.JLabel();
        LgnPasswordField = new javax.swing.JPasswordField();
        LgnButtonLgn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LgnButtonRgs = new javax.swing.JButton();
        RegisterBG = new javax.swing.JPanel();
        RegisterBox = new javax.swing.JPanel();
        LoginWelcome2 = new javax.swing.JLabel();
        UsernameBox2 = new javax.swing.JPanel();
        RgsUsernameTXT = new javax.swing.JLabel();
        RgsUsernameField = new javax.swing.JTextField();
        RgsPasswordTXT = new javax.swing.JLabel();
        RgsPasswordField = new javax.swing.JPasswordField();
        RgsRepPasswordTXT = new javax.swing.JLabel();
        RgsRepPasswordField = new javax.swing.JPasswordField();
        RgsButtonRgs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RgsButtonLgn = new javax.swing.JButton();
        Homepage = new javax.swing.JPanel();
        HomepageBox = new javax.swing.JPanel();
        MenuBox = new javax.swing.JPanel();
        HomeLogoutBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HomeDeleteBtn = new javax.swing.JButton();
        HomeAddBtn = new javax.swing.JButton();
        TaskBox = new javax.swing.JPanel();
        DataTask = new javax.swing.JScrollPane();
        DataTaskList = new javax.swing.JList<>();
        AddTaskBG = new javax.swing.JPanel();
        AddTaskBox = new javax.swing.JPanel();
        AddTaskMenuBox = new javax.swing.JPanel();
        addBackBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        UsernameBox3 = new javax.swing.JPanel();
        addTaskLabel = new javax.swing.JLabel();
        addTaskField = new javax.swing.JTextField();
        addDueDateLabel = new javax.swing.JLabel();
        addDueDateField = new javax.swing.JSpinner();
        addTaskButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        AddTaskPopUp.setMaximumSize(new java.awt.Dimension(420, 420));
        AddTaskPopUp.setMinimumSize(new java.awt.Dimension(420, 420));
        AddTaskPopUp.setPreferredSize(new java.awt.Dimension(420, 420));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(860, 660));
        getContentPane().setLayout(new java.awt.CardLayout());

        LoginBG.setBackground(new java.awt.Color(255, 255, 255));
        LoginBG.setMaximumSize(new java.awt.Dimension(1920, 1080));
        LoginBG.setMinimumSize(new java.awt.Dimension(820, 620));
        LoginBG.setPreferredSize(new java.awt.Dimension(820, 620));
        LoginBG.setLayout(new java.awt.GridBagLayout());

        LoginBox.setBackground(new java.awt.Color(204, 204, 204));
        LoginBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginBox.setMaximumSize(new java.awt.Dimension(1780, 980));
        LoginBox.setMinimumSize(new java.awt.Dimension(680, 520));
        LoginBox.setName(""); // NOI18N
        LoginBox.setPreferredSize(new java.awt.Dimension(1780, 980));
        LoginBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2000, 25));

        LoginWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginWelcome.setText("Welcome Back");
        LoginBox.add(LoginWelcome);

        UsernameBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UsernameBox.setPreferredSize(new java.awt.Dimension(420, 380));
        UsernameBox.setLayout(new java.awt.GridBagLayout());

        LgnUsernameTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LgnUsernameTXT.setText("Username");
        LgnUsernameTXT.setMaximumSize(new java.awt.Dimension(60, 16));
        LgnUsernameTXT.setMinimumSize(new java.awt.Dimension(60, 16));
        LgnUsernameTXT.setPreferredSize(new java.awt.Dimension(60, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 3, 0);
        UsernameBox.add(LgnUsernameTXT, gridBagConstraints);

        LgnUsernameField.setMaximumSize(new java.awt.Dimension(320, 34));
        LgnUsernameField.setMinimumSize(new java.awt.Dimension(320, 34));
        LgnUsernameField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox.add(LgnUsernameField, gridBagConstraints);

        LgnPasswordTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LgnPasswordTXT.setText("Password");
        LgnPasswordTXT.setMaximumSize(new java.awt.Dimension(57, 16));
        LgnPasswordTXT.setMinimumSize(new java.awt.Dimension(57, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox.add(LgnPasswordTXT, gridBagConstraints);

        LgnPasswordField.setMaximumSize(new java.awt.Dimension(320, 34));
        LgnPasswordField.setMinimumSize(new java.awt.Dimension(320, 34));
        LgnPasswordField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox.add(LgnPasswordField, gridBagConstraints);

        LgnButtonLgn.setText("Login");
        LgnButtonLgn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LgnButtonLgn.setMaximumSize(new java.awt.Dimension(320, 34));
        LgnButtonLgn.setMinimumSize(new java.awt.Dimension(320, 34));
        LgnButtonLgn.setPreferredSize(new java.awt.Dimension(320, 34));
        LgnButtonLgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LgnButtonLgnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        UsernameBox.add(LgnButtonLgn, gridBagConstraints);

        jLabel1.setText("Or");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        UsernameBox.add(jLabel1, gridBagConstraints);

        LgnButtonRgs.setText("Register");
        LgnButtonRgs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LgnButtonRgs.setMaximumSize(new java.awt.Dimension(320, 34));
        LgnButtonRgs.setMinimumSize(new java.awt.Dimension(320, 34));
        LgnButtonRgs.setPreferredSize(new java.awt.Dimension(320, 34));
        LgnButtonRgs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LgnButtonRgsMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        UsernameBox.add(LgnButtonRgs, gridBagConstraints);

        LoginBox.add(UsernameBox);

        LoginBG.add(LoginBox, new java.awt.GridBagConstraints());

        getContentPane().add(LoginBG, "loginCard");

        RegisterBG.setBackground(new java.awt.Color(255, 255, 255));
        RegisterBG.setMaximumSize(new java.awt.Dimension(1920, 1080));
        RegisterBG.setMinimumSize(new java.awt.Dimension(820, 620));
        RegisterBG.setPreferredSize(new java.awt.Dimension(820, 620));
        RegisterBG.setLayout(new java.awt.GridBagLayout());

        RegisterBox.setBackground(new java.awt.Color(204, 204, 204));
        RegisterBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterBox.setMaximumSize(new java.awt.Dimension(1780, 980));
        RegisterBox.setMinimumSize(new java.awt.Dimension(680, 520));
        RegisterBox.setName(""); // NOI18N
        RegisterBox.setPreferredSize(new java.awt.Dimension(680, 520));
        RegisterBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2000, 25));

        LoginWelcome2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginWelcome2.setText("Lets Started");
        RegisterBox.add(LoginWelcome2);

        UsernameBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UsernameBox2.setPreferredSize(new java.awt.Dimension(420, 380));
        UsernameBox2.setLayout(new java.awt.GridBagLayout());

        RgsUsernameTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RgsUsernameTXT.setText("Username");
        RgsUsernameTXT.setMaximumSize(new java.awt.Dimension(60, 16));
        RgsUsernameTXT.setMinimumSize(new java.awt.Dimension(60, 16));
        RgsUsernameTXT.setPreferredSize(new java.awt.Dimension(60, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 3, 0);
        UsernameBox2.add(RgsUsernameTXT, gridBagConstraints);

        RgsUsernameField.setMaximumSize(new java.awt.Dimension(320, 34));
        RgsUsernameField.setMinimumSize(new java.awt.Dimension(320, 34));
        RgsUsernameField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox2.add(RgsUsernameField, gridBagConstraints);

        RgsPasswordTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RgsPasswordTXT.setText("Password");
        RgsPasswordTXT.setMaximumSize(new java.awt.Dimension(57, 16));
        RgsPasswordTXT.setMinimumSize(new java.awt.Dimension(57, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        UsernameBox2.add(RgsPasswordTXT, gridBagConstraints);

        RgsPasswordField.setMaximumSize(new java.awt.Dimension(320, 34));
        RgsPasswordField.setMinimumSize(new java.awt.Dimension(320, 34));
        RgsPasswordField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        UsernameBox2.add(RgsPasswordField, gridBagConstraints);

        RgsRepPasswordTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RgsRepPasswordTXT.setText("Repeat Password");
        RgsRepPasswordTXT.setMaximumSize(new java.awt.Dimension(57, 16));
        RgsRepPasswordTXT.setMinimumSize(new java.awt.Dimension(57, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox2.add(RgsRepPasswordTXT, gridBagConstraints);

        RgsRepPasswordField.setMaximumSize(new java.awt.Dimension(320, 34));
        RgsRepPasswordField.setMinimumSize(new java.awt.Dimension(320, 34));
        RgsRepPasswordField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox2.add(RgsRepPasswordField, gridBagConstraints);

        RgsButtonRgs.setText("Register");
        RgsButtonRgs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RgsButtonRgs.setMaximumSize(new java.awt.Dimension(320, 34));
        RgsButtonRgs.setMinimumSize(new java.awt.Dimension(320, 34));
        RgsButtonRgs.setPreferredSize(new java.awt.Dimension(320, 34));
        RgsButtonRgs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RgsButtonRgsMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        UsernameBox2.add(RgsButtonRgs, gridBagConstraints);

        jLabel3.setText("Or");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        UsernameBox2.add(jLabel3, gridBagConstraints);

        RgsButtonLgn.setText("Login");
        RgsButtonLgn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RgsButtonLgn.setMaximumSize(new java.awt.Dimension(320, 34));
        RgsButtonLgn.setMinimumSize(new java.awt.Dimension(320, 34));
        RgsButtonLgn.setPreferredSize(new java.awt.Dimension(320, 34));
        RgsButtonLgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RgsButtonLgnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        UsernameBox2.add(RgsButtonLgn, gridBagConstraints);

        RegisterBox.add(UsernameBox2);

        RegisterBG.add(RegisterBox, new java.awt.GridBagConstraints());

        getContentPane().add(RegisterBG, "registerCard");

        Homepage.setBackground(new java.awt.Color(255, 255, 255));
        Homepage.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Homepage.setMinimumSize(new java.awt.Dimension(820, 620));
        Homepage.setPreferredSize(new java.awt.Dimension(820, 620));
        Homepage.setLayout(new java.awt.GridBagLayout());

        HomepageBox.setBackground(new java.awt.Color(204, 204, 204));
        HomepageBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HomepageBox.setAutoscrolls(true);
        HomepageBox.setMaximumSize(new java.awt.Dimension(1780, 980));
        HomepageBox.setMinimumSize(new java.awt.Dimension(680, 520));
        HomepageBox.setName(""); // NOI18N
        HomepageBox.setPreferredSize(new java.awt.Dimension(680, 520));
        HomepageBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2000, 5));

        MenuBox.setMinimumSize(new java.awt.Dimension(600, 40));
        MenuBox.setPreferredSize(new java.awt.Dimension(600, 40));
        MenuBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 6));

        HomeLogoutBtn.setText("Logout");
        HomeLogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeLogoutBtn.setMaximumSize(new java.awt.Dimension(76, 26));
        HomeLogoutBtn.setMinimumSize(new java.awt.Dimension(76, 26));
        HomeLogoutBtn.setPreferredSize(new java.awt.Dimension(76, 26));
        HomeLogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLogoutBtnMouseClicked(evt);
            }
        });
        MenuBox.add(HomeLogoutBtn);

        jPanel1.setMinimumSize(new java.awt.Dimension(380, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Task List");
        jLabel2.setMaximumSize(new java.awt.Dimension(76, 26));
        jLabel2.setMinimumSize(new java.awt.Dimension(76, 26));
        jLabel2.setPreferredSize(new java.awt.Dimension(76, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MenuBox.add(jPanel1);

        HomeDeleteBtn.setBackground(java.awt.SystemColor.activeCaptionBorder);
        HomeDeleteBtn.setText("Delete");
        HomeDeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeDeleteBtn.setMaximumSize(new java.awt.Dimension(76, 26));
        HomeDeleteBtn.setMinimumSize(new java.awt.Dimension(76, 26));
        HomeDeleteBtn.setPreferredSize(new java.awt.Dimension(76, 26));
        MenuBox.add(HomeDeleteBtn);

        HomeAddBtn.setBackground(java.awt.SystemColor.activeCaption);
        HomeAddBtn.setText("Add");
        HomeAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeAddBtn.setMaximumSize(new java.awt.Dimension(76, 26));
        HomeAddBtn.setMinimumSize(new java.awt.Dimension(76, 26));
        HomeAddBtn.setPreferredSize(new java.awt.Dimension(76, 26));
        HomeAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeAddBtnMouseClicked(evt);
            }
        });
        MenuBox.add(HomeAddBtn);

        HomepageBox.add(MenuBox);

        TaskBox.setMinimumSize(new java.awt.Dimension(680, 520));
        TaskBox.setPreferredSize(new java.awt.Dimension(560, 440));
        TaskBox.setLayout(new java.awt.GridBagLayout());

        DataTask.setMaximumSize(new java.awt.Dimension(500, 400));
        DataTask.setMinimumSize(new java.awt.Dimension(500, 400));
        DataTask.setPreferredSize(new java.awt.Dimension(500, 400));

        DataTaskList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        DataTask.setViewportView(DataTaskList);

        TaskBox.add(DataTask, new java.awt.GridBagConstraints());

        HomepageBox.add(TaskBox);

        Homepage.add(HomepageBox, new java.awt.GridBagConstraints());

        getContentPane().add(Homepage, "HomepageCard");

        AddTaskBG.setBackground(new java.awt.Color(255, 255, 255));
        AddTaskBG.setMaximumSize(new java.awt.Dimension(1920, 1080));
        AddTaskBG.setMinimumSize(new java.awt.Dimension(820, 620));
        AddTaskBG.setPreferredSize(new java.awt.Dimension(820, 620));
        AddTaskBG.setLayout(new java.awt.GridBagLayout());

        AddTaskBox.setBackground(new java.awt.Color(204, 204, 204));
        AddTaskBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddTaskBox.setMaximumSize(new java.awt.Dimension(1780, 980));
        AddTaskBox.setMinimumSize(new java.awt.Dimension(680, 520));
        AddTaskBox.setName(""); // NOI18N
        AddTaskBox.setPreferredSize(new java.awt.Dimension(680, 520));
        AddTaskBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2000, 25));

        AddTaskMenuBox.setMinimumSize(new java.awt.Dimension(600, 40));
        AddTaskMenuBox.setPreferredSize(new java.awt.Dimension(600, 40));
        AddTaskMenuBox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 6));

        addBackBtn.setText("Back");
        addBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBackBtn.setMaximumSize(new java.awt.Dimension(76, 26));
        addBackBtn.setMinimumSize(new java.awt.Dimension(76, 26));
        addBackBtn.setPreferredSize(new java.awt.Dimension(76, 26));
        addBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBackBtnMouseClicked(evt);
            }
        });
        AddTaskMenuBox.add(addBackBtn);

        jPanel2.setMinimumSize(new java.awt.Dimension(380, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(480, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Task List");
        jLabel4.setMaximumSize(new java.awt.Dimension(76, 26));
        jLabel4.setMinimumSize(new java.awt.Dimension(76, 26));
        jLabel4.setPreferredSize(new java.awt.Dimension(76, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        AddTaskMenuBox.add(jPanel2);

        AddTaskBox.add(AddTaskMenuBox);

        UsernameBox3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UsernameBox3.setPreferredSize(new java.awt.Dimension(420, 380));
        UsernameBox3.setLayout(new java.awt.GridBagLayout());

        addTaskLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addTaskLabel.setText("Task");
        addTaskLabel.setToolTipText("");
        addTaskLabel.setMaximumSize(new java.awt.Dimension(42, 25));
        addTaskLabel.setMinimumSize(new java.awt.Dimension(42, 25));
        addTaskLabel.setPreferredSize(new java.awt.Dimension(42, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 3, 0);
        UsernameBox3.add(addTaskLabel, gridBagConstraints);

        addTaskField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addTaskField.setMaximumSize(new java.awt.Dimension(320, 34));
        addTaskField.setMinimumSize(new java.awt.Dimension(320, 34));
        addTaskField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox3.add(addTaskField, gridBagConstraints);

        addDueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addDueDateLabel.setText("Due Date");
        addDueDateLabel.setMaximumSize(new java.awt.Dimension(57, 16));
        addDueDateLabel.setMinimumSize(new java.awt.Dimension(57, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        UsernameBox3.add(addDueDateLabel, gridBagConstraints);

        addDueDateField.setMaximumSize(new java.awt.Dimension(320, 34));
        addDueDateField.setMinimumSize(new java.awt.Dimension(320, 34));
        addDueDateField.setPreferredSize(new java.awt.Dimension(320, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        UsernameBox3.add(addDueDateField, gridBagConstraints);

        addTaskButton.setText("Add");
        addTaskButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTaskButton.setMaximumSize(new java.awt.Dimension(320, 34));
        addTaskButton.setMinimumSize(new java.awt.Dimension(320, 34));
        addTaskButton.setPreferredSize(new java.awt.Dimension(320, 34));
        addTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTaskButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        UsernameBox3.add(addTaskButton, gridBagConstraints);

        jLabel5.setText("Berapa Lama? (hari)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        UsernameBox3.add(jLabel5, gridBagConstraints);

        AddTaskBox.add(UsernameBox3);

        AddTaskBG.add(AddTaskBox, new java.awt.GridBagConstraints());

        getContentPane().add(AddTaskBG, "AddTaskCard");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LgnButtonRgsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LgnButtonRgsMouseClicked
        if (clickCheck(evt)){
            CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
            cardLayout.show(getContentPane(), "registerCard");
        }  
    }//GEN-LAST:event_LgnButtonRgsMouseClicked

    private void RgsButtonLgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RgsButtonLgnMouseClicked
        if (clickCheck(evt)){
            CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
            cardLayout.show(getContentPane(), "loginCard");
        }
    }//GEN-LAST:event_RgsButtonLgnMouseClicked

    private void RgsButtonRgsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RgsButtonRgsMouseClicked
        boolean userChecker = PasswordManager.isUsernameMatch(RgsUsernameField.getText());
        boolean passChecker = PasswordManager.isPasswordMatch(RgsPasswordField.getPassword(), RgsRepPasswordField.getPassword());
        if (clickCheck(evt)){
            if (userChecker) {
                if (passChecker){                   
                    PasswordManager.savePasswordToFile(RgsUsernameField.getText(), RgsPasswordField.getPassword());
                    CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                    cardLayout.show(getContentPane(), "loginCard");
                    JOptionPane.showMessageDialog(null, "Account Created", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clearField();
                } else {
                    JOptionPane.showMessageDialog(null, "Password / Repeat Password tidak cocok!", "Warning", JOptionPane.WARNING_MESSAGE);    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tidak dapat menggunakan Username ini!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_RgsButtonRgsMouseClicked

    private void LgnButtonLgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LgnButtonLgnMouseClicked
        boolean loginChecker = PasswordManager.login(LgnUsernameField.getText(), LgnPasswordField.getPassword());
        if (clickCheck(evt)){
            if (loginChecker){
                taskUtil.loadDataToList(PasswordManager.getCurrentAccount(), DataTaskList);
                CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                cardLayout.show(getContentPane(), "HomepageCard");
                clearField();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }//GEN-LAST:event_LgnButtonLgnMouseClicked

    private void HomeLogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLogoutBtnMouseClicked
        if (clickCheck(evt)){
            CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
            cardLayout.show(getContentPane(), "loginCard");
            PasswordManager.logout();
        }
    }//GEN-LAST:event_HomeLogoutBtnMouseClicked

    private void HomeAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeAddBtnMouseClicked
        if (clickCheck(evt)){
            CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
            cardLayout.show(getContentPane(), "AddTaskCard");
        }
    }//GEN-LAST:event_HomeAddBtnMouseClicked

    private void addBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBackBtnMouseClicked
        if (clickCheck(evt)){
            CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
            cardLayout.show(getContentPane(), "HomepageCard");
            clearField();
            taskUtil.loadDataToList(PasswordManager.getCurrentAccount(), DataTaskList);
        }
    }//GEN-LAST:event_addBackBtnMouseClicked

    private void addTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTaskButtonMouseClicked
        if (clickCheck(evt)){
            int input = (int) addDueDateField.getValue();
            if (input > 0){
                taskUtil.saveDataToFile(PasswordManager.getCurrentAccount(), addTaskField.getText(), input);
                clearField();
                taskUtil.loadDataToList(PasswordManager.getCurrentAccount(), DataTaskList);
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Boleh < 1 Hari!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_addTaskButtonMouseClicked
    
    private static boolean clickCheck(java.awt.event.MouseEvent evt){
        return evt.getButton() == 1 && (!evt.isShiftDown() && !evt.isControlDown());
    }
    
    
    // Fungsi untuk clear field
    private void clearField(){
        // Clear Field di login
        LgnUsernameField.setText("");
        LgnPasswordField.setText("");
        
        // Clear Field di register
        RgsUsernameField.setText("");
        RgsPasswordField.setText("");
        RgsRepPasswordField.setText("");
        
        // Clear Field di AddTask
        addTaskField.setText("");
        addDueDateField.setValue(0);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TaskList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddTaskBG;
    private javax.swing.JPanel AddTaskBox;
    private javax.swing.JPanel AddTaskMenuBox;
    private javax.swing.JPopupMenu AddTaskPopUp;
    private javax.swing.JScrollPane DataTask;
    private javax.swing.JList<String> DataTaskList;
    private javax.swing.JButton HomeAddBtn;
    private javax.swing.JButton HomeDeleteBtn;
    private javax.swing.JButton HomeLogoutBtn;
    private javax.swing.JPanel Homepage;
    private javax.swing.JPanel HomepageBox;
    private javax.swing.JButton LgnButtonLgn;
    private javax.swing.JButton LgnButtonRgs;
    private javax.swing.JPasswordField LgnPasswordField;
    private javax.swing.JLabel LgnPasswordTXT;
    private javax.swing.JTextField LgnUsernameField;
    private javax.swing.JLabel LgnUsernameTXT;
    private javax.swing.JPanel LoginBG;
    private javax.swing.JPanel LoginBox;
    private javax.swing.JLabel LoginWelcome;
    private javax.swing.JLabel LoginWelcome2;
    private javax.swing.JPanel MenuBox;
    private javax.swing.JPanel RegisterBG;
    private javax.swing.JPanel RegisterBox;
    private javax.swing.JButton RgsButtonLgn;
    private javax.swing.JButton RgsButtonRgs;
    private javax.swing.JPasswordField RgsPasswordField;
    private javax.swing.JLabel RgsPasswordTXT;
    private javax.swing.JPasswordField RgsRepPasswordField;
    private javax.swing.JLabel RgsRepPasswordTXT;
    private javax.swing.JTextField RgsUsernameField;
    private javax.swing.JLabel RgsUsernameTXT;
    private javax.swing.JPanel TaskBox;
    private javax.swing.JPanel UsernameBox;
    private javax.swing.JPanel UsernameBox2;
    private javax.swing.JPanel UsernameBox3;
    private javax.swing.JButton addBackBtn;
    private javax.swing.JSpinner addDueDateField;
    private javax.swing.JLabel addDueDateLabel;
    private javax.swing.JButton addTaskButton;
    private javax.swing.JTextField addTaskField;
    private javax.swing.JLabel addTaskLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
