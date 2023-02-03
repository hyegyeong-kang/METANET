package kosa.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;
	
	Video vd = new Video();
	
	public GeneralMember() {}
	
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void rental(Video video) {
		rentalVideo = video;
	}
	

	public void showMemerInfo() {
		System.out.println("회원의 아이디: " + id);
		System.out.println("회원의 이름: " + name);
		System.out.println("회원의 주소: " + address);
		rentalVideo.showVideoInfo();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	public Video getVd() {
		return vd;
	}

	public void setVd(Video vd) {
		this.vd = vd;
	}
}
