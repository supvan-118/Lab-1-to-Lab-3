package ex3;

abstract class MedialItem extends Item{
        private int runtime;

		public MedialItem() {
			super();
			// TODO Auto-generated constructor stub
		}

		public MedialItem(int idNum, String title, int numCopies) {
			super(idNum, title, numCopies);
			// TODO Auto-generated constructor stub
		}

		public MedialItem(int runtime) {
			super();
			this.runtime = runtime;
		}

		public int getRuntime() {
			return runtime;
		}

		@Override
		public int getIdNum() {
			// TODO Auto-generated method stub
			return super.getIdNum();
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return super.getTitle();
		}

		@Override
		public int getNumCopies() {
			// TODO Auto-generated method stub
			return super.getNumCopies();
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("medialitem info");
			super.print();
		}

		@Override
		public void addItem() {
			// TODO Auto-generated method stub
			super.addItem();
		}

		@Override
		public void checkIn() {
			// TODO Auto-generated method stub
			super.checkIn();
		}

		@Override
		public void checkOut() {
			// TODO Auto-generated method stub
			super.checkOut();
		}

		public void setRuntime(int runtime) {
			this.runtime = runtime;
		}
        
}
