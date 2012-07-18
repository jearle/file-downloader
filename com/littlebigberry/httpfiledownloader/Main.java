package com.littlebigberry.httpfiledownloader;

public class Main implements FileDownloaderDelegate{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
	}
	
	public Main() {
		FileDownloader fileDownloader = new FileDownloader(this);
		fileDownloader.setUrl("http://eoimages.gsfc.nasa.gov/images/imagerecords/45000/45449/Bolivia_amo_2010235_lrg.jpg");
		fileDownloader.setLocalLocation("C:/Users/jesse/Desktop/ppppppppp.jpg");
		fileDownloader.beginDownload();
	}

	@Override
	public void didStartDownload(FileDownloader fileDownloader) {
		System.out.println("Download started");
	}

	@Override
	public void didProgressDownload(FileDownloader fileDownloader) {
		String kbPerSecond = "Calculating...";
		if (fileDownloader.getKbPerSecond() != null) {
			kbPerSecond = fileDownloader.getKbPerSecond() + " kb/s";
		}
		System.out.println(fileDownloader.getPercentComplete() + " at " + kbPerSecond);
	}

	@Override
	public void didFinishDownload(FileDownloader fileDownloader) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void didFailDownload(FileDownloader fileDownloader) {
		// TODO Auto-generated method stub
		
	}

}
