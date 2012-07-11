package com.littlebigberry.httpfiledownloader;

public interface DownloadWorkerDelegate {
	public void  didStartDownload(DownloaderWorker downloaderWorker);
	public void    didReceiveData(DownloaderWorker downloaderWorker, byte[] data, int byteRead);
	public void didFinishDownload(DownloaderWorker downloaderWorker);
	public void   didFailDownload(DownloaderWorker downloaderWorker);
}
