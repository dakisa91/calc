/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/**
 *
 * @author ForTheWind
 */
public class NewJFrame extends javax.swing.JFrame implements ActionListener {
	private float savedValue = 0;
	private int currentLength = 0;
	private float lastChar = 0;
	private boolean resetFlag = false;
	private Character operation = ' ';
	/**
	 * Creates new form NewJFrame
	 */
	public NewJFrame() {
		initComponents();
		initButtons();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("0");

        jButton2.setText("1");

        jButton3.setText("2");

        jButton4.setText("3");

        jButton5.setText("4");

        jButton6.setText("5");

        jButton7.setText("6");

        jButton8.setText("7");

        jButton9.setText("8");

        jButton10.setText("9");

        jButton11.setText("←");

        jButton12.setText("CE");

        jButton13.setText("C");

        jButton14.setText("±");

        jButton15.setText(".");

        jButton16.setText("+");

        jButton17.setText("-");

        jButton18.setText("*");

        jButton19.setText("=");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton15)
                            .addComponent(jButton16))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
	private void initButtons()
	{
		this.jButton1.addActionListener(this);
		this.jButton2.addActionListener(this);
		this.jButton3.addActionListener(this);
		this.jButton4.addActionListener(this);
		this.jButton5.addActionListener(this);
		this.jButton6.addActionListener(this);
		this.jButton7.addActionListener(this);
		this.jButton8.addActionListener(this);
		this.jButton9.addActionListener(this);
		this.jButton10.addActionListener(this);
		this.jButton11.addActionListener(this);
		this.jButton12.addActionListener(this); // not done yet
		this.jButton12.setVisible(false);
		this.jButton13.addActionListener(this);
		this.jButton14.addActionListener(this);
		this.jButton15.addActionListener(this);
		this.jButton16.addActionListener(this);
		this.jButton17.addActionListener(this);
		this.jButton18.addActionListener(this);
		this.jButton19.addActionListener(this);
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/*
		 * Set the Nimbus look and feel
		 */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewJFrame().setVisible(true);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String commandOrValue = e.getActionCommand();
		char myChar = (commandOrValue.toCharArray())[0];
		
		if(Character.isDigit(myChar) || myChar == '.')
		{
		//	if(this.savedValue == 0)
		//	{
			if(this.resetFlag)
			{
				jTextField1.setText("");
				this.resetFlag = false;
			}
			String oldValue = jTextField1.getText();
			jTextField1.setText(oldValue + Character.toString(myChar));
			this.currentLength ++;
		//	}
		//	else
		//	{
				
		//	}
		}
		else
		{ // an operation is performed
			switch(myChar)
			{
				case '←':
				{
					try {
						jTextField1.setText(jTextField1.getText(0, currentLength-1));
						this.currentLength = currentLength-1;
					} catch (BadLocationException ex) {
						System.out.println("invalid index");;
					}
					break;
				}
				case 'C':
				{
					jTextField1.setText("");
					this.currentLength = 0;
					this.savedValue = 0;
					this.operation = '0';
					break;
				}
				case '+':
				{
					//check if there is a savedValue ( something to + with )
					if(this.savedValue == 0)
					{
						try{
							this.lastChar = Float.parseFloat(jTextField1.getText());
							this.savedValue = Float.parseFloat(jTextField1.getText());
							jTextField1.setText("");
							this.operation = '+';
						}catch(Exception Excep){
							
						}
						break;
					}
					else
					{
						if(this.jTextField1.getText().equals(""))
						{
							break;
						}
						if(Float.parseFloat(this.jTextField1.getText()) == this.savedValue)
						{
							System.out.println("empty string (+)");
							jTextField1.setText(Float.toString(this.savedValue + this.lastChar));
							this.savedValue = this.savedValue + this.lastChar;
							break;
						}
						this.lastChar = Float.parseFloat(jTextField1.getText());
						this.savedValue = this.savedValue + Float.parseFloat(jTextField1.getText());
						jTextField1.setText(Float.toString(this.savedValue));
						this.operation = '+';
						this.resetFlag = true;
						break;
					}
				}
				case '-':
				{
					//check if there is a savedValue ( something to + with )
					if(this.savedValue == 0)
					{
						try{
							this.lastChar = Float.parseFloat(jTextField1.getText());
							this.savedValue = Float.parseFloat(jTextField1.getText());
							jTextField1.setText("");
							this.operation = '-';
						}catch(Exception Exc)
						{
						}
						break;
					}
					else
					{
						if(this.jTextField1.getText().equals(""))
						{
							break;
						}
						if(Float.parseFloat(this.jTextField1.getText()) == this.savedValue)
						{
							System.out.println("empty string (-)");
							jTextField1.setText(Float.toString(this.savedValue - this.lastChar));
							this.savedValue = this.savedValue - this.lastChar;
							break;
						}
						this.lastChar = Float.parseFloat(jTextField1.getText());
						this.savedValue = this.savedValue - Float.parseFloat(jTextField1.getText());
						jTextField1.setText(Float.toString(this.savedValue));
						this.operation = '-';
						this.resetFlag = true;
						break;
					}
				}
				case '=':
				{
					//check if there is a savedValue ( something to + with )
					if(this.savedValue == 0)
					{
						break;
					}
					else
					{
						switch(this.operation)
						{
							case '+':
							{
								try{
									jTextField1.setText(Float.toString(this.savedValue + Float.parseFloat(jTextField1.getText())));
								}catch(Exception Ex){
									jTextField1.setText(Float.toString(this.savedValue));
								}
								this.savedValue = 0;
								this.operation = '0';
								this.resetFlag = true;
								break;
							}
							case '-':
							{
								try{
									jTextField1.setText(Float.toString(this.savedValue - Float.parseFloat(jTextField1.getText())));
								}catch(Exception Ex){
									jTextField1.setText(Float.toString(this.savedValue));
								}
								this.savedValue = 0;
								this.operation = '0';
								this.resetFlag = true;
								break;
							}
						}
					}
				}
			}
		}
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
