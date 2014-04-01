/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import database.AccountAccess;
import database.CourseAccess;
import static java.lang.System.in;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.*;

import types.Course;
import types.Instructor;
import types.TextAnalyzer;
import gui.types.*;
import gui.utils.*;

/**
 * 
 * @author Normal
 */
public class CreateCourse extends MSPanel {
    private ArrayList<String> accounts_list;

    /**
     * Creates new form CreateCourse
     */
    public CreateCourse() {
	super("Course Creation");

        initComponents();
    }

	public CreateCourse(final Course course) {
		super("Course Modification");

		initComponents();
		course_name_field.setText(course.getCourseName());
		course_id_field.setText(course.getCourseID());
		instruct_combo.setSelectedItem(course.getInstructor().getFirstName()
				+ " " + course.getInstructor().getLastName() + " - "
				+ course.getInstructor().getEmpID());
		ta_combo.setSelectedItem(course.getTA().getFirstName() + " "
				+ course.getTA().getLastName() + " - "
				+ course.getTA().getEmpID());
		course_start_formatfield.setText(course.getStartDate());
		course_end_formatfield.setText(course.getEndDate());

		for (ActionListener act : submit_button.getActionListeners())
			submit_button.removeActionListener(act);

		submit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				submit_modify_buttonActionPerformed(evt, course.getCourseID());
			}
		});
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create_course_panel = new javax.swing.JPanel();
        course_name_label = new javax.swing.JLabel();
        course_id_label = new javax.swing.JLabel();
        instructor_username_label = new javax.swing.JLabel();
        ta_name_label = new javax.swing.JLabel();
        course_start_label = new javax.swing.JLabel();
        stud_list_label = new javax.swing.JLabel();
        course_end_label = new javax.swing.JLabel();
        course_id_field = new javax.swing.JTextField();
        course_start_formatfield = new javax.swing.JFormattedTextField();
        stud_list_file_location_field = new javax.swing.JTextField();
        choose_file_student_list_button = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        course_name_field = new javax.swing.JTextField();
        course_end_formatfield = new javax.swing.JFormattedTextField();
        ta_combo = new javax.swing.JComboBox();
        ta_field = new javax.swing.JTextField();
        instruct_combo = new javax.swing.JComboBox();
        instructor_field = new javax.swing.JTextField();
        instructor_id_label = new javax.swing.JLabel();
        ta_id_label = new javax.swing.JLabel();

        create_course_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Create A Course"));

        course_name_label.setText("Course Name");

        course_id_label.setText("Course ID");

        instructor_username_label.setText("Instructor Name");

        ta_name_label.setText("TA/Marker Name");

        course_start_label.setText("Course Start Date");

        stud_list_label.setText("Student List (.csv)");

        course_end_label.setText("Course End Date");

        course_start_formatfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        course_start_formatfield.setText("yyyy-MM-dd");
        
        course_end_formatfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        course_end_formatfield.setText("yyyy-MM-dd");

        stud_list_file_location_field.setText("File Location...");

        choose_file_student_list_button.setText("Choose File");
        choose_file_student_list_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_file_student_list_buttonActionPerformed(evt);
            }
        });

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        course_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_name_fieldActionPerformed(evt);
            }
        });

        course_end_formatfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_end_formatfieldActionPerformed(evt);
            }
        });

        ta_combo.setModel(new javax.swing.DefaultComboBoxModel(database.AccountAccess.accessAllTAs()));
        ta_combo.setSelectedIndex(-1);
        ta_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_comboActionPerformed(evt);
            }
        });

        instruct_combo.setModel(new javax.swing.DefaultComboBoxModel(database.AccountAccess.accessAllInstructors()));
        instruct_combo.setSelectedIndex(-1);
        instruct_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruct_comboActionPerformed(evt);
            }
        });

        instructor_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructor_fieldActionPerformed(evt);
            }
        });

        instructor_id_label.setText("Instructor ID");

        ta_id_label.setText("TA/Marker ID");

        javax.swing.GroupLayout create_course_panelLayout = new javax.swing.GroupLayout(create_course_panel);
        create_course_panel.setLayout(create_course_panelLayout);
        create_course_panelLayout.setHorizontalGroup(
            create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_course_panelLayout.createSequentialGroup()
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_course_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_course_panelLayout.createSequentialGroup()
                                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submit_button)
                                    .addGroup(create_course_panelLayout.createSequentialGroup()
                                        .addComponent(stud_list_label)
                                        .addGap(18, 18, 18)
                                        .addComponent(stud_list_file_location_field, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(create_course_panelLayout.createSequentialGroup()
                                        .addComponent(choose_file_student_list_button)
                                        .addGap(0, 99, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_course_panelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cancel_button))))
                            .addGroup(create_course_panelLayout.createSequentialGroup()
                                .addComponent(course_start_label)
                                .addGap(18, 18, 18)
                                .addComponent(course_start_formatfield)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(course_end_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(course_end_formatfield))))
                    .addGroup(create_course_panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_course_panelLayout.createSequentialGroup()
                                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(course_id_label)
                                    .addComponent(course_name_label)
                                    .addComponent(ta_name_label))
                                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(create_course_panelLayout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(course_id_field)
                                            .addComponent(course_name_field)))
                                    .addGroup(create_course_panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ta_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ta_id_label)
                                        .addGap(20, 20, 20)
                                        .addComponent(ta_field))))
                            .addGroup(create_course_panelLayout.createSequentialGroup()
                                .addComponent(instructor_username_label)
                                .addGap(18, 18, 18)
                                .addComponent(instruct_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instructor_id_label)
                                .addGap(18, 18, 18)
                                .addComponent(instructor_field)))))
                .addContainerGap())
        );
        create_course_panelLayout.setVerticalGroup(
            create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_course_panelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_name_label)
                    .addComponent(course_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructor_username_label)
                    .addComponent(instructor_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instruct_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructor_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta_name_label)
                    .addComponent(ta_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_start_label)
                    .addComponent(course_start_formatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_end_label)
                    .addComponent(course_end_formatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stud_list_label)
                    .addComponent(stud_list_file_location_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choose_file_student_list_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_button)
                    .addComponent(cancel_button)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create_course_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(create_course_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void instructor_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructor_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructor_fieldActionPerformed

    private void course_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_name_fieldActionPerformed

    private void course_end_formatfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_end_formatfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_end_formatfieldActionPerformed

    private void ta_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_comboActionPerformed
    	String taField = ta_combo.getSelectedItem().toString();
		taField = taField.substring(taField.indexOf("-") + 2);
		ta_field.setText(taField);
    }//GEN-LAST:event_ta_comboActionPerformed

    private void instruct_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruct_comboActionPerformed
    	String instField = instruct_combo.getSelectedItem().toString();
		instField = instField.substring(instField.indexOf("-") + 2);
		instructor_field.setText(instField);
    }//GEN-LAST:event_instruct_comboActionPerformed
										
	private void submit_buttonActionPerformed(ActionEvent evt) {// GEN-FIRST:event_submit_buttonActionPerformed
		Instructor instructor_taken;
		String instField = instruct_combo.getSelectedItem().toString();
		instField = instField.substring(instField.indexOf("-") + 2);
		int instID = Integer.parseInt(instField);
		instructor_taken = (Instructor) AccountAccess
				.constructAccountObject(AccountAccess.accessUsername(instID));
		Course new_course = new Course(course_name_field.getText(),
				course_id_field.getText(), instructor_taken,
				course_start_formatfield.getText(),
				course_end_formatfield.getText());

		// Add the course to course db
		CourseAccess.createCourse(new_course);

		// Add the TA to the TA table
		String taName = ta_combo.getSelectedItem().toString();
		taName = taName.substring(0, taName.indexOf(" - "));
		System.out.println(taName);
		CourseAccess.addTA(course_id_field.getText(),
				Integer.parseInt(ta_field.getText()), taName);
		if (accounts_list != null) {
			// Add the CSV file
			CourseAccess.clearStudentList(course_id_field.getText());
			String student_name;
			String student_id;

			for (String i : accounts_list) {
				String[] arr = i.split(", ");
				student_name = arr[0];
				student_id = arr[1];

				// Push the student to the database
				CourseAccess
						.addStudent(student_name, Integer.parseInt(student_id),
								course_id_field.getText());
			}
		}

		JOptionPane.showMessageDialog(this,
				"Course " + new_course.getCourseName() + " added.");
		GUIUtils.getMasterFrame(this).goBack();
	}// GEN-LAST:event_submit_buttonActionPerformed

	private void submit_modify_buttonActionPerformed(ActionEvent evt,
			String courseIDToModify) {
		Instructor instructor_taken;
		String instField = instruct_combo.getSelectedItem().toString();
		instField = instField.substring(instField.indexOf("-") + 2);
		int instID = Integer.parseInt(instField);
		instructor_taken = (Instructor) AccountAccess
				.constructAccountObject(AccountAccess.accessUsername(instID));
		Course new_course = new Course(course_name_field.getText(),
				course_id_field.getText(), instructor_taken,
				course_start_formatfield.getText(),
				course_end_formatfield.getText());

		// Add the course to course db
		CourseAccess.modifyCourse(courseIDToModify, new_course);

		// Add the TA to the TA table
		String taName = ta_combo.getSelectedItem().toString();
		taName = taName.substring(0, taName.indexOf(" - "));
		System.out.println(taName);
		CourseAccess.addTA(course_id_field.getText(),
				Integer.parseInt(ta_field.getText()), taName);

		if (accounts_list != null) {
			// Add the CSV file
			CourseAccess.clearStudentList(course_id_field.getText());
			String student_name;
			String student_id;

			for (String i : accounts_list) {
				String[] arr = i.split(", ");
				student_name = arr[0];
				student_id = arr[1];

				// Push the student to the database
				CourseAccess
						.addStudent(student_name, Integer.parseInt(student_id),
								course_id_field.getText());
			}
		}

		JOptionPane.showMessageDialog(this,
				"Course " + new_course.getCourseName() + " modified.");
		GUIUtils.getMasterFrame(this).goBack();
	}
    
    // Purpose is to assign the values of the text file to global variable
    // accounts_list
    // From
    // http://stackoverflow.com/questions/10621687/how-to-get-full-path-directory-from-file-choosers
    private void choose_file_student_list_buttonActionPerformed(ActionEvent evt) {// GEN-FIRST:event_choose_file_student_list_buttonActionPerformed
	JFileChooser chooser = new JFileChooser();
	chooser.setCurrentDirectory(new java.io.File("."));
	chooser.setDialogTitle("choosertitle");
	chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	chooser.setAcceptAllFileFilterUsed(true);
	
	String path_container;
	
	if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    System.out.println("getCurrentDirectory(): "
			       + chooser.getCurrentDirectory());
	    path_container = chooser.getSelectedFile().toString();
	    
	    stud_list_file_location_field.setText(path_container);
	    accounts_list = TextAnalyzer.getInput(path_container);
	    
	    System.out.println("getSelectedFile() : "
			       + chooser.getSelectedFile());
	} else {
	    System.out.println("No Selection");
	    accounts_list = null; // Set the array list accounts_list to null if
	    // nothing initiated.
	}
    }// GEN-LAST:event_choose_file_student_list_buttonActionPerformed

    private void cancel_buttonActionPerformed(ActionEvent evt) {
	GUIUtils.getMasterFrame(this).goBack();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton choose_file_student_list_button;
    private javax.swing.JFormattedTextField course_end_formatfield;
    private javax.swing.JLabel course_end_label;
    private javax.swing.JTextField course_id_field;
    private javax.swing.JLabel course_id_label;
    private javax.swing.JTextField course_name_field;
    private javax.swing.JLabel course_name_label;
    private javax.swing.JFormattedTextField course_start_formatfield;
    private javax.swing.JLabel course_start_label;
    private javax.swing.JPanel create_course_panel;
    private javax.swing.JComboBox instruct_combo;
    private javax.swing.JTextField instructor_field;
    private javax.swing.JLabel instructor_id_label;
    private javax.swing.JLabel instructor_username_label;
    private javax.swing.JTextField stud_list_file_location_field;
    private javax.swing.JLabel stud_list_label;
    private javax.swing.JButton submit_button;
    private javax.swing.JComboBox ta_combo;
    private javax.swing.JTextField ta_field;
    private javax.swing.JLabel ta_id_label;
    private javax.swing.JLabel ta_name_label;
    // End of variables declaration//GEN-END:variables
}
