package com.fm.mdtc.filesync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MdtcFileSyncApplication {

	public static void main(String[] args) {
		System.out.println("Starting application...");
		SpringApplication.run(MdtcFileSyncApplication.class, args);
	}

}
