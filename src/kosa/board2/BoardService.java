package kosa.board2;

public class BoardService {
	private int id;
	private Dao dao;
	
	public BoardService() {}

	public BoardService(int id, Dao dao) {
		super();
		this.id = id;
		this.dao = dao;
	}
	
	public void insertBoard() {
		dao.insert();
	}

}
