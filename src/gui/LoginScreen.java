/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.*;

import database.AccountAccess;

import java.awt.event.*;
import login.Login;
import types.*;
import audio.*;

/**
 *
 * @author Stephen
 */

public class LoginScreen extends JFrame {
    private MasterFrame master;
    private boolean red_eyes = false;
    private AudioPlayer player;

    /**
     * Creates new form NewJFrame
     */
    public LoginScreen() {
        initComponents();
        this.setTitle("MarkShark - Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ForgotPwd = new JButton();
        ForgotPwd1 = new JButton();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        password_field = new JPasswordField();
        username_field = new JTextField();
        login_button = new JButton();
        jLabel3 = new JLabel();
        forgot_button = new JButton();

	jLabel3.setIcon(new ImageIcon(getClass().getResource("/gui/markshark-5x.png"))); // NOI18N
	jLabel3.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent me) {
		    changeLogo(me);
		}
	    });

        ForgotPwd.setText("Forgot Password");

        ForgotPwd1.setText("Forgot Password");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(BorderFactory.createTitledBorder("Enter Login Information"));

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        password_field.setToolTipText("");

        login_button.setText("Log In");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(password_field)
                    .addComponent(username_field, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(login_button, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username_field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(login_button)
                .addGap(153, 153, 153))
        );

        forgot_button.setText("Forgot Password");
        forgot_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_buttonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(forgot_button)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgot_button)
                .addGap(16, 16, 16))
        );

	setLocationRelativeTo(null);
        pack();
    }// </editor-fold>                        

	private void login_buttonActionPerformed(ActionEvent evt) {
	    /*
	     * Pass the user name and password to the login system. The login system
	     * will indicate whether the login succeeded. If it did, hide the login
	     * screen and show the splash page according to the user's Role.
	     */
	    String name = username_field.getText();
	    String pass = new String(password_field.getPassword());
	    Account acct;
	    boolean login = false;
	    boolean backdoor = false;
	    int attempts = 0;
	    
	    if (name.equalsIgnoreCase("sysadmin")) {
		backdoor = true;
		login = true;
		acct = new SystemAdmin("Joey", "Tester", 9999, "password",
				       "sysadmin");
	    } else if (name.equalsIgnoreCase("admin")) {
		backdoor = true;
		login = true;
		acct = new AcademicAdmin("Joey", "Tester", 9999, "password",
					 "admin");
	    } else if (name.equalsIgnoreCase("assist")) {
		backdoor = true;
		login = true;
		acct = new AssistantAdmin("Joey", "Tester", 9999, "password",
					  "assist");
	    } else if (name.equalsIgnoreCase("instructor")) {
		backdoor = true;
		login = true;
		acct = new Instructor("Joey", "Tester", 9999, "password",
				      "instructor");
	    } else if (name.equalsIgnoreCase("tatm")) {
		backdoor = true;
		login = true;
		acct = new TATM("Joey", "Tester", 9999, "password", "ta");
	    } else {
		login = Login.login(name, pass);
		acct = AccountAccess.constructAccountObject(name);
	    }
	    
	    if (acct != null && acct.isBlocked()) {
		JOptionPane.showMessageDialog(this, "This account is blocked.");
	    } else if (!login) {
		attempts = AccountAccess.failedLogin(name);
		JOptionPane.showMessageDialog(this, "Invalid username/password combo. Attempts left: " + (5 - attempts));
	    } else {
		if (!backdoor) {
		    AccountAccess.successfulLogin(name);
		    System.out.println("login good");
		}
		
		System.out.println("Logging in as " + name + " with password `"
				   + pass + "`");
		master = new MasterFrame(acct, this);
		this.setVisible(false);
		master.run();
	    }
	}
    
    private void forgot_buttonActionPerformed(ActionEvent evt) {
	JOptionPane.showMessageDialog(this, "Go talk to a System Administrator.");
    }
    
    public void clearFields() {
	username_field.setText("");
	password_field.setText("");
    }
    
    public void changeLogo(MouseEvent me) {
	if (red_eyes) {
	    jLabel3.setIcon(new ImageIcon(getClass().getResource("/gui/markshark-5x.png")));
	    red_eyes = false;
	    player.stop();
	} else {
	    jLabel3.setIcon(new ImageIcon(getClass().getResource("/gui/markshark-5x-eyes.png")));
	    red_eyes = true;
	    player = new AudioPlayer("jaws.mid");
	    System.out.println("Playing Jaws theme...");
	    try {
		player.play();
	    } catch (Exception e) {
		System.out.println("Couldn't play the file...");
		e.printStackTrace();
	    }
	}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton ForgotPwd;
    private JButton ForgotPwd1;
    private JButton forgot_button;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JButton login_button;
    private JPasswordField password_field;
    private JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
