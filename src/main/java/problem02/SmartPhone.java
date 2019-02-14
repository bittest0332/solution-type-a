package problem02;

public class SmartPhone extends MusicPhone {
	
	public String runApp() {
		
		
		return null;
	}

	@Override
	public String playMusic() {
		// TODO Auto-generated method stub
		return "스트리밍";
	}

	@Override
	public String call() {
		// TODO Auto-generated method stub
		return super.call();
	}
	
	public String app() {
		return "앱실행";
	}

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if(function.equals("통화")) {
			System.out.println(call());
		}
		else if (function.equals("음악")) {
			System.out.println(playMusic());
		}
		else if(function.equals("앱")) {
			System.out.println(app());
		}
	}
}