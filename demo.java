package Dinning_philosopy;
public class demo {

	public static void main(String[] args) {
		Fork f[] = new Fork[5];
		philosoper p[] = new philosoper[5];
		for(int i = 0; i < 5; i++ ) {
			f[i] = new Fork();
		}
		for(int i = 0; i < 5; i++ ) {
			p[i] = new philosoper(i,f[i],f[(i +1) % 5]);
		}
		for(int i = 0; i < 5; i++ ) {
			p[i].start();
		}
		
		
	}

}
