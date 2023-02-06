package kosa.board2;

public class BoardMain {

	public static void main(String[] args) {
		OracleDao oracle = new OracleDao();
		MySQLDao mysql = new MySQLDao();
		
		BoardService service = new BoardService(1, mysql);
		
		service.insertBoard();
	}
}
