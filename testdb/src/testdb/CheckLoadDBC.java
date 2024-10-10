package testdb;

public class CheckLoadDBC {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		// TODO 自動生成されたメソッド・スタブ
		String msg = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ロード成功";
		} catch (ClassNotFoundException e) {
			msg = "失敗";
		}
		System.out.println(msg);

	}

}
