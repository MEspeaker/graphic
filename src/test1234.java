import javax.swing.border.LineBorder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.event.*;
import javax.swing.ImageIcon;


public class test1234 {


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1234 window = new test1234();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test1234() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] country= {"가나","감비아","나이지리아","123","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아","감비아",};
		frame = new JFrame();
		frame.setTitle("나라사랑카드"); // 프레임타이틀
		frame.setResizable(false); // 프레임 크기조절 x
		frame.setBounds(100, 100, 928, 566);
		frame.setLocationRelativeTo(null); // 실행시 화면정중앙
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 종료
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel(); //한국패널
		panel.setBounds(58, 25, 259, 428); // 패널위치
		panel.setBackground(Color.white); //패널색 흰색
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel2 = new JPanel(); //외국패널
		panel2.setBounds(408, 25, 259, 428); // 패널위치
		panel2.setBackground(Color.white); //패널색 흰색
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel(); //검색패널
		panel3.setBounds(670, 25, 250, 428); // 패널위치
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		//태극기 이미지 라벨
		JLabel klabel = new JLabel();
		klabel.setBounds(12, 5, 235, 158);
		ImageIcon img=new ImageIcon(test1234.class.getResource("/image/korea3.png"));//이미지
        klabel.setIcon(img);
		panel.add(klabel);
		//한국 국가코드 라벨
		JLabel kCodeLabel= new JLabel("◈ KOR");
		kCodeLabel.setBounds(35,200, 100, 20);
		kCodeLabel.setFont(new Font("HY엽서M", Font.BOLD, 20));
		panel.add(kCodeLabel);
		//한국 수도 라벨
		JLabel kCapitalLabel= new JLabel("◈ 서울");
		kCapitalLabel.setBounds(35,230, 100, 20);
		kCapitalLabel.setFont(new Font("HY엽서M", Font.BOLD, 20));
		panel.add(kCapitalLabel);
		//한국 언어 라벨
		JLabel kLangLabel= new JLabel("◈ 한국어");
		kLangLabel.setBounds(35,260, 100, 20);
		 kLangLabel.setFont(new Font("HY엽서M", Font.BOLD, 20));
		panel.add(kLangLabel);
		//외국 국기라벨
		JLabel foreignLabel = new JLabel("New label");
		foreignLabel.setBounds(12, 5, 235, 158);
		panel2.add(foreignLabel);

		JButton kbtn = new JButton();
		kbtn.setBounds(0, 0, 259, 428); // x,y,width,height
		kbtn.setBackground(Color.white); //버튼색 흰색
		// btnNewButton.setContentAreaFilled(false); // 버튼채우기 X
		// btnNewButton.setBorderPainted(false); // 버튼테두리해제
		kbtn.setBorder(new LineBorder(Color.BLACK)); // 버튼테두리색상
		panel.add(kbtn); // 패널에 버튼추가
		kbtn.setOpaque(false); // 버튼 투명하게
		
		JButton foreignBtn = new JButton();
		foreignBtn.setBounds(0, 0, 259, 428); // x,y,width,height
		foreignBtn.setBackground(Color.white); //버튼색 흰색
		// btnNewButton.setContentAreaFilled(false); // 버튼채우기 X
		// btnNewButton.setBorderPainted(false); // 버튼테두리해제
		foreignBtn.setBorder(new LineBorder(Color.BLACK)); // 버튼테두리색상
		panel2.add(foreignBtn); // 패널에 버튼추가
		foreignBtn.setOpaque(false); // 버튼 투명하게
		//나라 검색스크롤
		JScrollPane scrollPane = new JScrollPane(); 
		scrollPane.setBounds(0, 50, 240, 370);
		panel3.add(scrollPane);
		JList list= new JList(country);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		//나라 검색창
		JTextField search= new JTextField();
		search.setBounds(0,0, 180,30);
		panel3.add(search);
		//나라 검색버튼
		JButton searchBtn= new JButton("검색");
		searchBtn.setBounds(180,0, 60,30);
		panel3.add(searchBtn);
		
		//csv버튼 패널
		JPanel panel4 = new JPanel();
		panel4.setBounds(12, 463, 890, 56);
		frame.getContentPane().add(panel4);
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); //가운데 정렬
		JButton csvBtn= new JButton("CSV파일 읽기");
		panel4.add(csvBtn);
		JButton dbBtn= new JButton("읽은 파일 DB에 저장");
		panel4.add(dbBtn);
		
		// 한국버튼 리스너
		kbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kbtn.setVisible(false);
			}
		});
		//외국 버튼 리스너
		foreignBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//foreignBtn.setVisible(false);
			}
		});
		//검색 버튼 리스너
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
				String result= search.getText(); //입력한 값을 받아옴
			
			}
		});
		

	}
}