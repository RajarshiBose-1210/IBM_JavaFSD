class Person {

		private String name;
		private int age;
		
		public Person() {
			// TODO Auto-generated constructor stub
			this("Anonymous",-1);
		}
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public void print() {
			
			System.out.println("Name:"+name+"\t Age:"+age);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ("Name:"+name+"\t Age:"+age);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Person) {
			// TODO Auto-generated method stub
			Person p=(Person) obj;
			if(p.name.equals(this.name)&&p.age==this .age)
				return true;
			
		}
			return false;
		}

			
		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("Person is no more.");
		}

		public static void main(String[] args) {
			
			
			
			Person p=null;
			for(int c=1;c<=5;c++)
				p=new Person();
			System.gc();
			Person p1=new Person("ABCD", 21);
						//p1.print();
						
			Person p2=new Person();
		//	p2.print();
			System.out.println(p2.hashCode());
			System.out.println(p1.toString());
			System.out.println(p1.equals(p2));
			
		}
		
		
}