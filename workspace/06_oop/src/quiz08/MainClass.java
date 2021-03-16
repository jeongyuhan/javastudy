package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		Producer producer = new Producer();
		
		Singer singer1 = new Singer("alice", 3);
		Singer singer2 = new Singer("emily", 5);
		
		producer.produce(singer1, new Song("", ""));
		producer.produce(singer1, new Song("", ""));
		producer.produce(singer1, new Song("", ""));
		producer.produce(singer1, new Song("", "")); // 최대 3곡 저장가능한 경우 4번째 곡은 추가가 불가능하다.
		
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
	
		singer1.info();
		singer2.info();
		
	}

}
