
public class Admin {
	private final String idAdmin;
	private final String name;
	private final String lastname;
	private final String email;
	private final String phone;
	private final String address;
	private final String password;
	private char state;
	public static class BuildAdmin implements BuildUser<Admin>{
		//Required parameters 
		private final String name;
		private final String email;
		//Parameters initialized 
		private String idAdmin="";
		private String lastname="";
		private String phone="";
		private String address="";
		private String password="";
		private char state='0';
		public BuildAdmin(String name,String email) {
			this.name=name;
			this.email=email;
		}
		
		public Admin build() {
			// TODO Auto-generated method stub
			return new Admin(this);
		}

		public BuildAdmin setLastName(String lastname) {
			this.setLastname(lastname);
			return this;
		}
		public BuildAdmin setIdAdmin(String idAdmin) {
			this.idAdmin ="AD"+idAdmin;
			return this;
		}

		public BuildAdmin setLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public BuildAdmin setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public BuildAdmin setAddress(String address) {
			this.address = address;
			return this;
		}

		public BuildAdmin setPassword(String password) {
			this.password = password;
			return this;
		}	
	}
	private Admin(BuildAdmin build) {
		this.idAdmin=build.idAdmin;
		this.name=build.name;
		this.lastname=build.lastname;
		this.email=build.email;
		this.password=build.password;
		this.phone=build.phone;
		this.state=build.state;
		this.address=build.address;
	}
	public String getIdAdmin() {
		return idAdmin;
	}
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getPassword() {
		return password;
	}
	public void setState(char c) {
		this.state=c;
	}
	public char getState() {
		return state;
	}
}
