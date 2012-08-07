File Downloader
===============

A simple asynchronous java file downloader for java.

## How to implement the FileDownloaderDelegate

  Simple! Create a FileDownloader and pass your class that implements FileDowloaderDelegate to it.

  The class needs to implement the following methods:

  * public void didStartDownload(FileDownloader fileDownloader)
  * public void didProgressDownload(FileDownloader fileDownloader)
  * public void didFinishDownload(FileDownloader fileDownloader)
  * public void didFailDownload(FileDownloader fileDownloader)

```java
public class MyClass implements FileDownloaderDelegate {
	void startDownloads(){
		FileDownloader fileDownloader = new FileDownloader(this); // Pass in delegate
																  // as self.
		fileDownloader.setUrl("http://eoimages.gsfc.nasa.gov/images/imagerecords/45000/45449/Bolivia_amo_2010235_lrg.jpg");
		fileDownloader.setLocalLocation("/Users/jesse/Desktop/ppppppppp.jpg");
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
		// do stuff

	}

	@Override
	public void didFailDownload(FileDownloader fileDownloader) {
		// do stuff

	}
}
```

## Useful Methods

```java
// fileDownloader is an initialized FileDownloader

fileDownloader.getKbPerSecond(); // returns String
fileDownloader.fileDownloader.getLocalLocation(); // returns String
fileDownloader.getUrl(); // returns String
fileDownloader.getBytesWritten(); // returns int 
fileDownloader.getTotalTimeToDownload(); // returns String 
fileDownloader.getDownloadBeginTime(); // returns long
fileDownloader.getDownloadEndTime(); // returns long
fileDownloader.getPercentComplete(); // returns String
fileDownloader.isDownloading(); // returns boolean
```