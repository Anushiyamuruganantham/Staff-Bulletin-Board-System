import java.util.Date;

public class UserMaster {
	private String userName;
	private String password;
   
    private Date createdDate;
    private Date modifiedDate;
    private String logTag;
    private String type;
    private String status;
    
    
	public UserMaster() {
		super();
	}
	
	public UserMaster(String userName, String password,  Date createdDate, Date modifiedDate,
			String logTag, String type, String status) {
		super();
		this.userName = userName;
		this.password = password;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.logTag = logTag;
		this.type = type;
		this.status = status;
		
	}
	
    
 

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getLogTag() {
		return logTag;
	}
	public void setLogTag(String logTag) {
		this.logTag = logTag;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
    
}
