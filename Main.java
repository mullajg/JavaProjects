import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField lastNameInput;
	private JTextField firstNameInput;
	private JTextField middleNameInput;
	private JTextField dOBInput;
	private JTextField phoneNumInput;
	private JTextField gradDateInput;
	private JTextField tuIDInput;
	private JTextField emailAddressInput;
	private JTextField majorInput;
	private JTextField undergradInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public Main() throws FileNotFoundException {
		
		PrintWriter outputStream = new PrintWriter("studentInfo.txt");
		setTitle("Student Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 139, 0, 0};
		gbl_contentPane.rowHeights = new int[]{31, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 25, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_10 = new JLabel("Please enter the following");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 0;
		contentPane.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel = new JLabel("Last Name:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		lastNameInput = new JTextField();
		GridBagConstraints gbc_lastNameInput = new GridBagConstraints();
		gbc_lastNameInput.insets = new Insets(0, 0, 5, 0);
		gbc_lastNameInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_lastNameInput.gridx = 2;
		gbc_lastNameInput.gridy = 1;
		contentPane.add(lastNameInput, gbc_lastNameInput);
		lastNameInput.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		firstNameInput = new JTextField();
		GridBagConstraints gbc_firstNameInput = new GridBagConstraints();
		gbc_firstNameInput.insets = new Insets(0, 0, 5, 0);
		gbc_firstNameInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_firstNameInput.gridx = 2;
		gbc_firstNameInput.gridy = 2;
		contentPane.add(firstNameInput, gbc_firstNameInput);
		firstNameInput.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Middle Name:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		middleNameInput = new JTextField();
		GridBagConstraints gbc_middleNameInput = new GridBagConstraints();
		gbc_middleNameInput.insets = new Insets(0, 0, 5, 0);
		gbc_middleNameInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_middleNameInput.gridx = 2;
		gbc_middleNameInput.gridy = 3;
		contentPane.add(middleNameInput, gbc_middleNameInput);
		middleNameInput.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		dOBInput = new JTextField();
		GridBagConstraints gbc_dOBInput = new GridBagConstraints();
		gbc_dOBInput.insets = new Insets(0, 0, 5, 0);
		gbc_dOBInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_dOBInput.gridx = 2;
		gbc_dOBInput.gridy = 4;
		contentPane.add(dOBInput, gbc_dOBInput);
		dOBInput.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Phone Number:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 5;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		phoneNumInput = new JTextField();
		GridBagConstraints gbc_phoneNumInput = new GridBagConstraints();
		gbc_phoneNumInput.insets = new Insets(0, 0, 5, 0);
		gbc_phoneNumInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneNumInput.gridx = 2;
		gbc_phoneNumInput.gridy = 5;
		contentPane.add(phoneNumInput, gbc_phoneNumInput);
		phoneNumInput.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Expected Graduation Date:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 6;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		gradDateInput = new JTextField();
		GridBagConstraints gbc_gradDateInput = new GridBagConstraints();
		gbc_gradDateInput.insets = new Insets(0, 0, 5, 0);
		gbc_gradDateInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_gradDateInput.gridx = 2;
		gbc_gradDateInput.gridy = 6;
		contentPane.add(gradDateInput, gbc_gradDateInput);
		gradDateInput.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("TUID:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 7;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		tuIDInput = new JTextField();
		GridBagConstraints gbc_tuIDInput = new GridBagConstraints();
		gbc_tuIDInput.insets = new Insets(0, 0, 5, 0);
		gbc_tuIDInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_tuIDInput.gridx = 2;
		gbc_tuIDInput.gridy = 7;
		contentPane.add(tuIDInput, gbc_tuIDInput);
		tuIDInput.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Email Address:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 8;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		emailAddressInput = new JTextField();
		GridBagConstraints gbc_emailAddressInput = new GridBagConstraints();
		gbc_emailAddressInput.insets = new Insets(0, 0, 5, 0);
		gbc_emailAddressInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailAddressInput.gridx = 2;
		gbc_emailAddressInput.gridy = 8;
		contentPane.add(emailAddressInput, gbc_emailAddressInput);
		emailAddressInput.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Major:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 9;
		contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		majorInput = new JTextField();
		GridBagConstraints gbc_majorInput = new GridBagConstraints();
		gbc_majorInput.insets = new Insets(0, 0, 5, 0);
		gbc_majorInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_majorInput.gridx = 2;
		gbc_majorInput.gridy = 9;
		contentPane.add(majorInput, gbc_majorInput);
		majorInput.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Are you an Undergradatue?:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 10;
		contentPane.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		undergradInput = new JTextField();
		GridBagConstraints gbc_undergradInput = new GridBagConstraints();
		gbc_undergradInput.insets = new Insets(0, 0, 5, 0);
		gbc_undergradInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_undergradInput.gridx = 2;
		gbc_undergradInput.gridy = 10;
		contentPane.add(undergradInput, gbc_undergradInput);
		undergradInput.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnSubmit){
					String lastName = lastNameInput.getText();
					lastNameInput.setText("");
					String firstName = firstNameInput.getText();
					firstNameInput.setText("");
					String middleName = middleNameInput.getText();
					middleNameInput.setText("");
					String dOB = dOBInput.getText();
					dOBInput.setText("");
					String phoneNum = phoneNumInput.getText();
					phoneNumInput.setText("");
					String gradDate = gradDateInput.getText();
					gradDateInput.setText("");
					String tuID = tuIDInput.getText();
					tuIDInput.setText("");
					String emailAddress = emailAddressInput.getText();
					emailAddressInput.setText("");
					String major = majorInput.getText();
					majorInput.setText("");
					String undergrad = undergradInput.getText();
					undergradInput.setText("");
						if (tuID.length() == 9){
							JOptionPane.showMessageDialog(null, "Last Name: " + lastName + "\nFirst Name: " + firstName
									+ "\nMiddle Name: " + middleName + "\nDate of Birth: " + dOB + "\nPhone Number: " + phoneNum
									+ "\nExpected Graduation Date: " + gradDate + "\nTUID: " + tuID + "\nemailAddress: " + emailAddress
									+ "\nMajor: " + major + "\nUndergrad?: " + undergrad);
								outputStream.println(lastName);
								outputStream.println(firstName);
								outputStream.println(middleName);
								outputStream.println(dOB);
								outputStream.println(phoneNum);
								outputStream.println(tuID);
								outputStream.println(gradDate);
								outputStream.println(emailAddress);
								outputStream.println(major);
								outputStream.println(undergrad);
								outputStream.println("");
							
							}
						
						
						}
						else{
							JOptionPane.showMessageDialog(null, "TUID must be 9 characters long. Please try agian.");
						}
					}
			
		 
		}
		
		);
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 12;
		contentPane.add(btnSubmit, gbc_btnSubmit);
		
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				outputStream.close();
				e.getWindow().dispose();
			}
				});
		
	}

}
