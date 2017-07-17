package com.github.jakubslazyk.springdemo2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	private ArrayList<String> list=new ArrayList<String>();
	@PostConstruct
	public void aDatabaseFortuneService() {
		try {
			File z=new File("D:/fortunes.txt");
			BufferedReader file = new BufferedReader(new FileReader(z));
			//System.out.println(z.exists());
			String temp;
			while((temp=file.readLine())!=null){
				list.add(temp);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File read");
	}
	
	@Override
	public String getFortune() {
		Random rand=new Random();
		return list.get(rand.nextInt(list.size()));
		
	}

}
