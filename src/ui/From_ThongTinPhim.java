package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class From_ThongTinPhim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					From_ThongTinPhim frame = new From_ThongTinPhim();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public From_ThongTinPhim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(900, 750);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(64, 64, 64));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Thông tin Phim");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\icon\\list.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\icon\\MoDomDom.jpg"));
		
		JLabel lblNewLabel_2 = new JLabel("MỘ ĐOM ĐÓM");
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 32));
		lblNewLabel_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_3 = new JLabel("Thể loại: ");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Courier New", Font.BOLD, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Hoạt hình");
		lblNewLabel_4.setForeground(Color.WHITE);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(66)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_4))
								.addComponent(lblNewLabel_2)))
						.addComponent(lblNewLabel))
					.addContainerGap(551, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(63)
							.addComponent(lblNewLabel_2)
							.addGap(31)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4))))
					.addContainerGap(220, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBackground(new Color(64, 64, 64));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
	}
}
