package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class From_danhSachPhim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTimPHim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					From_danhSachPhim frame = new From_danhSachPhim();
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
	public From_danhSachPhim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(900, 750);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(64, 64, 64));
		pnlNorth.setPreferredSize(new Dimension(1000, 50));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblDS = new JLabel("Danh sách phim");
		lblDS.setFont(new Font("Courier New", Font.BOLD, 14));
		lblDS.setIcon(new ImageIcon("D:\\Hoc_Tap\\Nam3_HK1\\LT_SK_Java\\Team\\QuanLyRapChieuPhim\\src\\icon\\list.png"));
		lblDS.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Tìm kiếm phim:");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		
		textTimPHim = new JTextField();
		textTimPHim.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		
		JLabel lblNewLabel_1 = new JLabel("logo");
		lblNewLabel_1.setForeground(Color.WHITE);
		GroupLayout gl_pnlNorth = new GroupLayout(pnlNorth);
		gl_pnlNorth.setHorizontalGroup(
			gl_pnlNorth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlNorth.createSequentialGroup()
					.addGap(26)
					.addComponent(lblDS)
					.addGap(46)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textTimPHim, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnNewButton)
					.addGap(95)
					.addComponent(lblNewLabel_1)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_pnlNorth.setVerticalGroup(
			gl_pnlNorth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlNorth.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlNorth.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textTimPHim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_1)
						.addComponent(lblDS))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		pnlNorth.setLayout(gl_pnlNorth);
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(64, 64, 64));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JPanel pnlPhim1 = new JPanel();
		pnlPhim1.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1.setBackground(new Color(64, 64, 64));
		
		JPanel pnlPhim1_1 = new JPanel();
		pnlPhim1_1.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1_1.setBackground(Color.DARK_GRAY);
		
		JButton btnDatVe_1 = new JButton("Mua Vé");
		btnDatVe_1.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_1 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_1 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_1 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Courier New", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_1 = new JLabel("ảnh phim");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim1_1 = new GroupLayout(pnlPhim1_1);
		gl_pnlPhim1_1.setHorizontalGroup(
			gl_pnlPhim1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_1)
					.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_1)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_1)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDatVe_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlPhim1_1.setVerticalGroup(
			gl_pnlPhim1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1_1.createSequentialGroup()
					.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe_1)
					.addGap(21))
		);
		pnlPhim1_1.setLayout(gl_pnlPhim1_1);
		
		JPanel pnlPhim1_2 = new JPanel();
		pnlPhim1_2.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1_2.setBackground(Color.DARK_GRAY);
		
		JButton btnDatVe_2 = new JButton("Mua Vé");
		btnDatVe_2.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_2 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_2 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_2 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Courier New", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_2 = new JLabel("ảnh phim");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim1_2 = new GroupLayout(pnlPhim1_2);
		gl_pnlPhim1_2.setHorizontalGroup(
			gl_pnlPhim1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_2)
					.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_2)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_2)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDatVe_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlPhim1_2.setVerticalGroup(
			gl_pnlPhim1_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1_2.createSequentialGroup()
					.addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe_2)
					.addGap(21))
		);
		pnlPhim1_2.setLayout(gl_pnlPhim1_2);
		
		JPanel pnlPhim1_4 = new JPanel();
		pnlPhim1_4.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1_4.setBackground(Color.DARK_GRAY);
		
		JButton btnDatVe_4 = new JButton("Mua Vé");
		btnDatVe_4.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_4 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_4 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_4 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Courier New", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_4 = new JLabel("ảnh phim");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim1_4 = new GroupLayout(pnlPhim1_4);
		gl_pnlPhim1_4.setHorizontalGroup(
			gl_pnlPhim1_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_4)
					.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_4)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_4)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDatVe_4, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlPhim1_4.setVerticalGroup(
			gl_pnlPhim1_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1_4.createSequentialGroup()
					.addComponent(lblNewLabel_2_4, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe_4)
					.addGap(21))
		);
		pnlPhim1_4.setLayout(gl_pnlPhim1_4);
		
		JPanel pnlPhim1_5 = new JPanel();
		pnlPhim1_5.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1_5.setBackground(Color.DARK_GRAY);
		
		JButton btnDatVe_5 = new JButton("Mua Vé");
		btnDatVe_5.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_5 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_5 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_5 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_5.setFont(new Font("Courier New", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_5 = new JLabel("ảnh phim");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim1_5 = new GroupLayout(pnlPhim1_5);
		gl_pnlPhim1_5.setHorizontalGroup(
			gl_pnlPhim1_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_5)
					.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_5)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_5)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDatVe_5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlPhim1_5.setVerticalGroup(
			gl_pnlPhim1_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1_5.createSequentialGroup()
					.addComponent(lblNewLabel_2_5, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe_5)
					.addGap(21))
		);
		pnlPhim1_5.setLayout(gl_pnlPhim1_5);
		
		JPanel pnlPhim1_6 = new JPanel();
		pnlPhim1_6.setBorder(new LineBorder(new Color(211, 211, 211)));
		pnlPhim1_6.setBackground(Color.DARK_GRAY);
		
		JButton btnDatVe_6 = new JButton("Mua Vé");
		btnDatVe_6.setBackground(new Color(255, 69, 0));
		
		JLabel lblNewLabel_5_6 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4_6 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3_6 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3_6.setForeground(Color.WHITE);
		lblNewLabel_3_6.setFont(new Font("Courier New", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_6 = new JLabel("ảnh phim");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		GroupLayout gl_pnlPhim1_6 = new GroupLayout(pnlPhim1_6);
		gl_pnlPhim1_6.setHorizontalGroup(
			gl_pnlPhim1_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5_6)
					.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_6)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_6)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDatVe_6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlPhim1_6.setVerticalGroup(
			gl_pnlPhim1_6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1_6.createSequentialGroup()
					.addComponent(lblNewLabel_2_6, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5_6)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe_6)
					.addGap(21))
		);
		pnlPhim1_6.setLayout(gl_pnlPhim1_6);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlPhim1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_4, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlPhim1_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_5, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addGap(116)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlPhim1_2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_6, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(170, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlPhim1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_2, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlPhim1_4, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_6, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPhim1_5, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(134, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_2 = new JLabel("ảnh phim");
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("Mộ Đom Đóm");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Courier New", Font.BOLD, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Thể loại: Hoạt Hình");
		lblNewLabel_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("Thời Lượng: 89 phút");
		lblNewLabel_5.setForeground(Color.WHITE);
		
		JButton btnDatVe = new JButton("Mua Vé");
		btnDatVe.setBackground(new Color(255, 69, 0));
		GroupLayout gl_pnlPhim1 = new GroupLayout(pnlPhim1);
		gl_pnlPhim1.setHorizontalGroup(
			gl_pnlPhim1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5)
					.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDatVe, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlPhim1.setVerticalGroup(
			gl_pnlPhim1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlPhim1.createSequentialGroup()
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDatVe)
					.addGap(21))
		);
		pnlPhim1.setLayout(gl_pnlPhim1);
		pnlCenter.setLayout(gl_pnlCenter);
	}
}
