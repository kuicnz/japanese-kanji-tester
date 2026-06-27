import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

import javax.swing.*;

public class Kanji extends JPanel 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel display;          
	private JTextField answerInput;  
	private JButton button;          

	private String question;   
	
	private static ArrayList<String> questionList = new ArrayList<String>();
	private static ArrayList<String> answerList = new ArrayList<String>();

	private int correctFirstTry;     // number of questions answered correctly by the user on the first try
	private int incorrect;           // number of questions not answered correctly after two tries
	
	private final static int STARTING = 0;   // represents the "state" before any questions have been asked
	private final static int FIRST_TRY = 1;  // the state while waiting for the first answer to a question

	private int state = STARTING; 

	public static void main(String[] args) {
		JFrame window = new JFrame("Kanji Quiz");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new Kanji());
		window.pack();
		window.setLocation(80,40);
		window.setVisible(true);
		addQuestions(questionList);
		addAnswers(answerList);
	}
	

	public Kanji() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.LIGHT_GRAY));
		display = new JLabel("<html><center><big><b>日本語漢字クイズ</b></big>" 
				+ "<br><br>Click \"開始\" to start.<br>", JLabel.CENTER);
		display.setPreferredSize(new Dimension(500,180));
		display.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		add(display,BorderLayout.CENTER);
		JPanel bottom = new JPanel();
		bottom.add(new JLabel("答え: "));
		answerInput = new JTextField(4);
		answerInput.setEnabled(false);
		bottom.add(answerInput);
		button = new JButton("開始");
		button.addActionListener( new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent evt) 
			{
				buttonPressed();
			}
		});
		bottom.add(button);
		bottom.setBackground(Color.WHITE);
		add(bottom, BorderLayout.SOUTH);
	}
	
	
	public static void addQuestions(ArrayList<String> list)
	{
		//lesson13
		
		//lesson12
		
		//lesson 11
		list.add("街");
		list.add("喫茶店");
		list.add("真美");
		list.add("寝坊");
		list.add("我慢");
		list.add("暮らす");
		list.add("過ごす");
		list.add("得る");
		list.add("笑顔");
		list.add("気遣う");
		list.add("形容");
		list.add("中略");
		list.add("溶け込む");
		list.add("身振り");
		list.add("積極的");
		list.add("参加");
		list.add("尋ねる");
		list.add("納得");
		list.add("異文化圏");
		list.add("陰");
		list.add("無限");
		list.add("洗濯");
		list.add("薄らぐ");
		list.add("悔やむ");
		list.add("妨げ");
		list.add("無駄");
		list.add("后略");
		list.add("感想文集");
		
		//lesson 10
		list.add("新幹線");
		list.add("時刻表");
		list.add("名古屋");
		list.add("指定席");
		list.add("運賃");
		list.add("預かる");
		list.add("箱根");
		list.add("静かな");
		list.add("宿");
		list.add("眺め");
		list.add("連絡先");
		list.add("風呂");
		list.add("冗談");
		list.add("浴衣");
		list.add("着替える");
		list.add("有効");
		list.add("自然");
		list.add("農業");
		list.add("羊");
		list.add("景色");
		list.add("大阪");
		list.add("横浜");
		list.add("神戸");
		list.add("国際的");
		list.add("芸術");
		list.add("醜い");
		list.add("混雑");
		list.add("批判");
		list.add("秩序");
		list.add("特徴");
		list.add("犯罪");
		list.add("魅力");
		list.add("被害");
		list.add("奈良");
		list.add("城");
		list.add("桜島");
		list.add("温泉");

		//lesson 9
		list.add("贈り物");
		list.add("遠慮");
		list.add("披露宴");
		list.add("紺");
		list.add("坂本");
		list.add("湯のみ");
		list.add("季節");
		list.add("歳暮");
		list.add("親戚");
		list.add("果物");
		list.add("産物");
		list.add("観光");
		list.add("贅沢");
		list.add("悪循環");
		list.add("影響");
		
		//lesson 8
		list.add("対象");
		list.add("詳しい");
		list.add("主婦");
		list.add("親類");
		list.add("翻訳");
		list.add("掲示板");
		list.add("雑誌");
		list.add("編集");
		list.add("雇う");
		list.add("森山");
		list.add("大陸");
		list.add("漂流者");
		list.add("流れ着く");
		list.add("祖先");
		list.add("憧れ");
		list.add("抱く");
		list.add("鎖国");
		list.add("暖かい");
		list.add("船員");
		list.add("陸地");
		list.add("幕府");
		list.add("驚く");
		list.add("長崎");
		list.add("難破");
		list.add("翌年");
		list.add("姪");
		list.add("開国");
		list.add("湾");
		list.add("戻る");
		list.add("条約");
		list.add("立派");
		
		//lesson 7
		list.add("誘う");
		list.add("野球");
		list.add("一緒");
		list.add("喜んで");
		list.add("七十歳");
		list.add("残念");
		list.add("秋葉原");
		list.add("電気街");
		list.add("山手線");
		list.add("京浜東北");
		list.add("快速");
		list.add("改札口");
		list.add("黒沢");
		list.add("監督");
		list.add("オリオン座");
		list.add("徹夜");
		list.add("選手");
		list.add("投げる");
		list.add("三振");
		list.add("活躍");
		list.add("地域");
		list.add("優勝");
		list.add("野球場");
		list.add("応援");
		list.add("出場");
		list.add("名誉");
		list.add("大相撲");
		list.add("力士");

		//lesson6
		list.add("引用");
		list.add("同僚");
		list.add("高橋");
		list.add("丼もの");
		list.add("卵");
		list.add("腰");
		list.add("握る");
		list.add("並");
		list.add("召し上がる");
		list.add("参る");
		list.add("請求書");
		list.add("健一");
		list.add("辺り");
		list.add("腹");
		list.add("面倒");
		list.add("降りる");
		list.add("運転手");
		list.add("荷物");
		list.add("運ぶ");
		list.add("片付ける");
		list.add("食堂");
		list.add("簡単");
		list.add("含む");
		list.add("計算");
		list.add("床屋");
		list.add("美容院");
		list.add("宣伝");

		//lesson5
		list.add("事務員");
		list.add("建物");
		list.add("玄関");
		list.add("貼り紙");
		list.add("発表");
		list.add("場所");
		list.add("佐藤");
		list.add("相談");
		list.add("調子");
		list.add("心配");
		list.add("様子");
		list.add("勧誘");
		list.add("無人島");
		list.add("居酒屋");
		list.add("歓迎会");
		list.add("将来");
		list.add("一流");
		list.add("就職");
		list.add("増える");
		list.add("塾");
		list.add("予備校");
		list.add("落ちる");
		list.add("浪人");
		list.add("傾向");
		list.add("最近");
		list.add("確かに");
		list.add("調査");
		list.add("好く");
		list.add("少子化");
		list.add("関して");
		list.add("講義");
		list.add("年々");
		list.add("減る");
		
		//lesson4
		list.add("許可");
		list.add("財布");
		list.add("背");
		list.add("弁護士");
		list.add("珍しい");
		list.add("全然");
		list.add("州都");
		list.add("知事");
		list.add("皆さん");
		list.add("求める");
		list.add("偶然");
		list.add("暖かい");
		list.add("紅葉");
		list.add("面白い");
		list.add("経験");
		list.add("済む");
		list.add("携帯");
		list.add("熱心に");
		list.add("打つ");
		list.add("料理");
		list.add("物");
		list.add("体重");
		list.add("足りる");
		list.add("伝える");
		
		//lesson3
		list.add("研究室");
		list.add("期末試験");
		list.add("推薦状");
		list.add("奨学金");
		list.add("用紙");
		list.add("紙");
		list.add("締め切り");
		list.add("貸す");
		list.add("熱");
		list.add("寄る");
		list.add("情報");
		list.add("交換");
		list.add("場合");
		list.add("授業料");
		list.add("数");
		list.add("普通");
		list.add("選ぶ");
		list.add("書類選考");
		list.add("面接");
		list.add("成績");
		list.add("性格");
		list.add("態度");
		list.add("優先");
		list.add("単位");
		list.add("認める");
		list.add("交渉");
		list.add("別科");
		list.add("国際学部");
		list.add("歴史");
		list.add("経済");
		list.add("政治");
		list.add("宗教");
		list.add("活動");
		list.add("家庭");
		list.add("希望者");
		list.add("住宅事情");
		
		//lesson2
		list.add("言葉");
		list.add("会釈");
		list.add("頭");
		list.add("鳴る");
		list.add("寮");
		list.add("部屋");
		list.add("同室");
		list.add("寝る");
		list.add("終わる");
		list.add("授業");
		list.add("遅れる");
		list.add("降る");
		list.add("一郎");
		list.add("同級生");
		list.add("質問");
		list.add("病気");
		list.add("非常");
		list.add("寒い");
		list.add("別れる");
		list.add("顔");
		list.add("一般的");
		
		//lesson1
		list.add("紹介");
		list.add("宿題");
		list.add("池田");
		list.add("友達");
		list.add("加藤");
		list.add("僕");
		list.add("趣味");
		list.add("興味");
		list.add("隣");
		list.add("家族");
		list.add("遊ぶ");
		list.add("知識豊富");
		list.add("飛行機");
		list.add("座る");
		list.add("卒業");
		list.add("勤める");
		list.add("週間");
		list.add("休暇");
		list.add("京都");
		list.add("育つ");
		list.add("一晩");
		list.add("両親");
		list.add("名刺");
		list.add("番号");
		list.add("今日");
		list.add("午後");
		list.add("十数時間");
		list.add("日付変更線");
		list.add("空港");
		list.add("迎える");
		list.add("呼ぶ");
		list.add("時差");
		list.add("眠る");
		list.add("連れる");
		list.add("結局");
		list.add("適当");
		list.add("引っ越す");
		list.add("若い");
		list.add("自己");
		list.add("お互い");
		list.add("娘");
		list.add("違う");
	}
	
	public static void addAnswers(ArrayList<String> list)
	{
		//lesson13
		
		//lesson12
		
		//lesson 11
		list.add("まち");
		list.add("きっさてん");
		list.add("まみ");
		list.add("ねぼう");
		list.add("がまん");
		list.add("くらす");
		list.add("すごす");
		list.add("える");
		list.add("えがお");
		list.add("きずかう");
		list.add("けいよう");
		list.add("ちゅうりゃく");
		list.add("とけこむ");
		list.add("みぶり");
		list.add("せっきょくてき");
		list.add("さんか");
		list.add("たずねる");
		list.add("なっとく");
		list.add("いぶんかけん");
		list.add("かげ");
		list.add("むげん");
		list.add("せんたく");
		list.add("うすらぐ");
		list.add("くやむ");
		list.add("さまた");
		list.add("むだ");
		list.add("こうりゃく");
		list.add("かんそうぶんしゅう");
		
		//lesson 10
		list.add("しんかんせん");
		list.add("じこくひょう");
		list.add("なごや");
		list.add("していせき");
		list.add("うんちん");
		list.add("あずかる");
		list.add("はこね");
		list.add("しずかな");
		list.add("やど");
		list.add("ながめ");
		list.add("れんらくさき");
		list.add("ふろ");
		list.add("じょうだん");
		list.add("ゆかた");
		list.add("きがえる");
		list.add("ゆうこう");
		list.add("しぜん");
		list.add("のうぎょう");
		list.add("ひつじ");
		list.add("けしき");
		list.add("おおさか");
		list.add("よこはま");
		list.add("こうべ");
		list.add("こくさいてき");
		list.add("げいじゅつ");
		list.add("みにくい");
		list.add("こんざつ");
		list.add("ひはん");
		list.add("ちつじょ");
		list.add("とくちょう");
		list.add("はんざい");
		list.add("みりょく");
		list.add("ひがい");
		list.add("なら");
		list.add("しろ");
		list.add("さくらじま");
		list.add("おんせん");

		//lesson 9
		list.add("おくりもの");
		list.add("えんりょ");
		list.add("ひろうえん");
		list.add("こん");
		list.add("さかもと");
		list.add("ゆのみ");
		list.add("きせつ");
		list.add("さいぼ");
		list.add("しんせき");
		list.add("くだもの");
		list.add("さんぶつ");
		list.add("かんこう");
		list.add("ぜいたく");
		list.add("あくじゅんかん");
		list.add("えいきょう");
		
		//lesson 8
		list.add("たいしょう");
		list.add("くわしい");
		list.add("しゅふ");
		list.add("しんるい");
		list.add("ほんやく");
		list.add("けいじばん");
		list.add("ざっし");
		list.add("へんしゅう");
		list.add("やとう");
		list.add("もりやま");
		list.add("たいりく");
		list.add("ひょうりゅうしゃ");
		list.add("ながれつく");
		list.add("そせん");
		list.add("あこがれ");
		list.add("いだく");
		list.add("さこく");
		list.add("あたたかい");
		list.add("せんいん");
		list.add("りくち");
		list.add("ばくふ");
		list.add("おどろく");
		list.add("ながさき");
		list.add("なんぱ");
		list.add("よくねん");
		list.add("めい");
		list.add("かいこく");
		list.add("わん");
		list.add("もどる");
		list.add("じょうやく");
		list.add("りっぱ");
		
		//lesson7
		list.add("さそう");
		list.add("やきゅう");
		list.add("いっしょ");
		list.add("よろこんで");
		list.add("ななじゅうさい");
		list.add("ざんえん");
		list.add("あきはばら");
		list.add("でんきがい");
		list.add("やまのてせん");
		list.add("けいひんとうほく");
		list.add("かいそく");
		list.add("かいさつぐち");
		list.add("くろざわ");
		list.add("かんとく");
		list.add("オリオンざ");
		list.add("てつや");
		list.add("せんしゅ");
		list.add("なげる");
		list.add("さんしん");
		list.add("かつやく");
		list.add("ちいき");
		list.add("ゆうしょう");
		list.add("やきゅうじょう");
		list.add("おうえん");
		list.add("しゅつじょう");
		list.add("めいよ");
		list.add("おおずもう");
		list.add("りきし");
		
		//lesson6
		list.add("いんよう");
		list.add("どうりょう");
		list.add("たかはし");
		list.add("どんぶりもの");
		list.add("たまご");
		list.add("こし");
		list.add("にぎる");
		list.add("なみ");
		list.add("めしあがる");
		list.add("まいる");
		list.add("せいきゅうしょ");
		list.add("けんいち");
		list.add("あたり");
		list.add("はら");
		list.add("めんどう");
		list.add("おりる");
		list.add("うんてんしゅ");
		list.add("にもつ");
		list.add("はこぶ");
		list.add("かたずける");
		list.add("しょくどう");
		list.add("かんたん");
		list.add("ふくむ");
		list.add("けいさん");
		list.add("とこや");
		list.add("びよういん");
		list.add("せんでん");
		
		//lesson5
		list.add("じむいん");
		list.add("たてもの");
		list.add("げんかん");
		list.add("はりがみ");
		list.add("はっぴょう");
		list.add("ばしょ");
		list.add("さとう");
		list.add("そうだん");
		list.add("ちょうし");
		list.add("しんぱい");
		list.add("ようす");
		list.add("かんゆう");
		list.add("むじんとう");
		list.add("いざかや");
		list.add("かんげいかい");
		list.add("しょうらい");
		list.add("いちりゅう");
		list.add("しゅうしょく");
		list.add("ふえる");
		list.add("じゅく");
		list.add("よびこう");
		list.add("おちる");
		list.add("ろうにん");
		list.add("けいこう");
		list.add("さいきん");
		list.add("たしかに");
		list.add("ちょうさ");
		list.add("すく");
		list.add("しょうしか");
		list.add("かんして");
		list.add("こうぎ");
		list.add("としどし");
		list.add("へる");

		
		//lesson4
		list.add("きょか");
		list.add("さいふ");
		list.add("せ");
		list.add("べんごし");
		list.add("めずらしい");
		list.add("ぜんぜん");
		list.add("しゅうと");
		list.add("ちじ");
		list.add("みなさん");
		list.add("もとめる");
		list.add("ぐうぜん");
		list.add("あたたかい");
		list.add("こうよう");
		list.add("おもしろい");
		list.add("けいけん");
		list.add("すむ");
		list.add("けいたい");
		list.add("ねっしんに");
		list.add("うつ");
		list.add("りょうり");
		list.add("もの");
		list.add("たいじゅう");
		list.add("たりる");
		list.add("つたえる");
		
		//lesson3
		list.add("けんきゅうしつ");
		list.add("きまつしけん");
		list.add("すいせんじょう");
		list.add("しょうがくきん");
		list.add("ようし");
		list.add("かみ");
		list.add("しめきり");
		list.add("かす");
		list.add("ねつ");
		list.add("よる");
		list.add("じょうほう");
		list.add("こうかん");
		list.add("ばあい");
		list.add("じゅぎょうりょう");
		list.add("かず");
		list.add("ふつう");
		list.add("えらぶ");
		list.add("しょるいせんこう");
		list.add("めんせつ");
		list.add("せいせき");
		list.add("せいかく");
		list.add("たいど");
		list.add("ゆうせん");
		list.add("たんい");
		list.add("みとめる");
		list.add("こうしょう");
		list.add("べっか");
		list.add("こくさいがくぶ");
		list.add("れきし");
		list.add("けいざい");
		list.add("せいじ");
		list.add("しゅうきょう");
		list.add("かつどう");
		list.add("かてい");
		list.add("きぼうしゃ");
		list.add("じゅうたくじじょう");
		
		//lesson2
		list.add("ことば");
		list.add("えしゃく");
		list.add("あたま");
		list.add("なる");
		list.add("りょう");
		list.add("へや");
		list.add("どうしつ");
		list.add("ねる");
		list.add("おわる");
		list.add("じゅぎょう");
		list.add("おくれる");
		list.add("ふる");
		list.add("いちろう");
		list.add("どうきゅうせい");
		list.add("しつもん");
		list.add("びょうき");
		list.add("ひじょう");
		list.add("さむい");
		list.add("わかれる");
		list.add("かお");
		list.add("いっぱんてき");
		
		//lesson1
		list.add("しょうかい");
		list.add("しゅくだい");
		list.add("いけだ");
		list.add("ともだち");
		list.add("かとう");
		list.add("ぼく");
		list.add("しゅみ");
		list.add("きょうみ");
		list.add("となり");
		list.add("かぞく");
		list.add("あそぶ");
		list.add("ちしきほうふ");
		list.add("ひこうき");
		list.add("すわる");
		list.add("そつぎょう");
		list.add("つとめる");
		list.add("しゅうかん");
		list.add("きゅうか");
		list.add("きょうと");
		list.add("そだつ");
		list.add("ひとばん");
		list.add("りょうしん");
		list.add("めいし");
		list.add("ばんごう");
		list.add("きょう");
		list.add("ごご");
		list.add("じゅうすうじかん");
		list.add("ひずけへんこうせん");
		list.add("くうこう");
		list.add("むかえる");
		list.add("よぶ");
		list.add("じさ");
		list.add("ねむい");
		list.add("つれる");
		list.add("けっきょ");
		list.add("てきとう");
		list.add("ひっこす");
		list.add("わかい");
		list.add("じこ");
		list.add("おたがい");
		list.add("むすめ");
		list.add("ちがう");
	}
	

	private void buttonPressed() 
	{	
		if (state == STARTING) 
		{    // Create and display the first question; change state to FIRST_TRY.
			
			int randomiser = (int) (Math.random()*questionList.size()-1);
			
			question = questionList.get(randomiser);
			display.setText("<html><center><i>問題１</i><br><br><big><b><font color=red>"
					+ question + "</font></b></big></center></html>");
			answerInput.setEnabled(true);
			answerInput.requestFocus();
			button.setText("Check");
			state = FIRST_TRY;
			return;
		}
		
		String userInput = answerInput.getText().trim();  // Get user's input from the input box.
		
		if (userInput.length() == 0) { // Nothing was entered in the box; give an appropriate error message.
			errorMessage("Enter your answer in the input box,\nand then click the Submit button.");
			return;
		}
		
		String userAnswer;
		userAnswer = userInput;

		String response = null;  // This will be the program's feedback to the user about the answer.
		
		if (state == FIRST_TRY) 
		{
			int index = 0;
			for(int i = 0; i<= questionList.size()-1; i++)
			{
				if(questionList.get(i).equals(question))
					index = i;
			}
			
			if (userAnswer.equals(answerList.get(index))) 
			{
				response = "正解！すごいなあ〜";
				correctFirstTry++;
				int randomiser = (int) (Math.random()*questionList.size()-1);
				question = questionList.get(randomiser); 
			}
			else 
			{
				String answer = answerList.get(index);
				response = "残念だ！正解は'"+answer+"'";
				incorrect++;

				File fw = new File("wrongBook.txt");
				PrintWriter pw;
				try {
					pw = new PrintWriter((new FileWriter(fw,true)));
				
					pw.println(question + ": " + answer);
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			int randomiser = (int) (Math.random()*questionList.size()-1);
			question = questionList.get(randomiser);  
			state = FIRST_TRY;
		}
		
		
		
		display.setText("<html><center><i>" + response + "</i><br><br><big><b><font color=red>"
				+ question + "</font></b></big><br><br>"
				+ correctFirstTry + " 正解数<br>"
				+ incorrect + " 残念数</center></html>");
		
		answerInput.selectAll();      // Highlights the contents of the input box.
		answerInput.requestFocus();   // Moves input focus to input box, so user doesn't have to click it.

	} 
	


	private void errorMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Error in Input", JOptionPane.ERROR_MESSAGE);
	}
	
}