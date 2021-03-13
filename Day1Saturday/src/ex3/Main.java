package ex3;

public class Main {
	public static void main(String[] args) {
		Book bk1=new Book(1010,"Ramayana",100,"Valmiki");
		Book bk2=new Book(1011,"Mahabharat",500,"Veda Vyasa");
		JournalPaper jp1=new JournalPaper(115,"Aes-256",12,"Tg4");
		jp1.setYear(2020);
		JournalPaper jp2=new JournalPaper(116,"Rsa algorithm",20,"Tg6");
		jp2.setYear(2021);
		cd cd0=new cd(25,"Geeta Govindam",15);
		Video v=new Video(22,"3 idiots",31);
		bk1.print();
		System.out.println("===******====");
		bk2.print();
		System.out.println("===******====");
		bk1.checkIn();
		
		bk1.print();
		bk1.checkOut();
		bk1.print();
		System.out.println("===******====");
		jp1.print();
		System.out.println("The Author of Journal"+jp1.getAuthor());
		jp1.checkIn();
		jp1.print();
		jp1.checkOut();
		
		System.out.println("year"+jp1.getIdNum());
		System.out.println("===******====");
		cd0.print();
		cd0.setArtist("Rama");
		cd0.setGenre("Thriller");
		cd0.setRuntime(6);
		System.out.println("Artist of this CD is "+cd0.getArtist());
		System.out.println("Genre of this CD is "+cd0.getGenre());
		System.out.println("Run time of CD:"+cd0.getRuntime());
		System.out.println("===******=====");
		v.print();
		v.setDirector("Krishna");
		v.setGenre("Suspense");
		v.setYear(2008);
		v.setRuntime(10);
		System.out.println("Artist of this CD is "+v.getDirector());
		System.out.println("Genre of this CD is "+v.getGenre());
		System.out.println("Genre of this CD is "+v.getYear());
		System.out.println("Run Time of Video:"+v.getRuntime());
	}

}
