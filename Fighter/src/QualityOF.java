
public class QualityOF
	{
public static void lineWrote(String text, int time) {
	System.out.println(text);
	try {
		Thread.sleep(time);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	}
