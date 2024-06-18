import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class feerecept {

    feerecept() {
        Loginwindows();
    }

    private static int nextrollno = 1;

    private static void Loginwindows() {
        JFrame loginFrame = new JFrame("Fee Report");
        JLabel newLabel = new JLabel(" Fee Report");
        newLabel.setBounds(200, 10, 100, 25);
        JButton Admin_login = new JButton("Admin Login");
        Admin_login.setBounds(130, 100, 200, 50);
        JButton Accountant_login = new JButton("Accountant Login");
        Accountant_login.setBounds(130, 250, 200, 50);

        // adding all button and label to the main windows
        loginFrame.add(Accountant_login);
        loginFrame.add(Admin_login);
        loginFrame.add(newLabel);
        loginFrame.setSize(500, 500);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);

        // add action liction to Accountant_login

        Accountant_login.addActionListener(e -> Accountant_login());

        // adding actionlisner to the button
        Admin_login.addActionListener(e -> adminlogin());
    }

    private static void adminlogin() {

        JFrame adminpanel = new JFrame();
        adminpanel.setSize(500, 500);
        JLabel title = new JLabel(" Admin Login");
        title.setBounds(200, 10, 100, 25);
        JLabel name = new JLabel("Name:");
        name.setBounds(70, 100, 100, 25);
        JTextField admin_name = new JTextField();
        admin_name.setBounds(140, 100, 250, 25);
        JLabel Password = new JLabel("Password");
        Password.setBounds(70, 150, 100, 25);
        JTextField adminpassword = new JTextField();
        adminpassword.setBounds(140, 150, 250, 25);
        JButton adminlogin = new JButton("Login");
        adminlogin.setBounds(70, 250, 150, 50);
        JButton back = new JButton("Back");
        back.setBounds(240, 250, 150, 50);

        // add component to the admin panel
        adminpanel.add(back);
        adminpanel.add(adminlogin);
        adminpanel.add(adminpassword);
        adminpanel.add(Password);
        adminpanel.add(admin_name);
        adminpanel.add(name);
        adminpanel.add(title);
        adminpanel.setDefaultCloseOperation(adminpanel.EXIT_ON_CLOSE);
        adminpanel.setLayout(null);
        adminpanel.setVisible(true);

        // ading action lisnter on admin login button

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adminpanel.dispose();
            }
        });

        adminlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = admin_name.getText();
                String Password = adminpassword.getText();
                if (name.equals("") && Password.equals("")) {
                    adminsection();
                } else {
                    JOptionPane.showMessageDialog(adminpassword, "Password and user name Wrong ! Try again ",
                            "Access Denied!", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
    }

    // adminsection
    private static void adminsection() {
        JFrame adminfFrame = new JFrame("Admin Panel ");
        adminfFrame.setSize(500, 500);
        JLabel title = new JLabel(" Admin Section ");
        title.setBounds(200, 10, 200, 25);
        JButton addAccounteButton = new JButton("Add Accountant");
        addAccounteButton.setBounds(150, 70, 200, 50);
        JButton viewAccountantButton = new JButton("View Accountant");
        viewAccountantButton.setBounds(150, 150, 200, 50);
        JButton Logout = new JButton("logout");
        Logout.setBounds(150, 230, 200, 50);

        // add comonnent to the admin seciton
        adminfFrame.add(Logout);
        adminfFrame.add(viewAccountantButton);
        adminfFrame.add(addAccounteButton);
        adminfFrame.add(title);
        adminfFrame.setDefaultCloseOperation(adminfFrame.EXIT_ON_CLOSE);
        adminfFrame.setLayout(null);
        adminfFrame.setVisible(true);

        // adding the actionlistner on the function button in admin section

        // on Add Accountant button

        addAccounteButton.addActionListener(e -> addAccountant());

        // on Logout button

        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adminfFrame.dispose();
            }
        });

        // on Button viewAccountantButton

        viewAccountantButton.addActionListener(e -> showAccountentinformation());
    }

    // add accountant section
    private static void addAccountant() {
        JFrame accountantFrame = new JFrame("Add Accountant ");
        accountantFrame.setSize(500, 500);
        JLabel title = new JLabel(" Add Accountant");
        title.setBounds(200, 10, 100, 25);
        JLabel ID = new JLabel("ID:");
        ID.setBounds(10, 50, 150, 25);
        JTextField idfield = new JTextField();
        idfield.setBounds(100, 50, 200, 25);
        JLabel name = new JLabel("Name");
        name.setBounds(10, 100, 150, 25);
        JTextField nameTextArea = new JTextField();
        nameTextArea.setBounds(100, 100, 200, 25);
        JLabel Password = new JLabel("Password");
        Password.setBounds(10, 150, 150, 25);
        JTextField passwordTextArea = new JTextField();
        passwordTextArea.setBounds(100, 150, 200, 25);
        JLabel email = new JLabel("Email");
        email.setBounds(10, 200, 150, 25);
        JTextField emailJTextArea = new JTextField();
        emailJTextArea.setBounds(100, 200, 200, 25);
        JLabel contact = new JLabel("Contact No:");
        contact.setBounds(10, 250, 150, 25);
        JTextField contacTextArea = new JTextField();
        contacTextArea.setBounds(100, 250, 200, 25);
        JButton addAccountant = new JButton("Add Accountant");
        addAccountant.setBounds(110, 300, 150, 50);
        JButton back = new JButton("Back");
        back.setBounds(110, 350, 100, 50);

        // adding the component to frame
        accountantFrame.add(idfield);
        accountantFrame.add(back);
        accountantFrame.add(ID);
        accountantFrame.add(addAccountant);
        accountantFrame.add(contacTextArea);
        accountantFrame.add(contact);
        accountantFrame.add(emailJTextArea);
        accountantFrame.add(email);
        accountantFrame.add(passwordTextArea);
        accountantFrame.add(Password);
        accountantFrame.add(nameTextArea);
        accountantFrame.add(name);
        accountantFrame.add(title);
        accountantFrame.setLayout(null);
        accountantFrame.setVisible(true);

        // adding action listner on buttons

        // back button
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountantFrame.dispose();
            }
        });

        addAccountant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get data
                String name = nameTextArea.getText();
                String password = passwordTextArea.getText();
                String email = emailJTextArea.getText();
                String contact = contacTextArea.getText();
                String Id = idfield.getText();
                // save data to a text file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("accountants.txt", true))) {
                    // saving formate ID, Name , Password, Email,Contact
                    writer.write(Id + "," + name + "," + password + "," + email + "," + contact);
                    writer.newLine();
                    JOptionPane.showMessageDialog(addAccountant, "Successfully", "Accountant Added",
                            JOptionPane.DEFAULT_OPTION);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("There are some Problem during saving data ");
                }

            }
        });
    }
    // for showing all accountent detail on admin panel

    private static void showAccountentinformation() {
        JFrame info = new JFrame("Accountent Information");
        info.setSize(1200, 1200);

        // create a table with Columns ID, Name, Password , Email, Contact
        String[] columns = { "ID", "Name", "Password", "Email", "Contact" };
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        table.setBounds(0, 0, 800, 800);

        readDataFromFile(tableModel, "accountants.txt");

        // add the table to a JScrollPane

        JScrollPane scrollPane = new JScrollPane(table);

        // addjesting the column widths
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // add the table to a JScrollPane
        JScrollPane tablescrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // info.add(scrollPane, BorderLayout.CENTER);
        info.setLayout(new BorderLayout());
        info.add(tablescrollPane, BorderLayout.CENTER);
        info.setVisible(true);

    }

    // read data from the File
    private static void readDataFromFile(DefaultTableModel tableModel, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                tableModel.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error to read Data ");
        }
    }

    // accountant login windows
    private static void Accountant_login() {
        JFrame accountantlogin = new JFrame("Accountant Login");
        accountantlogin.setSize(500, 500);
        JLabel title = new JLabel("Accountant Login");
        title.setBounds(160, 10, 200, 50);
        JLabel name = new JLabel("Name");
        name.setBounds(100, 100, 150, 25);
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(200, 100, 200, 25);
        JLabel passwordJLabel = new JLabel("Password");
        passwordJLabel.setBounds(100, 150, 200, 25);
        JTextField passwordJTextField = new JTextField();
        passwordJTextField.setBounds(200, 150, 200, 25);
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 230, 150, 50);
        JButton backButton = new JButton("Back");
        backButton.setBounds(300, 230, 150, 50);

        // add component to the accountant login frame
        accountantlogin.add(backButton);
        accountantlogin.add(loginButton);
        accountantlogin.add(passwordJTextField);
        accountantlogin.add(passwordJLabel);
        accountantlogin.add(nameTextField);
        accountantlogin.add(name);
        accountantlogin.add(title);
        accountantlogin.setLayout(null);
        accountantlogin.setVisible(true);

        // adding action listner on login button
        loginButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String password = passwordJTextField.getText();
                if (isaccountent(name, password)) {
                    JOptionPane.showMessageDialog(loginButton, "Login", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                    accountant();
                } else {
                    JOptionPane.showMessageDialog(passwordJTextField, "Access Denied!", "Wrong username & password ",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // on back button
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountantlogin.dispose();
            }
        });
    }

    // function for chaking the accountant username and password from the fiel
    private static boolean isaccountent(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("accountants.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) { // Assuming at least four parts : id , name , password, email,contact
                    String storedUsername = parts[1].trim();
                    String storedPassword = parts[2].trim();
                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        return true; // for true ;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;// no match found ;
    }

    // for accountant window
    private static void accountant() {
        JFrame Accountant = new JFrame("Accountant Section");
        Accountant.setSize(500, 500);
        JButton add_student = new JButton("Add Student");
        add_student.setBounds(50, 100, 150, 50);
        JButton view_student = new JButton("View Student ");
        view_student.setBounds(250, 100, 150, 50);
        JButton edit_Student = new JButton("Edit Student");
        edit_Student.setBounds(50, 200, 150, 50);
        JButton Due_Fee = new JButton("Due Fee");
        Due_Fee.setBounds(250, 200, 150, 50);

        // add component to the the frame
        Accountant.add(Due_Fee);
        Accountant.add(edit_Student);
        Accountant.add(view_student);
        Accountant.add(add_student);
        Accountant.setLayout(null);
        Accountant.setVisible(true);

        // addActionlistner on the compnents of accountant login
        add_student.addActionListener(e -> addstudent());
        // actionlistner in button view student
        view_student.addActionListener(e -> viewstudent());
        // on student edition section
        edit_Student.addActionListener(e -> editStudent());
        // on due fees section
        Due_Fee.addActionListener(e -> duesection());
    }

    // windows for adding student
    private static void addstudent() {
        JFrame studentFrame = new JFrame("Student");
        studentFrame.setSize(700, 700);
        JLabel title = new JLabel("Add Student");
        title.setBounds(300, 20, 200, 50);
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 80, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 80, 200, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 120, 80, 25);

        JTextField emailField = new JTextField();
        emailField.setBounds(130, 120, 200, 25);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 160, 80, 25);

        JTextField courseField = new JTextField();
        courseField.setBounds(130, 160, 200, 25);

        JLabel feeLabel = new JLabel("Fee:");
        feeLabel.setBounds(50, 200, 80, 25);

        JTextField feeField = new JTextField();
        feeField.setBounds(130, 200, 80, 25);

        JLabel paidLabel = new JLabel("Paid:");
        paidLabel.setBounds(250, 200, 80, 25);

        JTextField paidField = new JTextField();
        paidField.setBounds(330, 200, 80, 25);

        JLabel dueLabel = new JLabel("Due:");
        dueLabel.setBounds(50, 240, 80, 25);

        JTextField dueField = new JTextField();
        dueField.setBounds(130, 240, 80, 25);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 280, 80, 25);

        JTextField addressField = new JTextField();
        addressField.setBounds(130, 280, 200, 25);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 320, 80, 25);

        JTextField cityField = new JTextField();
        cityField.setBounds(130, 320, 80, 25);

        JLabel stateLabel = new JLabel("State:");
        stateLabel.setBounds(250, 320, 80, 25);

        JTextField stateField = new JTextField();
        stateField.setBounds(330, 320, 80, 25);

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(50, 360, 80, 25);

        JTextField countryField = new JTextField();
        countryField.setBounds(130, 360, 80, 25);

        JLabel contactLabel = new JLabel("Contact No:");
        contactLabel.setBounds(50, 400, 80, 25);

        JTextField contactField = new JTextField();
        contactField.setBounds(130, 400, 120, 25);

        JButton addButton = new JButton("Add");
        addButton.setBounds(130, 480, 80, 25);

        JButton backButton = new JButton("back");
        backButton.setBounds(300, 480, 80, 25);

        // adding compoment to the student
        studentFrame.add(backButton);
        studentFrame.add(addButton);
        studentFrame.add(contactField);
        studentFrame.add(contactLabel);
        studentFrame.add(countryField);
        studentFrame.add(countryLabel);
        studentFrame.add(stateField);
        studentFrame.add(stateLabel);
        studentFrame.add(cityField);
        studentFrame.add(cityLabel);
        studentFrame.add(addressField);
        studentFrame.add(addressLabel);
        studentFrame.add(dueField);
        studentFrame.add(dueLabel);
        studentFrame.add(paidField);
        studentFrame.add(paidLabel);
        studentFrame.add(feeField);
        studentFrame.add(feeLabel);
        studentFrame.add(courseField);
        studentFrame.add(courseLabel);
        studentFrame.add(emailField);
        studentFrame.add(emailLabel);
        studentFrame.add(nameField);
        studentFrame.add(nameLabel);
        studentFrame.add(title);
        studentFrame.setLayout(null);
        studentFrame.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the data from text fields
                String name = nameField.getText();
                String email = emailField.getText();
                String course = courseField.getText();
                String fee = feeField.getText();
                String paid = paidField.getText();
                String due = dueField.getText();
                String address = addressField.getText();
                String city = cityField.getText();
                String state = stateField.getText();
                String country = countryField.getText();
                String contact = contactField.getText();

                writeStudentdatatofile(
                        Integer.toString(nextrollno),
                        name,
                        email,
                        course,
                        fee,
                        paid,
                        due,
                        address,
                        city,
                        state,
                        country,
                        contact);

                saveNextstudentrollno(++nextrollno);
                JOptionPane.showMessageDialog(addButton, "Student added  Successfully", "Done",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });
        // adding actions to the button
        backButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                studentFrame.dispose();
            }
        });

    }

    private static void writeStudentdatatofile(String rollno, String name, String email, String course, String fee,
            String paid, String due, String address, String city, String state, String country, String contact) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_data.txt", true))) {
            // append data to the file
            writer.write(rollno + ",");
            writer.write(name + ",");
            writer.write(email + ",");
            writer.write(course + ",");
            writer.write(fee + ",");
            writer.write(paid + ",");
            writer.write(due + ",");
            writer.write(address + ",");
            writer.write(city + ",");
            writer.write(state + ",");
            writer.write(country + ",");
            writer.write(contact);
            writer.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error in writing student data to file ");
        }
    }

    // counting the roll number in a file
    private static final String ROLL_File_PATH = "nextRollno.txt";

    private static void loadnextrollno() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ROLL_File_PATH))) {
            String line = reader.readLine();
            if (line != null && !line.isEmpty()) {
                nextrollno = Integer.parseInt(line.trim());
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

    }

    // save the next rollno.
    private static void saveNextstudentrollno(int nextRollno) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ROLL_File_PATH))) {
            writer.write(String.valueOf(nextrollno));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // view Student windows
    private static void viewstudent() {
        JFrame infoFrame = new JFrame("Student Information");
        infoFrame.setSize(1800, 600);

        // create a table with column roll no, name, email, course, fee, paid,
        // due,address, city, state , country, contact
        String[] columnNames = { "Roll NO:", "name", "email", "course", "fee", "paid", "due", "address", "city",
                "state",
                "country", "contact" };
        DefaultTableModel Tmodel = new DefaultTableModel(columnNames, 0);
        JTable tab = new JTable(Tmodel);

        // scrollbar to table
        JScrollPane scrolinfo = new JScrollPane(tab);

        tab.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // add the table to a JScroll pane
        JScrollPane tabScrollPane = new JScrollPane(tab, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // info.add(scrollpane,BorderLayout.Center)
        infoFrame.setLayout(new BorderLayout());
        infoFrame.add(tabScrollPane, BorderLayout.CENTER);
        readDataFromFile(Tmodel, "student_data.txt");
        infoFrame.setVisible(true);
    }

    // for edit student section
    private static void editStudent() {
        JFrame editstudentFrame = new JFrame(" Edit Student");
        editstudentFrame.setSize(700, 700);
        JLabel Rollno = new JLabel("Roll NO:");
        Rollno.setBounds(50, 10, 80, 25);
        JTextField rollnoField = new JTextField();
        rollnoField.setBounds(130, 10, 200, 25);
        JButton Loadrecord = new JButton("Load Record ");
        Loadrecord.setBounds(350, 10, 150, 25);

        JSeparator separator = new JSeparator();
        separator.setBounds(50, 50, 500, 10);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 80, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 80, 200, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 120, 80, 25);

        JTextField emailField = new JTextField();
        emailField.setBounds(130, 120, 200, 25);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 160, 80, 25);

        JTextField courseField = new JTextField();
        courseField.setBounds(130, 160, 200, 25);

        JLabel feeLabel = new JLabel("Fee:");
        feeLabel.setBounds(50, 200, 80, 25);

        JTextField feeField = new JTextField();
        feeField.setBounds(130, 200, 80, 25);

        JLabel paidLabel = new JLabel("Paid:");
        paidLabel.setBounds(250, 200, 80, 25);

        JTextField paidField = new JTextField();
        paidField.setBounds(350, 200, 80, 25);

        JLabel dueLabel = new JLabel("Due:");
        dueLabel.setBounds(50, 240, 80, 25);

        JTextField dueField = new JTextField();
        dueField.setBounds(130, 240, 80, 25);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 280, 80, 25);

        JTextField addressField = new JTextField();
        addressField.setBounds(130, 280, 200, 25);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 320, 80, 25);

        JTextField cityField = new JTextField();
        cityField.setBounds(130, 320, 80, 25);

        JLabel stateLabel = new JLabel("State:");
        stateLabel.setBounds(250, 320, 80, 25);

        JTextField stateField = new JTextField();
        stateField.setBounds(350, 320, 80, 25);

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(50, 360, 80, 25);

        JTextField countryField = new JTextField();
        countryField.setBounds(130, 360, 80, 25);

        JLabel contactLabel = new JLabel("Contact No:");
        contactLabel.setBounds(50, 400, 80, 25);

        JTextField contactField = new JTextField();
        contactField.setBounds(130, 400, 120, 25);

        JButton Update = new JButton("Update");
        Update.setBounds(130, 480, 80, 25);

        JButton backButton = new JButton("back");
        backButton.setBounds(350, 480, 80, 25);

        // adding compoment to the student
        editstudentFrame.add(separator);
        editstudentFrame.add(Loadrecord);
        editstudentFrame.add(Rollno);
        editstudentFrame.add(rollnoField);
        editstudentFrame.add(backButton);
        editstudentFrame.add(Update);
        editstudentFrame.add(contactField);
        editstudentFrame.add(contactLabel);
        editstudentFrame.add(countryField);
        editstudentFrame.add(countryLabel);
        editstudentFrame.add(stateField);
        editstudentFrame.add(stateLabel);
        editstudentFrame.add(cityField);
        editstudentFrame.add(cityLabel);
        editstudentFrame.add(addressField);
        editstudentFrame.add(addressLabel);
        editstudentFrame.add(dueField);
        editstudentFrame.add(dueLabel);
        editstudentFrame.add(paidField);
        editstudentFrame.add(paidLabel);
        editstudentFrame.add(feeField);
        editstudentFrame.add(feeLabel);
        editstudentFrame.add(courseField);
        editstudentFrame.add(courseLabel);
        editstudentFrame.add(emailField);
        editstudentFrame.add(emailLabel);
        editstudentFrame.add(nameField);
        editstudentFrame.add(nameLabel);
        editstudentFrame.setLayout(null);
        editstudentFrame.setVisible(true);

        // addding action listner to the button
        Loadrecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String roll_no = rollnoField.getText();
                loadStudentdata(roll_no, nameField, emailField, courseField, feeField, paidField, dueField,
                        addressField, cityField, stateField, countryField, contactField);
            }

        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editstudentFrame.dispose();
            }
        });

        Update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nameField.getText().isEmpty() || emailField.getText().isEmpty() || courseField.getText().isEmpty()
                        || feeField.getText().isEmpty() || paidField.getText().isEmpty() || dueField.getText().isEmpty()
                        || addressField.getText().isEmpty() || cityField.getText().isEmpty()
                        || stateField.getText().isEmpty() || countryField.getText().isEmpty()
                        || contactField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(Update, "Enter the Student RollnO:  and Click on Load Record",
                            "!Erorr Empty Space", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // get updated data from the field
                String updatedRollno = rollnoField.getText();
                String updatedName = nameField.getText();
                String updatedEmail = emailField.getText();
                String updatedCourse = courseField.getText();
                String updatedFee = feeField.getText();
                String updatedPaid = paidField.getText();
                String updatedDue = dueField.getText();
                String updatedAddress = addressField.getText();
                String updatedCity = cityField.getText();
                String updatedState = stateField.getText();
                String updatedCountry = countryField.getText();
                String updatedContact = contactField.getText();

                // calling the function for updating the field
                updatestudentdata(updatedRollno, updatedName, updatedEmail, updatedCourse, updatedFee, updatedPaid,
                        updatedDue, updatedAddress, updatedCity, updatedState, updatedCountry, updatedContact);
            }
        });
    }
    // for updating the student record in the file

    // student data fatching funciton
    private static void loadStudentdata(String rollNoToLoad, JTextField nameField, JTextField emailField,
            JTextField courseField, JTextField feeField, JTextField paidField, JTextField dueField,
            JTextField addressField,
            JTextField cityField, JTextField stateField, JTextField countryField, JTextField contactField) {
        String filename = "student_data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // fatching student data from the txt file
                if (data.length == 12 && data[0].equals(rollNoToLoad)) {
                    nameField.setText(data[1]);
                    emailField.setText(data[2]);
                    courseField.setText(data[3]);
                    feeField.setText(data[4]);
                    paidField.setText(data[5]);
                    dueField.setText(data[6]);
                    addressField.setText(data[7]);
                    cityField.setText(data[8]);
                    stateField.setText(data[9]);
                    countryField.setText(data[10]);
                    contactField.setText(data[11]);
                    break;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // for updating student data on record

    private static void updatestudentdata(String rollno, String name, String email, String course, String fee,
            String paid, String due, String address, String city, String state, String country, String contact) {
        String filename = "student_data.txt";
        String tempfilename = "temp_student_data.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try { reader = new BufferedReader(new FileReader(filename)); writer = new BufferedWriter(new FileWriter(tempfilename)); 
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 12 && data[0].equals(rollno)) {
                    data[1] = name;
                    data[2] = email;
                    data[3] = course;
                    data[4] = fee;
                    data[5] = paid;
                    data[6] = due;
                    data[7] = address;
                    data[8] = city;
                    data[9] = state;
                    data[10] = country;
                    data[11] = contact;

                    // construct the updated line
                    String updatedLine = String.join(",", data);
                    writer.write(updatedLine);
                } else {
                    writer.write(line);
                }
                // add a new line character
                writer.newLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();  
        }
        finally{
            try {
                if(reader !=null){
                    reader.close();
                }
                if(writer !=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
       
        // delete the original file 
        File originaFile = new File(filename);
        if(!originaFile.delete()){
            System.out.println("Failed to delte the orginal file.");
            return;
        }
        // rename the temporart file to the original file 
        File tempFile = new File(tempfilename);
        if(tempFile.renameTo(originaFile)){
            JOptionPane.showMessageDialog(null, "Student Updated Successfully", "!Done",
            JOptionPane.INFORMATION_MESSAGE);

        }else{
            System.out.println("Failed to rename the temporary file.");
        }
    }

    // for due fess
    private static void duesection() {
        JFrame duefees = new JFrame();
        duefees.setSize(800, 400);
        JTable tab = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 330, 150, 25);
        tab.setModel(model);
        model.addColumn("Roll No");
        model.addColumn("Name");
        model.addColumn("Due");

        // function for taking data from student data wheare someone has the due amount
        // of fees
        getdata(model);

        // Create a scroll pane and add the table to it
        JScrollPane scrollPane = new JScrollPane(tab);
        scrollPane.setBounds(50, 50, 700, 250);

        // add all aliment to the duefees
        duefees.add(backButton);
        duefees.add(scrollPane);
        duefees.setLayout(new BorderLayout());
        duefees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        duefees.setVisible(true);
        // adding action listner on back button
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                duefees.dispose();
            }
        });
    }

    private static void getdata(DefaultTableModel model) {
        String filename = "student_data.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Check if the line contains valid data
                if (data.length == 12) {
                    String rollNo = data[0];
                    String name = data[1];
                    String due = data[6];

                    // You can specify your condition here
                    int dueValue = Integer.parseInt(due);
                    if (dueValue > 0) {
                        model.addRow(new Object[] { rollNo, name, due });
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        loadnextrollno();
        new feerecept();
    }
}
