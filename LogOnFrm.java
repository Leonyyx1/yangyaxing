package com;


import java.awt.*;
import javax.swing.*;


public class LogOnFrm extends javax.swing.JFrame {

	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JLabel jLabel1;
	//GEN-END:initComponents
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton jb_logOn;
	private javax.swing.JButton jb_reset;
	private javax.swing.JRadioButton jrb_admin;
	private javax.swing.JRadioButton jrb_student;
	private javax.swing.JPasswordField passwordTxt;
	private javax.swing.JFormattedTextField userNameTxt;
	/** Creates new form LogOnFrm */
	public LogOnFrm() {
		Font font = new Font("Dialog", Font.PLAIN, 12);
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, font);
			}
		}
		initComponents();
		this.setLocationRelativeTo(null);
		this.jrb_student.setSelected(true);
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LogOnFrm().setVisible(true);
			}
		});
	}

	
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		userNameTxt = new javax.swing.JFormattedTextField();
		jLabel3 = new javax.swing.JLabel();
		jrb_student = new javax.swing.JRadioButton();
		jrb_admin = new javax.swing.JRadioButton();
		jb_logOn = new javax.swing.JButton();
		jb_reset = new javax.swing.JButton();
		passwordTxt = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u7528\u6237\u767b\u5f55");
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("����", 1, 24));
		jLabel1
				.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\sys.png")); // NOI18N
		jLabel1.setText("\u5b66\u751f\u9009\u8bfe\u7cfb\u7edf");

		jLabel2
				.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\userName.png")); // NOI18N
		jLabel2.setText("\u8d26\u53f7");

		jLabel3
				.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\password.png")); // NOI18N
		jLabel3.setText("\u5bc6\u7801");

		buttonGroup1.add(jrb_student);
		
		jrb_student
				.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\student.png")); // NOI18N

		buttonGroup1.add(jrb_admin);
		
		jrb_admin.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\admin.png")); // NOI18N

		jb_logOn.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\login.png")); // NOI18N
		jb_logOn.setText("\u767b\u5f55");
		jb_logOn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_logOnActionPerformed(evt);
			}
		});
		JLabel lblNewLabel_2 = new JLabel("\u6211\u7684\u8EAB\u4EFD\u662F\uFF1A");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(105, 150, 97, 15);
	

		final Choice choice = new Choice();
		choice.setBounds(210, 147, 74, 21);
		choice.add("ѧ��");
		choice.add("��ʦ");
		choice.add("ϵͳ����Ա");

		jb_reset
				.setIcon(new javax.swing.ImageIcon(
						"D:\\Workspaces\\MyEclipse 8.5\\CourseSys\\src\\com\\jakey\\view\\image\\reset.png")); // NOI18N
		jb_reset.setText("ע��");
		jb_reset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_resetActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(106, 106, 106)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel1)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addGap(
																												33,
																												33,
																												33))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2)
																										.addGap(
																												33,
																												33,
																												33)))
																		.addGap(
																				6,
																				6,
																				6)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								passwordTxt,
																								0,
																								0,
																								Short.MAX_VALUE)
																						.addComponent(
																								userNameTxt,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								135,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jb_logOn)
																														.addComponent(
																																jrb_student))
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGap(
																																				29,
																																				29,
																																				29)
																																		.addComponent(
																																				jb_reset))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jrb_admin,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)))))))
										.addContainerGap(143, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(77, Short.MAX_VALUE)
										.addComponent(jLabel1)
										.addGap(39, 39, 39)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																userNameTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																passwordTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jrb_student)
														.addComponent(jrb_admin))
										.addGap(32, 32, 32)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jb_reset)
														.addComponent(jb_logOn))
										.addGap(58, 58, 58)));
		pack();
	}

	private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void resetValue() {
		this.userNameTxt.setText("");
		this.passwordTxt.setText("");
		this.jrb_student.setSelected(true);
	}

	private void jb_logOnActionPerformed(java.awt.event.ActionEvent evt) {
		String userName = userNameTxt.getText();
		String password = new String(passwordTxt.getPassword());

		if (null == userName || userName.length()==0) {
			JOptionPane.showMessageDialog(this, "�˺Ų���Ϊ��!");
			return;
		}

		if (null == password || password.length()==0) {
			JOptionPane.showMessageDialog(this, "���벻��Ϊ��!");
			return;
		}
		if (this.jrb_student.isSelected()) {
			try{
				if(userName.equals(123) && password.equals(123))
					JOptionPane.showMessageDialog(this, "��½�ɹ�") ;
				SelectC index=new SelectC();
				index.launchListComboAreaTest();
				index.setTitle("ģ��ѧ��ѡ��");
				index.setVisible(true);
				this.dispose();
			}catch (Exception e){
				e.printStackTrace();
			}

		} else if (this.jrb_admin.isSelected()) {
		}
	}
}

