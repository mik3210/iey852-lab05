package application.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.javafx.collections.MappingChange.Map;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Park {

	private HashMap<Zone, ArrayList<Dinosaur>> zoneHM;
	private String name;
	private Scanner x;
	Zone zoneB;
	Zone zoneD;
	Zone zoneG;
	Zone zoneR;
	Zone zoneX;
	Zone zoneTY;
	Zone zoneTR;
	ArrayList<Dinosaur> dinoB = new ArrayList<Dinosaur>();
	ArrayList<Dinosaur> dinoD = new ArrayList<Dinosaur>();
	ArrayList<Dinosaur> dinoG = new ArrayList<Dinosaur>();
	ArrayList<Dinosaur> dinoR = new ArrayList<Dinosaur>();
	ArrayList<Dinosaur> dinoX = new ArrayList<Dinosaur>();
	ArrayList<Dinosaur> dinoTY = new ArrayList<Dinosaur>();
	ArrayList<Dinosaur> dinoTR = new ArrayList<Dinosaur>();

	public Park(String name) {
		this.zoneHM = new HashMap<Zone, ArrayList<Dinosaur>>();
		this.name = name;
	}//end of constructor

	public void relocate(TextField textName, TextField textZone,
			Button relocateButton) {
		String x = textName.getText();
		String y = textZone.getText();


	}

	public void save() {

	}

	public String toString() {
		return "Hello" + zoneHM.get(zoneR);
	}

	public void loadZones() {
		String nameOfZone;
		String zoneCode;
		String threatLevel;

		int count = 0;
		openFile("src/data/zones.csv");
		while(x.hasNext()) {
			String a = x.nextLine();
			String tokens[] = a.split(",");
			nameOfZone = tokens[0];
			threatLevel = tokens[1];
			zoneCode = tokens[2];
			
			switch(count) {
			case 0:
				zoneB = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneB, dinoB);
				count++;
				break;
			case 1:
				zoneD = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneD, dinoD);
				count++;
				break;
			case 2:
				zoneG = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneG, dinoG);
				count++;
				break;
			case 3:
				zoneR = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneR, dinoR);
				count++;
				break;
			case 4:
				zoneX = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneX, dinoX);
				count++;
				break;
			case 5:
				zoneTY = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneTY, dinoTY);
				count++;
				break;
			case 6:
				zoneTR = new Zone(nameOfZone, zoneCode, threatLevel);
				zoneHM.put(zoneTR, dinoTR);
				count++;
				break;
			default:
				System.out.println("Should be no more zones, check status");
				break;
			}//end of switch statement

		}//end of while loop
		closeFile();
	}




	public void loadDinosaurs() {
		Dinosaur d;
		String nameOfDinosaur;
		String type;
		String carnivore;
		String zone;
		openFile("src/data/dinos.csv");
		while(x.hasNext()) {
			String a = x.nextLine();
			String tokens[] = a.split(",");
			nameOfDinosaur = tokens[0];
			type = tokens[1];
			carnivore = tokens[2];
			zone = tokens[3];
			if(zoneR.getZoneCode().equals(zone)) {
				d = new Dinosaur(tokens[0], tokens[1],
						tokens[2]);
				dinoR.add(d);
				zoneHM.replace(zoneR, dinoR);
			}
		}

	}

	public void openFile(String fileName) {
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		try {
			x = new Scanner(file); 
		}catch(Exception e) {
			System.out.println("file not found");
		}
	}//end of openFile

	public void closeFile() {
		x.close();
	}//end of closeFile() method

	public HashMap<Zone, ArrayList<Dinosaur>> getZone() {
		return zoneHM;
	}

	public void setZone(HashMap<Zone, ArrayList<Dinosaur>> zone) {
		this.zoneHM = zone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


} //end of Park class
