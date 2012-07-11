package com.littlebigberry.httpfiledownloader;

public interface FileDownloaderDelegate {
	public void       didStartDownload(FileDownloader fileDownloader);
	public void    didProgressDownload(FileDownloader fileDownloader);
	public void      didFinishDownload(FileDownloader fileDownloader);
	public void        didFailDownload(FileDownloader fileDownloader);
}
