package ex3;

abstract class Item {
	private int idNum;
	private String title;
	private int numCopies;

	public Item() {
		super();
		idNum = 0;
		title = "";
		numCopies = 0;
	}

	public Item(int idNum, String title, int numCopies) {
		super();
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumCopies() {
		return numCopies;
	}

	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}

	public void checkIn() {
		numCopies = numCopies + 1;
	}

	public void checkOut() {
		numCopies = numCopies - 1;
	}

	public void addItem(int idNum, String str, int n) {
		setIdNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

	public String toString() {
		return "ID:" + idNum + "Titlt:" + title + "Number of Copies:" + numCopies;
	}

	public void print() {
		System.out.println("title: " + title);
		System.out.println("Id: " + idNum);
		System.out.println("Number of Copies: " + numCopies);
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (idNum != other.idNum)
			return false;
		if (numCopies != other.numCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public void addItem() {
		numCopies++;
	}
}