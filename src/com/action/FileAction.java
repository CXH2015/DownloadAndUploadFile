package com.action;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

@SuppressWarnings("serial")
public class FileAction extends ActionSupport {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getMyUpload() {
		return myUpload;
	}
	public void setMyUpload(File myUpload) {
		this.myUpload = myUpload;
	}
	public String getMyUploadFileName() {
		return myUploadFileName;
	}
	public void setMyUploadFileName(String myUploadFileName) {
		this.myUploadFileName = myUploadFileName;
	}
	public String getMyUploadContentType() {
		return myUploadContentType;
	}
	public void setMyUploadContentType(String myUploadContentType) {
		this.myUploadContentType = myUploadContentType;
	}
	private File myUpload;
	private String myUploadFileName;
	private String myUploadContentType;
	private String savePath;
	public void setSavePath(String value)
	{
		this.savePath=value;
	}
	public String getSavePath() throws Exception
	{
		String str=ServletActionContext.getServletContext().getRealPath(savePath);
		return str;
	}
	@SuppressWarnings("resource")
	public String  upload() throws Exception{
		String strNewFileName=UUID.randomUUID().toString();
		String suffix=myUploadFileName.substring(myUploadFileName.lastIndexOf("."));
		strNewFileName+=suffix;
		FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+strNewFileName);
		myUploadFileName=strNewFileName;
		FileInputStream fis=new FileInputStream(getMyUpload());
		byte[] buffer=new byte[1024];
		int len=0;
		while((len=fis.read(buffer))>0)
		{
			fos.write(buffer,0,len);
		}
		fos.close();
		return SUCCESS;
	}
}
