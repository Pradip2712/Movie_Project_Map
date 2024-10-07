package com.pdp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pdp.movie.ActorInfo;

public class Dao {

	public Map<String, List<ActorInfo>> actorsData() {

		List<ActorInfo> movie1 = new ArrayList<ActorInfo>();
		movie1.add(new ActorInfo("Akshay Kumar", "male", 52, "09-09-1967", "Good Newwz", 2019, "hindi"));
		movie1.add(new ActorInfo("Kareena Kapoor", "female", 39, "21-09-1980", "Good Newwz", 2019, "hindi"));
		movie1.add(new ActorInfo("Diljit Dosanjh", "male", 35, "06-01-1984", "Good Newwz", 2019, "hindi"));
		movie1.add(new ActorInfo("Kiara Advani", "female", 27, "31-07-1992", "Good Newwz", 2019, "hindi"));
		movie1.add(new ActorInfo("Adil Hussain", "male", 56, "05-10-1963", "Good Newwz", 2019, "hindi"));

		List<ActorInfo> movie2 = new ArrayList<ActorInfo>();
		movie2.add(new ActorInfo("Shahrukh Khan", "male", 55, "02-11-1965", "Dilwale", 2015, "hindi"));
		movie2.add(new ActorInfo("Kajol", "female", 45, "05-08-1974", "Dilwale", 2015, "hindi"));
		movie2.add(new ActorInfo("Varun Dhawan", "male", 33, "24-04-1987", "Dilwale", 2015, "hindi"));
		movie2.add(new ActorInfo("Kriti Sanon", "female", 30, "27-07-1990", "Dilwale", 2015, "hindi"));
		movie2.add(new ActorInfo("Johnny Lever", "male", 63, "14-08-1957", "Dilwale", 2015, "hindi"));

		List<ActorInfo> movie3 = new ArrayList<ActorInfo>();
		movie3.add(new ActorInfo("Aamir Khan", "male", 55, "14-03-1965", "Dangal", 2016, "hindi"));
		movie3.add(new ActorInfo("Fatima Sana Shaikh", "female", 28, "11-01-1992", "Dangal", 2016, "hindi"));
		movie3.add(new ActorInfo("Sanya Malhotra", "female", 28, "25-02-1992", "Dangal", 2016, "hindi"));
		movie3.add(new ActorInfo("Sakshi Tanwar", "female", 47, "12-01-1973", "Dangal", 2016, "hindi"));
		movie3.add(new ActorInfo("Aparshakti Khurana", "male", 33, "18-11-1987", "Dangal", 2016, "hindi"));

		List<ActorInfo> movie4 = new ArrayList<ActorInfo>();
		// Movie 2: "Animal" (2023, Hindi)
		movie4.add(new ActorInfo("Ranbir Kapoor", "male", 41, "28-09-1982", "Animal", 2023, "hindi"));
		movie4.add(new ActorInfo("Anil Kapoor", "male", 66, "24-12-1956", "Animal", 2023, "hindi"));
		movie4.add(new ActorInfo("Rashmika Mandanna", "female", 27, "05-04-1996", "Animal", 2023, "hindi"));
		movie4.add(new ActorInfo("Bobby Deol", "male", 56, "27-01-1967", "Animal", 2023, "hindi"));
		movie4.add(new ActorInfo("Parineeti Chopra", "female", 35, "22-10-1988", "Animal", 2023, "hindi"));
		movie4.add(new ActorInfo("Tripti Dimri", "female", 29, "23-02-1994", "Animal", 2023, "hindi"));
		movie4.add(new ActorInfo("Shakti Kapoor", "male", 71, "03-09-1952", "Animal", 2023, "hindi"));

		List<ActorInfo> movie5 = new ArrayList<ActorInfo>();
		movie5.add(new ActorInfo("Riteish Deshmukh", "male", 41, "17-12-1978", "Lai Bhaari", 2014, "marathi"));
		movie5.add(new ActorInfo("Radhika Apte", "female", 35, "07-09-1985", "Lai Bhaari", 2014, "marathi"));
		movie5.add(new ActorInfo("Salman Khan", "male", 54, "27-12-1965", "Lai Bhaari", 2014, "marathi"));
		movie5.add(new ActorInfo("Tanvi Azmi", "female", 60, "09-11-1960", "Lai Bhaari", 2014, "marathi"));
		movie5.add(new ActorInfo("Genelia D'Souza", "female", 33, "05-08-1987", "Lai Bhaari", 2014, "marathi"));

		List<ActorInfo> movie6 = new ArrayList<ActorInfo>();
		// Movie 3: "Ganapath: Part 1" (2023, Hindi)
		movie6.add(new ActorInfo("Tiger Shroff", "male", 33, "02-03-1990", "Ganapath: Part 1", 2023, "hindi"));
		movie6.add(new ActorInfo("Kriti Sanon", "female", 33, "27-07-1990", "Ganapath: Part 1", 2023, "hindi"));
		movie6.add(new ActorInfo("Amitabh Bachchan", "male", 81, "11-10-1942", "Ganapath: Part 1", 2023, "hindi"));
		movie6.add(new ActorInfo("Rahul Dev", "male", 54, "27-09-1969", "Ganapath: Part 1", 2023, "hindi"));
		movie6.add(new ActorInfo("Elli AvrRam", "female", 33, "29-07-1990", "Ganapath: Part 1", 2023, "hindi"));
		movie6.add(new ActorInfo("Girish Kulkarni", "male", 45, "25-11-1977", "Ganapath: Part 1", 2023, "hindi"));
		movie6.add(new ActorInfo("Jameel Khan", "male", 56, "31-12-1967", "Ganapath: Part 1", 2023, "hindi"));

		List<ActorInfo> movie7 = new ArrayList<ActorInfo>();
		// Movie 4: "Fighter" (2024, Hindi)
		movie7.add(new ActorInfo("Hrithik Roshan", "male", 50, "10-01-1974", "Fighter", 2024, "hindi"));
		movie7.add(new ActorInfo("Deepika Padukone", "female", 38, "05-01-1986", "Fighter", 2024, "hindi"));
		movie7.add(new ActorInfo("Anil Kapoor", "male", 66, "24-12-1956", "Fighter", 2024, "hindi"));
		movie7.add(new ActorInfo("Karan Singh Grover", "male", 41, "23-02-1982", "Fighter", 2024, "hindi"));
		movie7.add(new ActorInfo("Akshay Oberoi", "male", 38, "01-01-1985", "Fighter", 2024, "hindi"));
		movie7.add(new ActorInfo("Kumud Mishra", "male", 47, "12-03-1976", "Fighter", 2024, "hindi"));
		movie7.add(new ActorInfo("Sanjana Sanghi", "female", 27, "02-09-1996", "Fighter", 2024, "hindi"));

		List<ActorInfo> movie8 = new ArrayList<ActorInfo>();
		// Movie 5: "Baap" (2023, Hindi)
		movie8.add(new ActorInfo("Sunny Deol", "male", 66, "19-10-1956", "Baap", 2023, "hindi"));
		movie8.add(new ActorInfo("Mithun Chakraborty", "male", 73, "16-06-1950", "Baap", 2023, "hindi"));
		movie8.add(new ActorInfo("Sanjay Dutt", "male", 64, "29-07-1959", "Baap", 2023, "hindi"));
		movie8.add(new ActorInfo("Jackie Shroff", "male", 66, "01-02-1957", "Baap", 2023, "hindi"));
		movie8.add(new ActorInfo("Karan Kapadia", "male", 30, "16-09-1993", "Baap", 2023, "hindi"));
		movie8.add(new ActorInfo("Manjari Fadnnis", "female", 39, "10-07-1984", "Baap", 2023, "hindi"));
		movie8.add(new ActorInfo("Deepak Shirke", "male", 72, "15-04-1951", "Baap", 2023, "hindi"));

		List<ActorInfo> movie9 = new ArrayList<ActorInfo>();
		movie9.add(new ActorInfo("Shah Rukh Khan", "male", 58, "02-11-1965", "Jawan", 2023, "hindi"));
		movie9.add(new ActorInfo("Nayanthara", "female", 39, "18-11-1984", "Jawan", 2023, "hindi"));
		movie9.add(new ActorInfo("Vijay Sethupathi", "male", 45, "16-01-1978", "Jawan", 2023, "hindi"));
		movie9.add(new ActorInfo("Deepika Padukone", "female", 37, "05-01-1986", "Jawan", 2023, "hindi"));
		movie9.add(new ActorInfo("Sanya Malhotra", "female", 31, "25-02-1992", "Jawan", 2023, "hindi"));
		movie9.add(new ActorInfo("Priyamani", "female", 39, "04-06-1984", "Jawan", 2023, "hindi"));
		movie9.add(new ActorInfo("Sunil Grover", "male", 46, "03-08-1977", "Jawan", 2023, "hindi"));

		List<ActorInfo> movie10 = new ArrayList<ActorInfo>();
		movie10.add(new ActorInfo("Prabhas", "male", 44, "23-10-1979", "Salaar", 2024, "hindi"));
		movie10.add(new ActorInfo("Shruti Haasan", "female", 37, "28-01-1986", "Salaar", 2024, "hindi"));
		movie10.add(new ActorInfo("Prithviraj Sukumaran", "male", 40, "16-10-1983", "Salaar", 2024, "hindi"));
		movie10.add(new ActorInfo("Jagapathi Babu", "male", 62, "12-02-1962", "Salaar", 2024, "hindi"));
		movie10.add(new ActorInfo("Vasishta N. Simha", "male", 33, "19-04-1990", "Salaar", 2024, "hindi"));
		movie10.add(new ActorInfo("Madhu Guruswamy", "male", 40, "18-07-1983", "Salaar", 2024, "hindi"));
		movie10.add(new ActorInfo("Tinnu Anand", "male", 78, "12-10-1945", "Salaar", 2024, "hindi"));

		List<ActorInfo> movie11 = new ArrayList<ActorInfo>();
		movie11.add(new ActorInfo("Ajay Devgn", "male", 55, "02-04-1969", "Maidaan", 2023, "hindi"));
		movie11.add(new ActorInfo("Priyamani", "female", 39, "04-06-1984", "Maidaan", 2023, "hindi"));
		movie11.add(new ActorInfo("Rudranil Ghosh", "male", 49, "06-12-1974", "Maidaan", 2023, "hindi"));
		movie11.add(new ActorInfo("Gajraj Rao", "male", 53, "11-01-1971", "Maidaan", 2023, "hindi"));
		movie11.add(new ActorInfo("Boman Irani", "male", 64, "02-12-1959", "Maidaan", 2023, "hindi"));
		movie11.add(new ActorInfo("Abhinay Raj Singh", "male", 34, "05-09-1989", "Maidaan", 2023, "hindi"));
		movie11.add(new ActorInfo("Nitanshi Goel", "female", 16, "12-06-2008", "Maidaan", 2023, "hindi"));

		List<ActorInfo> movie12 = new ArrayList<ActorInfo>();
		movie12.add(new ActorInfo("Irrfan Khan", "male", 53, "07-01-1967", "Angrezi Medium", 2020, "hindi"));
		movie12.add(new ActorInfo("Kareena Kapoor", "female", 40, "21-09-1980", "Angrezi Medium", 2020, "hindi"));
		movie12.add(new ActorInfo("Radhika Madan", "female", 26, "01-05-1995", "Angrezi Medium", 2020, "hindi"));
		movie12.add(new ActorInfo("Deepak Dobriyal", "male", 45, "01-09-1975", "Angrezi Medium", 2020, "hindi"));
		movie12.add(new ActorInfo("Dimple Kapadia", "female", 63, "08-06-1957", "Angrezi Medium", 2020, "hindi"));
		movie12.add(new ActorInfo("Ranvir Shorey", "male", 47, "18-08-1972", "Angrezi Medium", 2020, "hindi"));
		movie12.add(new ActorInfo("Pankaj Tripathi", "male", 44, "05-09-1976", "Angrezi Medium", 2020, "hindi"));

		List<ActorInfo> movie13 = new ArrayList<ActorInfo>();
		movie13.add(new ActorInfo("Rajkummar Rao", "male", 36, "31-08-1984", "Roohi", 2021, "hindi"));
		movie13.add(new ActorInfo("Janhvi Kapoor", "female", 24, "06-03-1997", "Roohi", 2021, "hindi"));
		movie13.add(new ActorInfo("Varun Sharma", "male", 31, "04-02-1990", "Roohi", 2021, "hindi"));
		movie13.add(new ActorInfo("Manav Vij", "male", 44, "01-01-1977", "Roohi", 2021, "hindi"));
		movie13.add(new ActorInfo("Alexx O'Nell", "male", 42, "26-07-1978", "Roohi", 2021, "hindi"));
		movie13.add(new ActorInfo("Sarita Joshi", "female", 80, "17-10-1941", "Roohi", 2021, "hindi"));
		movie13.add(new ActorInfo("Seema Pahwa", "female", 58, "10-02-1962", "Roohi", 2021, "hindi"));

		List<ActorInfo> movie14 = new ArrayList<ActorInfo>();
		movie14.add(new ActorInfo("Ayushmann Khurrana", "male", 36, "14-09-1984", "Gulabo Sitabo", 2020, "hindi"));
		movie14.add(new ActorInfo("Amitabh Bachchan", "male", 78, "11-10-1942", "Gulabo Sitabo", 2020, "hindi"));
		movie14.add(new ActorInfo("Vijay Raaz", "male", 58, "05-06-1963", "Gulabo Sitabo", 2020, "hindi"));
		movie14.add(new ActorInfo("Brijendra Kala", "male", 53, "12-10-1967", "Gulabo Sitabo", 2020, "hindi"));
		movie14.add(new ActorInfo("Farrukh Jafar", "female", 88, "1932", "Gulabo Sitabo", 2020, "hindi"));
		movie14.add(new ActorInfo("Srishti Shrivastava", "female", 30, "21-09-1990", "Gulabo Sitabo", 2020, "hindi"));
		movie14.add(new ActorInfo("Poornima Sharma", "female", 33, "14-05-1987", "Gulabo Sitabo", 2020, "hindi"));

		List<ActorInfo> movie15 = new ArrayList<ActorInfo>();
		movie15.add(new ActorInfo("Salman Khan", "male", 55, "27-12-1965", "Radhe", 2021, "hindi"));
		movie15.add(new ActorInfo("Disha Patani", "female", 29, "13-06-1992", "Radhe", 2021, "hindi"));
		movie15.add(new ActorInfo("Randeep Hooda", "male", 44, "20-08-1976", "Radhe", 2021, "hindi"));
		movie15.add(new ActorInfo("Jackie Shroff", "male", 64, "01-02-1957", "Radhe", 2021, "hindi"));
		movie15.add(new ActorInfo("Gautam Gulati", "male", 36, "27-11-1984", "Radhe", 2021, "hindi"));
		movie15.add(new ActorInfo("Arjun Kanungo", "male", 30, "06-09-1990", "Radhe", 2021, "hindi"));
		movie15.add(new ActorInfo("Sang Hoon Lee", "male", 28, "16-07-1992", "Radhe", 2021, "hindi"));

		List<ActorInfo> movie16 = new ArrayList<ActorInfo>();
		movie16.add(new ActorInfo("Varun Dhawan", "male", 30, "24-04-1987", "Badrinath Ki Dulhania", 2017, "hindi"));
		movie16.add(new ActorInfo("Alia Bhatt", "female", 24, "15-03-1993", "Badrinath Ki Dulhania", 2017, "hindi"));
		movie16.add(new ActorInfo("Sahil Vaid", "male", 31, "24-09-1986", "Badrinath Ki Dulhania", 2017, "hindi"));
		movie16.add(new ActorInfo("Gauahar Khan", "female", 36, "23-08-1983", "Badrinath Ki Dulhania", 2017, "hindi"));
		movie16.add(new ActorInfo("Shweta Basu Prasad", "female", 26, "11-01-1991", "Badrinath Ki Dulhania", 2017,
				"hindi"));
		movie16.add(
				new ActorInfo("Aakanksha Singh", "female", 27, "30-07-1990", "Badrinath Ki Dulhania", 2017, "hindi"));
		movie16.add(
				new ActorInfo("Aparshakti Khurana", "male", 29, "18-11-1987", "Badrinath Ki Dulhania", 2017, "hindi"));

		List<ActorInfo> movie17 = new ArrayList<ActorInfo>();
		movie17.add(new ActorInfo("Ranveer Singh", "male", 33, "06-07-1985", "Simmba", 2018, "hindi"));
		movie17.add(new ActorInfo("Sara Ali Khan", "female", 25, "12-08-1995", "Simmba", 2018, "hindi"));
		movie17.add(new ActorInfo("Sonu Sood", "male", 45, "30-07-1973", "Simmba", 2018, "hindi"));
		movie17.add(new ActorInfo("Ashutosh Rana", "male", 51, "10-11-1967", "Simmba", 2018, "hindi"));
		movie17.add(new ActorInfo("Siddharth Jadhav", "male", 37, "23-10-1981", "Simmba", 2018, "hindi"));
		movie17.add(new ActorInfo("Vijay Patkar", "male", 56, "29-05-1967", "Simmba", 2018, "hindi"));
		movie17.add(new ActorInfo("Ulka Gupta", "female", 21, "12-04-1997", "Simmba", 2018, "hindi"));

		List<ActorInfo> movie18 = new ArrayList<ActorInfo>();
		movie18.add(new ActorInfo("Ayushmann Khurrana", "male", 33, "14-09-1984", "Badhaai Ho", 2018, "hindi"));
		movie18.add(new ActorInfo("Neena Gupta", "female", 59, "04-06-1959", "Badhaai Ho", 2018, "hindi"));
		movie18.add(new ActorInfo("Gajraj Rao", "male", 48, "11-01-1971", "Badhaai Ho", 2018, "hindi"));
		movie18.add(new ActorInfo("Sanya Malhotra", "female", 26, "25-02-1992", "Badhaai Ho", 2018, "hindi"));
		movie18.add(new ActorInfo("Surekha Sikri", "female", 73, "19-04-1945", "Badhaai Ho", 2018, "hindi"));
		movie18.add(new ActorInfo("Sheeba Chaddha", "female", 45, "17-10-1973", "Badhaai Ho", 2018, "hindi"));
		movie18.add(new ActorInfo("Shardul Rana", "male", 26, "21-05-1992", "Badhaai Ho", 2018, "hindi"));

		List<ActorInfo> movie19 = new ArrayList<ActorInfo>();
		movie19.add(new ActorInfo("Yash", "male", 36, "08-01-1986", "KGF: Chapter 2", 2022, "hindi"));
		movie19.add(new ActorInfo("Sanjay Dutt", "male", 63, "29-07-1959", "KGF: Chapter 2", 2022, "hindi"));
		movie19.add(new ActorInfo("Raveena Tandon", "female", 47, "26-10-1974", "KGF: Chapter 2", 2022, "hindi"));
		movie19.add(new ActorInfo("Srinidhi Shetty", "female", 29, "21-10-1992", "KGF: Chapter 2", 2022, "hindi"));
		movie19.add(new ActorInfo("Prakash Raj", "male", 57, "26-03-1965", "KGF: Chapter 2", 2022, "hindi"));
		movie19.add(new ActorInfo("Achyuth Kumar", "male", 54, "08-03-1968", "KGF: Chapter 2", 2022, "hindi"));
		movie19.add(new ActorInfo("Malavika Avinash", "female", 45, "28-01-1977", "KGF: Chapter 2", 2022, "hindi"));

		List<ActorInfo> movie20 = new ArrayList<ActorInfo>();
		movie20.add(new ActorInfo("Kartik Aaryan", "male", 31, "22-11-1990", "Bhool Bhulaiyaa 2", 2022, "hindi"));
		movie20.add(new ActorInfo("Kiara Advani", "female", 30, "31-07-1992", "Bhool Bhulaiyaa 2", 2022, "hindi"));
		movie20.add(new ActorInfo("Tabu", "female", 50, "04-11-1970", "Bhool Bhulaiyaa 2", 2022, "hindi"));
		movie20.add(new ActorInfo("Rajpal Yadav", "male", 51, "16-03-1971", "Bhool Bhulaiyaa 2", 2022, "hindi"));
		movie20.add(new ActorInfo("Sanjay Mishra", "male", 59, "06-10-1963", "Bhool Bhulaiyaa 2", 2022, "hindi"));
		movie20.add(new ActorInfo("Amar Upadhyay", "male", 46, "01-08-1976", "Bhool Bhulaiyaa 2", 2022, "hindi"));
		movie20.add(new ActorInfo("Milind Gunaji", "male", 60, "23-07-1963", "Bhool Bhulaiyaa 2", 2022, "hindi"));

		Map<String, List<ActorInfo>> map = new HashMap<>();
		map.put("Good Newwz", movie1);
		map.put("Dilwale", movie2);
		map.put("Dangal", movie3);
		map.put("Animal", movie4);
		map.put("Lai Bhaari", movie5);
		map.put("Ganapath: Part 1", movie6);
		map.put("Fighter", movie7);
		map.put("Baap", movie8);
		map.put("Jawan", movie9);
		map.put("Salaar", movie10);
		map.put("Maidaan", movie11);
		map.put("Angrezi Medium", movie12);
		map.put("Roohi", movie13);
		map.put("Gulabo Sitabo", movie14);
		map.put("Radhe", movie15);
		map.put("Badrinath Ki Dulhania", movie16);
		map.put("Simmba", movie17);
		map.put("Badhaai Ho", movie18);
		map.put("KGF: Chapter 2", movie19);
		map.put("Bhool Bhulaiyaa 2", movie20);

		return map;
	}

}
