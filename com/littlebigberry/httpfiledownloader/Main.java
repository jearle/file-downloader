package com.littlebigberry.httpfiledownloader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileDownloader fileDownloader = new FileDownloader(null);
		fileDownloader.setUrl("http://eoimages.gsfc.nasa.gov/images/imagerecords/45000/45449/Bolivia_amo_2010235_lrg.jpg");
		fileDownloader.setLocalLocation("C:/Users/jesse/Desktop/ppppppppp.jpg");
		fileDownloader.beginDownload();
	}

}
