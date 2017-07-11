package cn.datawe.common;

import java.io.InputStream;

import com.lrt.framework.core.pojos.PrintableAndSerializeableDTO;

public class Attachment extends PrintableAndSerializeableDTO {

	private static final long serialVersionUID = -3762283627307226564L;

	String fileName;// 文件名(格式: 111.gif)

	String newFileName;// 新文件名(格式: 111.gif)

	String fileExt;// 文件扩展名(通过文件名分析获取)(格式: .gif)

	String fileType;// 文件类型(通过文件输入流分析获取)(格式: gif)

	String filePath;// 文件路径(格式: c:\aaa\bbb)

	Long fileSize;// 文件大小(单位: 字节)

	InputStream fileInputStream;// 文件输入流

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{文件名:");
		sb.append(getFileName());
		sb.append(",新文件名:");
		sb.append(getNewFileName());
		sb.append(",扩展名:");
		sb.append(getFileExt());
		sb.append(",文件类型:");
		sb.append(getFileType());
		sb.append(",文件路径:");
		sb.append(getFilePath());
		sb.append(",文件大小(字节):");
		sb.append(getFileSize());
		sb.append("}");
		return sb.toString();
	}
}
