package com.selenium.tests;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoRecording {

	private static ScreenRecorder screenRecorder;

	public static void main(String[] args) throws IOException, AWTException,
			InterruptedException {
		GraphicsConfiguration gconfig = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration();

		screenRecorder = new ScreenRecorder(gconfig, new Format(MediaTypeKey,
				MediaType.FILE, MimeTypeKey, MIME_AVI), new Format(
				MediaTypeKey, MediaType.VIDEO, EncodingKey,
				ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, CompressorNameKey,
				ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, (int) 24,
				FrameRateKey, Rational.valueOf(15), QualityKey, 1.0f,
				KeyFrameIntervalKey, (int) (15 * 60)), new Format(MediaTypeKey,
				MediaType.VIDEO, EncodingKey, "yellow", FrameRateKey,
				Rational.valueOf(30)), null);

		// Start Capturing the Video
		screenRecorder.start();

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("testing");
		element.submit();
		Thread.sleep(5000);
		System.out.println("Page title is: " + driver.getTitle());
		driver.close();
		driver.quit();

		// Stop the ScreenRecorder
		screenRecorder.stop();
	}

}