package ObjectOriental;

public class TvTest {
	
	public static void main(String args[]) {
		
		Tv[] tvArr = new Tv[3]; 	//길이가 3인 Tv객체 배열
		
		// Tv 객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
	}

}

class Tv {
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; //채널
	
	void power() { power = ! power;}	//TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {channel++;}		//TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {channel--;}		//TV의 채널을 낮추는 기능을 하는 메서드
}